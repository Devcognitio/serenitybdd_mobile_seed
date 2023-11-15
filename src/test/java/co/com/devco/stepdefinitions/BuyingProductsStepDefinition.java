package co.com.devco.stepdefinitions;

import co.com.devco.tasks.AddProduct;
import co.com.devco.tasks.AddProducts;
import co.com.devco.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static co.com.devco.tasks.Checkout.checkout;
import static co.com.devco.userinterface.CheckoutCompletadoPage.LBL_CHECKOUT_COMPLETE;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BuyingProductsStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) signed-in SwagLabs app$")
    public void actorWantsBuyShirts(String actor) {
        theActorCalled(actor).attemptsTo(Login.atSwagLabs());
    }

    @When("He puts in the cart the {string}")
    public void actorPutShirtCart(String nameProduct) {
        theActorInTheSpotlight().attemptsTo(AddProduct.toTheCart(nameProduct));
    }

    @When("He puts in the cart these products")
    public void actorPutShirtCart(List<Map<String, String>> products) {
        theActorInTheSpotlight().attemptsTo(AddProducts.toCart(products));
    }

    @And("He does the checkout of his purchase")
    public void checkoutPurchase() {
        theActorInTheSpotlight().attemptsTo(checkout());
    }

    @Then("He should see the message {string}")
    public void actorShouldSeeCheckout(String confirmationMessage) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_CHECKOUT_COMPLETE).text().contains(confirmationMessage));
    }
}
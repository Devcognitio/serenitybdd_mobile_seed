package co.com.devco.stepdefinitions;

import co.com.devco.models.ProductRecord;
import co.com.devco.tasks.AddProducts;
import co.com.devco.tasks.Select;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;

public class BuyingProductsStepDefinition {

    Actor actor = new Actor("Juan");

    @Given("^add products to the cart$")
    public void addProductsCart(ProductRecord products) {
        actor.attemptsTo(
                Select.theProducts(products),
                AddProducts.toCart()
        );
    }
}
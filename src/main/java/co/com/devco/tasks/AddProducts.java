package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static co.com.devco.userinterface.HomePage.LBL_NAME_PRODUCT;
import static co.com.devco.userinterface.ProductPage.BTN_ADD_TO_CART;
import static co.com.devco.userinterface.ProductPage.BTN_BACK_TO_HOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task {

    private List<Map<String, String>> nameProduct;

    public AddProducts(List<Map<String, String>> nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        IntStream.range(0, nameProduct.size())
                .forEach(
                        (product) ->
                                actor.attemptsTo(
                                        Click.on(LBL_NAME_PRODUCT.of(nameProduct.get(product).get("products"))),
                                        Click.on(BTN_ADD_TO_CART),
                                        Click.on(BTN_BACK_TO_HOME)));
    }

    public static Performable toCart(List<Map<String, String>> nameProduct){
        return instrumented(AddProducts.class, nameProduct);
    }
}

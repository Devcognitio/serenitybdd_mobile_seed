package co.com.devco.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import static co.com.devco.userinterface.ProductPage.BTN_BACK_TO_HOME;

public class AddProducts {
    public static Performable toCart(List<Map<String, String>> nameProduct) {
        return Task.where(
                actor -> {
                    IntStream.range(0, nameProduct.size())
                            .forEach(
                                    (product) ->
                                            actor.attemptsTo(
                                                    AddProduct.toTheCart(nameProduct.get(product).get("products")),
                                                    Click.on(BTN_BACK_TO_HOME))
                                            );
                }
        );
    }
}

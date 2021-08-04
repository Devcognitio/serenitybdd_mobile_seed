package co.com.devco.tasks;

import co.com.devco.models.ProductRecord;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.ProductsPage.LBL_TYPE_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Task {
    private ProductRecord products;

    public Select(ProductRecord products){
        this.products = products;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_TYPE_PRODUCT.of(products.shirt())),
                Click.on(LBL_TYPE_PRODUCT.of(products.tennis()))
        );
    }

    public static Select theProducts(ProductRecord products){
        return instrumented(Select.class, products);
    }
}

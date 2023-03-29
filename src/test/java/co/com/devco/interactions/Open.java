package co.com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.ProductPage.BTN_OPEN_SHOP_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Open implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on(BTN_OPEN_SHOP_CART) );
    }

    public static Performable shoppingCart(){
        return instrumented(Open.class);
    }
}

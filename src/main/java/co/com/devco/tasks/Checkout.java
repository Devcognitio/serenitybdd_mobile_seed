package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.com.devco.userinterface.CheckoutPage.*;
import static co.com.devco.userinterface.ProductPage.BTN_OPEN_SHOP_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Checkout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_OPEN_SHOP_CART),
                Scroll.to(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT),
                Enter.theValue("Juan").into(TXT_NAME),
                Enter.theValue("Fernandez").into(TXT_LAST_NAME),
                SendKeys.of("050005").into(TXT_POST_CODE),
                Click.on(BTN_CONTINUE),
                Scroll.to(BTN_FINISH),
                Click.on(BTN_FINISH));
    }

    public static Performable checkout() {
        return instrumented(Checkout.class);
    }
}

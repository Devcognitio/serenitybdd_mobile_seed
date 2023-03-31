package co.com.devco.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import static co.com.devco.userinterface.CheckoutPage.*;
import static co.com.devco.userinterface.ProductPage.BTN_OPEN_SHOP_CART;

public class Checkout{

    public static Performable checkout() {
        return Task.where(
                Click.on(BTN_OPEN_SHOP_CART),
                Click.on(BTN_CHECKOUT),
                Enter.theValue("Juan").into(TXT_NAME),
                Enter.theValue("Fernandez").into(TXT_LAST_NAME),
                SendKeys.of("050005").into(TXT_POST_CODE),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINISH)
        );
    }
}

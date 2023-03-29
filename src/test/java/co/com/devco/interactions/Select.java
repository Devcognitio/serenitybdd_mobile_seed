package co.com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.ProductPage.BTN_BACK_TO_HOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_BACK_TO_HOME));
    }

    public static Performable shoppingCart(){
        return instrumented(Select.class);
    }
}

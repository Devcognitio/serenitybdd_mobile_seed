package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USERNAME,isEnabled()).forNoMoreThan(5).seconds(),
                Type.theValue("standard_user").into(TXT_USERNAME),
                Type.theValue("secret_sauce").into(TXT_PASSWORD),
                Click.on(BTN_LOGIN));
    }

    public static Performable atSwagLabs(){
        return instrumented(Login.class);
    }
}

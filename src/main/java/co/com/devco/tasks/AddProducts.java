package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static AddProducts toCart() {
        return instrumented(AddProducts.class);
    }
}

package co.com.devco.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.devco.userinterface.HomePage.LBL_NAME_PRODUCT;
import static co.com.devco.userinterface.ProductPage.BTN_ADD_TO_CART;

public class AddProduct{

    public static Task toTheCart(String nameProduct) {
        return Task.where(
                Scroll.to(LBL_NAME_PRODUCT.of(nameProduct)),
                Click.on(LBL_NAME_PRODUCT.of(nameProduct)),
                Scroll.to(BTN_ADD_TO_CART),
                Click.on(BTN_ADD_TO_CART)
        );
    }

}

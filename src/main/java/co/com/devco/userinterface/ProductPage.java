package co.com.devco.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target BTN_ADD_TO_CART = Target.the("Button Add Product to Cart").located(AppiumBy.accessibilityId("test-ADD TO CART"));
    public static final Target BTN_BACK_TO_HOME= Target.the("Button Back to the Home").located(AppiumBy.accessibilityId("test-BACK TO PRODUCTS"));
    public static final Target BTN_OPEN_SHOP_CART= Target.the("Button Cart").located(AppiumBy.accessibilityId("test-Cart"));
}

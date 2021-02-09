package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target BTN_ADD_TO_CART = Target.the("Button Add Product to Cart").located(MobileBy.AccessibilityId("test-ADD TO CART"));
    public static final Target BTN_BACK_TO_HOME= Target.the("Button Back to the Home").located(MobileBy.AccessibilityId("test-BACK TO PRODUCTS"));
    public static final Target BTN_OPEN_SHOP_CART= Target.the("Button Cart").located(MobileBy.AccessibilityId("test-Cart"));
}

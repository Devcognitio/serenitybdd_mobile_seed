package co.com.devco.userinterface;


import co.com.devco.automation.mobile.locator.Locator;
import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class ProductPage {

    public static final Locator BTN_ADD_TO_CART_LOCATOR = locator().withAndroidId("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ADD TO CART\").instance(0))").withIosId("ADD TO CART");

    public static final Target BTN_ADD_TO_CART = Target.the("Button Add Product to Cart").located(theElementBy(BTN_ADD_TO_CART_LOCATOR));
    public static final Target BTN_BACK_TO_HOME = Target.the("Button Back to the Home").locatedForAndroid(AppiumBy.accessibilityId("test-BACK TO PRODUCTS")).locatedForIOS(AppiumBy.accessibilityId("test-BACK TO PRODUCTS"));
    public static final Target BTN_OPEN_SHOP_CART = Target.the("Button Cart").locatedForAndroid(AppiumBy.accessibilityId("test-Cart")).locatedForIOS(AppiumBy.accessibilityId("test-Cart"));
}

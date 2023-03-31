package co.com.devco.userinterface;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target BTN_CHECKOUT = Target.the("Button to checkut").located(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CHECKOUT\").instance(0))"));
    public static final Target TXT_NAME = Target.the("Name Input").located(AppiumBy.accessibilityId("test-First Name"));
    public static final Target TXT_LAST_NAME = Target.the("Lastname Input").located(AppiumBy.accessibilityId("test-Last Name"));
    public static final Target TXT_POST_CODE = Target.the("Post Code Input").located(AppiumBy.accessibilityId("test-Zip/Postal Code"));
    public static final Target BTN_CONTINUE = Target.the("Button to Continue").located(AppiumBy.accessibilityId("test-CONTINUE"));
    public static final Target BTN_FINISH = Target.the("Button to Finish").located(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"FINISH\").instance(0))"));
}

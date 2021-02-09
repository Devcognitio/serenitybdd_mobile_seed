package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target BTN_CHECKOUT = Target.the("Button to checkut").located(MobileBy.AccessibilityId("test-CHECKOUT"));
    public static final Target TXT_NAME = Target.the("Name Input").located(MobileBy.AccessibilityId("test-First Name"));
    public static final Target TXT_LAST_NAME = Target.the("Lastname Input").located(MobileBy.AccessibilityId("test-Last Name"));
    public static final Target TXT_POST_CODE = Target.the("Post Code Input").located(MobileBy.AccessibilityId("test-Zip/Postal Code"));
    public static final Target BTN_CONTINUE = Target.the("Button to Continue").located(MobileBy.AccessibilityId("test-CONTINUE"));
    public static final Target BTN_FINISH = Target.the("Button to Finish").located(MobileBy.AccessibilityId("test-FINISH"));
}

package co.com.devco.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static final Target BTN_CHECKOUT = Target.the("Button to checkut").locatedForAndroid(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CHECKOUT\").instance(0))")).locatedForIOS(AppiumBy.accessibilityId("test-CHECKOUT"));
    public static final Target TXT_NAME = Target.the("Name Input").locatedForAndroid(AppiumBy.accessibilityId("test-First Name")).locatedForIOS(AppiumBy.accessibilityId("test-First Name"));
    public static final Target TXT_LAST_NAME = Target.the("Lastname Input").locatedForAndroid(AppiumBy.accessibilityId("test-Last Name")).locatedForIOS(AppiumBy.accessibilityId("test-Last Name"));
    public static final Target TXT_POST_CODE = Target.the("Post Code Input").locatedForAndroid(AppiumBy.accessibilityId("test-Zip/Postal Code")).locatedForIOS(AppiumBy.accessibilityId("test-Zip/Postal Code"));
    public static final Target BTN_CONTINUE = Target.the("Button to Continue").locatedForAndroid(AppiumBy.accessibilityId("test-CONTINUE")).locatedForIOS(AppiumBy.accessibilityId("test-CONTINUE"));
    public static final Target BTN_FINISH = Target.the("Button to Finish").locatedForAndroid(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"FINISH\").instance(0))")).locatedForIOS(AppiumBy.accessibilityId("test-FINISH"));
}

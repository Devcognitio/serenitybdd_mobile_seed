package co.com.devco.userinterface;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_USERNAME = Target.the("Username Input").locatedForAndroid(AppiumBy.accessibilityId("test-Username")).locatedForIOS(AppiumBy.accessibilityId("test-Usuario"));
    public static final Target TXT_PASSWORD = Target.the("Password Input").locatedForAndroid(AppiumBy.accessibilityId("test-Password")).locatedForIOS(AppiumBy.accessibilityId("test-Contraseña"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(AppiumBy.accessibilityId("test-LOGIN"));
}

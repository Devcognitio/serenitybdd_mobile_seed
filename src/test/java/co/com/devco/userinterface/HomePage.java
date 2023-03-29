package co.com.devco.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the prodcut").locatedBy("//android.widget.TextView[@text='{0}']");
}

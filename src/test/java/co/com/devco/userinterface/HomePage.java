package co.com.devco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target LBL_NAME_PRODUCT = Target.the("Title with the name of the prodcut").locatedBy("//android.widget.TextView[@text='{0}']");
}

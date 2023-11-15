package co.com.devco.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Scroll implements Interaction {
    private final double start;
    private final double end;

    public Scroll(double start, double end) {
        this.start = start;
        this.end = end;
    }

    @Override
    @Step("Realiza Scroll")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
        TouchAction<?> action = new TouchAction((PerformsTouchActions) driver);
        Dimension dimension = ThucydidesWebDriverSupport.getProxiedDriver().manage().window().getSize();
        int startX = 4;
        int startY = (int) (dimension.height * 0.7);
        int endY = (int) (dimension.height * 0.2);
        action.longPress(PointOption.point(startX, startY))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();

//        IOSDriver driver = ThucydidesWebDriverSupport.getProxiedDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        Map<String, Object> params = new HashMap<>();
//        params.put("direction", "down");
//        js.executeScript("mobile: scroll", params);
    }

    public static Scroll up() {
        return instrumented(Scroll.class, 0.4, 0.8);
    }

    public static Scroll down() {
        return instrumented(Scroll.class, 0.4, 0.8);
    }
}
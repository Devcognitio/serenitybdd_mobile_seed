package co.com.devco.interactions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Scroll implements Task {
    private final double start;
    private final double end;

    public Scroll(double start, double end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        Dimension size = getProxiedDriver().manage().window().getSize();
        int with = size.getWidth() / 2;
        int startPoint = (int) (size.getHeight() * start);
        int endPoint = (int) (size.getHeight() * end);
        new TouchAction<>(getProxiedDriver())
                .press(PointOption.point(with, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(with, endPoint))
                .release().perform();
    }

    public static Scroll up() {
        return instrumented(Scroll.class, 0.4, 0.8);
    }

    public static Scroll down() {
        return instrumented(Scroll.class, 0.4, 0.8);
    }
}
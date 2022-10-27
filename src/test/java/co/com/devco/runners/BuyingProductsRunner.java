package co.com.devco.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buying_products.feature",
        glue = "co.com.devco.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BuyingProductsRunner {
}

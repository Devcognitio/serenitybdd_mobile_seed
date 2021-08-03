package co.com.devco.stepdefinitions;

import co.com.devco.models.ProductRecord;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class Hook {
    @DataTableType
    public ProductRecord selectProducts(Map<String, String> products){
        return new ProductRecord(products.get("tennis"), products.get("shirt"));
    }
}

package com.dgmarkt10r.context;

import org.openqa.selenium.WebElement;

import java.util.Map;

public class ElementsMap {

    private final Map<String, WebElement> elementMap;

    public ElementsMap(Map<String, WebElement> elementMap) {
        this.elementMap = elementMap;
    }

    public WebElement getElement(String key) {
        return elementMap.get(key);
    }
}

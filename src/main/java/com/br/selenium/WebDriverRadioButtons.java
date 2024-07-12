package com.br.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButtons {

    private static final String SELECTED_RADIO_BUTTON = "Selected radio button: ";
    private static final String URL                   = "file:///C:/Users/AlterUser/IdeaProjects/WebDriverDemo/src/main/webapp/RadioButtonTest.html";
    private static final String VALUE_ATTRIBUTE       = "value";
    private static final String COLOR_NAME            = "color";

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        List<WebElement> radioButtons = driver.findElements(By.name(COLOR_NAME));
        radioButtons.get(1).click();

        radioButtons.stream()
                .filter(WebElement::isSelected)
                .findFirst()
                .ifPresent(rb -> System.out.println(SELECTED_RADIO_BUTTON + rb.getAttribute(VALUE_ATTRIBUTE)));
    }
}

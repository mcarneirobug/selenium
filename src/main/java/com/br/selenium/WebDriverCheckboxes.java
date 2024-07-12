package com.br.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverCheckboxes {

    private static final String URL                   = "file:///C:/Users/AlterUser/IdeaProjects/WebDriverDemo/src/main/webapp/CheckboxTest.html";
    private static final String LETTUCE_CHECKBOX_ID   = "lettuceCheckbox";

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement checkbox = driver.findElement(By.id(LETTUCE_CHECKBOX_ID));
        checkbox.click();
    }
}

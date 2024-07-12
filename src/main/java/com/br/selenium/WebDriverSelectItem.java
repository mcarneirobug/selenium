package com.br.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {

    private static final String URL                   = "file:///C:/Users/AlterUser/IdeaProjects/WebDriverDemo/src/main/webapp/SelectItemTest.html";
    private static final String SELECT_ID             = "select1";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement selectElement = driver.findElement(By.id(SELECT_ID));
        Select select = new Select(selectElement);

        select.selectByVisibleText("Maybe");
    }
}

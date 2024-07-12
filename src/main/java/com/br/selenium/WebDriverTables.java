package com.br.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverTables {

    private static final String URL                   = "file:///C:/Users/AlterUser/IdeaProjects/WebDriverDemo/src/main/webapp/TableTest.html";
    private static final String TAG_NAME_TABLE        = "table";
    private static final String TAG_NAME_TD           = "td";
    private static final String XPATH_EXPRESSION      = "/html/body/table/tbody/tr/td[2]/table/tbody/tr[1]/td";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement outerTable = driver.findElement(By.tagName(TAG_NAME_TABLE));
        WebElement innerTable = outerTable.findElement(By.tagName(TAG_NAME_TABLE));
        WebElement row = innerTable.findElements(By.tagName(TAG_NAME_TD)).get(1);

        WebElement rowXpath = driver.findElement(By.xpath(XPATH_EXPRESSION));
        System.out.println(rowXpath.getText());

        System.out.println(row.getText());
    }
}

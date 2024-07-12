package com.br.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class WebDriverMain {

    public static final String THE_IMAGENS_LINK_WAS_NOT_FOUND_ON_THE_PAGE = "The 'Imagens' link was not found on the page.";
    public static final String IMAGE_LINK_FOUND = "Image link found!";
    public static final String FAILED_TO = "Failed to: ";
    public static final String URL = "https://www.google.com";
    public static final String IMAGENS_LINK_TEXT = "Imagens";
    public static final String KEYS_TO_SEND = "pluralsight";

    public static void main(String[] args) throws MalformedURLException {

       // WebDriver driver = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.14.161:1234/wd/hub"), chromeOptions);

        // Navigate to the page
        driver.get(URL);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        findElementByName(driver, wait);
        findFirstImageByLinkText(wait, driver);
        clickOnImageByCssSelector(driver);
    }

    private static void clickOnImageByCssSelector(org.openqa.selenium.WebDriver driver) {
        WebElement imageElement = driver.findElements(By.cssSelector("img[class='YQ4gaf']")).get(0);
        imageElement.click();
    }

    private static void findFirstImageByLinkText(WebDriverWait wait, org.openqa.selenium.WebDriver driver) {
        // Wait for the link to be present
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(IMAGENS_LINK_TEXT)));

        List<WebElement> imagesLink = driver.findElements(By.linkText(IMAGENS_LINK_TEXT));

        if (!imagesLink.isEmpty()) {
            System.out.println(IMAGE_LINK_FOUND);
            imagesLink.get(0).click();
        } else {
            System.out.println(THE_IMAGENS_LINK_WAS_NOT_FOUND_ON_THE_PAGE);
        }
    }

    private static void findElementByName(org.openqa.selenium.WebDriver driver, WebDriverWait wait) {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("yS1nld")));

            WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("q"))));
            searchField.click();
            searchField.sendKeys(KEYS_TO_SEND);
            searchField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            System.err.println(FAILED_TO + e.getMessage());
        } finally {
            // driver.quit();
        }
    }
}
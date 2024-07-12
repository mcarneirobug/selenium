# Selenium WebDriver Demo 🚀

This repository demonstrates various Selenium WebDriver functionalities, including iterating through checkboxes, radio buttons, working with select elements, using CSS selectors, handling tables, images, and setting up a remote WebDriver. Below is a detailed explanation of the code and its functionalities.

## Table of Contents 📚

- [Setup](#setup)
- [Usage](#usage)
- [Examples](#examples)
  - [Checkboxes](#checkboxes)
  - [Radio Buttons](#radio-buttons)
  - [Select Elements](#select-elements)
  - [CSS Selectors](#css-selectors)
  - [Tables](#tables)
  - [Images](#images)
  - [Remote WebDriver](#remote-webdriver)
- [Contributing](#contributing)

## Setup ⚙️

1. **Clone the repository:**

    ```sh
    git clone https://github.com/mcarneirobug/selenium.git
    cd selenium
    ```

2. **Install dependencies:**

    Make sure you have the necessary dependencies installed. If you are using Maven, your `pom.xml` should include Selenium dependencies.

    ```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.20.0</version>
    </dependency>
    ```

3. **Download ChromeDriver:**

    Ensure you have the correct version of ChromeDriver matching your Chrome browser.

## Usage 🎮

Run the main class to execute the Selenium WebDriver tests. The code is organized to demonstrate different functionalities.

## Examples 🧩

### Checkboxes ☑️

Iterate through checkboxes and select them based on conditions.

```java
List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
for (WebElement checkbox : checkboxes) {
    if (!checkbox.isSelected()) {
        checkbox.click();
    }
}
```

### Radio Buttons 🔘

Select radio buttons based on the value.

```java
List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
for (WebElement radioButton : radioButtons) {
    if (radioButton.getAttribute("value").equals("desiredValue")) {
        radioButton.click();
        break;
    }
}
```

### Select Elements 📑

Interact with dropdown menus using the Select class.

```java
Select dropdown = new Select(driver.findElement(By.id("dropdownId")));
dropdown.selectByVisibleText("OptionText");
```

### CSS Selectors 🎨
Use CSS selectors to locate elements.

```java
WebElement element = driver.findElement(By.cssSelector(".className #elementId"));
element.click();
```
### Tables 📊

Iterate through table rows and columns.

```java
WebElement table = driver.findElement(By.id("tableId"));
List<WebElement> rows = table.findElements(By.tagName("tr"));
for (WebElement row : rows) {
    List<WebElement> columns = row.findElements(By.tagName("td"));
    for (WebElement column : columns) {
        System.out.println(column.getText());
    }
}
```

### Images 🖼️

Verify if an image is displayed.

```java
WebElement image = driver.findElement(By.xpath("//img[@alt='imageAltText']"));
if (image.isDisplayed()) {
    System.out.println("Image is displayed.");
}
```

### Remote WebDriver 🌐

```java
WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
driver.get("https://www.example.com");
```

## Contributing 🤝
Contributions are welcome! Please open an issue or submit a pull request for any changes.

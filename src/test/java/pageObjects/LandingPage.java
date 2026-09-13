package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.className("search-keyword");

    By productName = By.className("product-name");

    public String productName() {
        return driver.findElement(productName).getText();
    }

    public void clickSearchBar() {
        driver.findElement(searchBox).click();
    }

    public void typeSearchBar(String searchName) {
        driver.findElement(searchBox).sendKeys(searchName);
    }
}

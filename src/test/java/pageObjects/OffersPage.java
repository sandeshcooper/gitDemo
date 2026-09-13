package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
    private final WebDriver driver;

    public OffersPage(WebDriver driver) {
        this.driver = driver;
    }

    By topDeals = By.xpath("//*[contains(text(),'Top Deals')]");

    By productNameOffersPage = By.xpath("(//*[@class = 'table table-bordered']//td)[1]");

    By topDealsSearchBar = By.id("search-field");

    public void clickTopDeals() {
    driver.findElement(topDeals).click();
    }

    public void clickTopDealsSearchBar() {
        driver.findElement(topDealsSearchBar).click();
    }

    public void typeTopDealsSearchBar(String shortName) {
        driver.findElement(topDealsSearchBar).sendKeys(shortName);
    }

    public String offersPageProductName() {
       return driver.findElement(productNameOffersPage).getText();
    }
}

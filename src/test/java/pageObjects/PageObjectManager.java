package pageObjects;

import io.cucumber.java.jv.Lan;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private final WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }
    public LandingPage getLandingPage() {
        return new LandingPage(driver);
    }

    public OffersPage getOffersPage() {
        return new OffersPage(driver);
    }
}

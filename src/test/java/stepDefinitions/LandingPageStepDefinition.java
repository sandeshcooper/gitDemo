package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TextContextSetup;

public class LandingPageStepDefinition {
    public TextContextSetup textContextSetup;
    public LandingPage landingPage;
    private PageObjectManager pageObjectManager;

    public LandingPageStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }

    @Given("User is on greencart landing page")
    public void user_is_on_greencart_landing_page() {
        textContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        textContextSetup.driver.manage().window().maximize();
        
    }

    @When("User searches with short name {string} and extract the product")
    public void userSearchesWithShortNameAndExtractTheProduct(String searchName) throws InterruptedException {
        landingPage = textContextSetup.getPageObjectManager().getLandingPage();
        landingPage.clickSearchBar();
        landingPage.typeSearchBar(searchName);
        Thread.sleep(3000);
        String fullNameWithQuantity = landingPage.productName();
        Assert.assertEquals(fullNameWithQuantity.substring(0,fullNameWithQuantity.indexOf(" "))
                , TextContextSetup.FULL_TEXT,"Both the actual and expected text are equal");
    }
}
package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.OffersPage;
import utils.TextContextSetup;

import java.util.ArrayList;
import java.util.Set;

public class OfferPageStepDefinitions {

    public TextContextSetup textContextSetup;
    public OffersPage offersPage;

    public OfferPageStepDefinitions(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }

    @Then("User go and search the short name {string} in offers page to check if the product exists")
    public void userGoAndSearchTheShortNameInOffersPageToCheckIfTheProductExists(String shortName)  throws InterruptedException {
        offersPage = textContextSetup.getPageObjectManager().getOffersPage();
        offersPage.clickTopDeals();
        switchToOffersPage();
        offersPage.clickTopDealsSearchBar();
        offersPage.typeTopDealsSearchBar(shortName);
        Thread.sleep(3000);
        Assert.assertEquals(offersPage.offersPageProductName(), TextContextSetup.FULL_TEXT,"Both the actual and expected texts are equal");
        System.out.println("Hello i am here");
        System.out.println("Hello i am there");
        System.out.println("THere are lot of changes here but i am adding this lien for reference");
        textContextSetup.driver.quit();
    }

    public void switchToOffersPage() {
        Set<String> windowHandles =  textContextSetup.driver.getWindowHandles();
        ArrayList<String> arrayList = new ArrayList<>(windowHandles);
        textContextSetup.driver.switchTo().window(arrayList.get(1));
    }

    public void nanMaganAlla() {
        System.out.println("Ethuku pannuren ne therila");
    }

    public void vadaSutaAkka() {
        System.out.println("There is a new vada in town");
    }

    public void waterBottle() {
        System.out.println("This is a water bottle team");
    }
}

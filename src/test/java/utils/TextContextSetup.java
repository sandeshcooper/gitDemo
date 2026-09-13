package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.PageObjectManager;

public class TextContextSetup {

    public WebDriver driver = new ChromeDriver();
    public static String FULL_TEXT = "Tomato";
    private final PageObjectManager pageObjectManager;

    public TextContextSetup(PageObjectManager pageObjectManager) {
        this.pageObjectManager = pageObjectManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}

package testingacademy.Selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium02 {


        @Test
    public void testmethod() {
//            WebDriver driver = new ChromeDriver();
//            WebDriver driver2 = new FirefoxDriver();
//            WebDriver driver3 = new SafariDriver();


//        SearchContext driver = new ChromeDriver();
            WebDriver driver = new ChromeDriver();
            driver.get("");

        }
}

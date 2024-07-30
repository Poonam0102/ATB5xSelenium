package testingacademy.Selenium24mar;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium26 {

    EdgeDriver driver;
    @BeforeTest
    public void openbrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    public void testpositive() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
        List<WebElement>checkboxes= driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
        WebElement ch1 = checkboxes.get(0);
        ch1.click();
        Thread.sleep(2000);
        ch1.click();
        Thread.sleep(2000);


    }

    @AfterTest
    public void closebrowser(){
        driver.quit();
    }
}

package testingacademy.Selenium24mar;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium24 {
    EdgeDriver driver;
    @BeforeTest
    public void openbrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test
    public void testpositive(){
    driver.get("https://the-internet.herokuapp.com/dropdown");
    driver.manage().window().maximize();
        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);
//        select.selectByIndex(0); //disable //negative
//        select.selectByIndex(1);
        select.selectByVisibleText("Option 2");
    }

    @AfterTest
    public void closebrowser(){
        driver.quit();
    }
}

package testingacademy.Selenium23March;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium21 {

    @BeforeTest
    public void openbrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
    }
    EdgeDriver driver;

    @Test
    public void testpositive(){
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("login-username")).sendKeys("gfsfg");
        driver.findElement(By.id("login-password")).sendKeys("fdsg");
        driver.findElement(By.id("js-login-btn")).click();
        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.textToBePresentInElement (error_msg ,"Your email, password, IP address or location did not match"));
        System.out.println("1 -> " +error_msg.getText());
    }

@AfterTest
    public void closebrowser(){
        driver.quit();
}
}


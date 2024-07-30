package testingacademy.Selenium24mar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class Selenium25 {

    EdgeDriver driver;
    @BeforeTest
    public void openbrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test
    public void testpositive() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Alert\")]"));
//        driver.findElement(By.xpath("//button[text()= \"Click for JS Alert\"]"));
        WebElement element = driver.findElement(By.xpath("//button[@onclick ='jsAlert()']"));
        element.click();

        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
//        alert.dismiss();
        Thread.sleep(3000);








    }

    @AfterTest
    public void closebrowser(){
        driver.quit();
    }

}

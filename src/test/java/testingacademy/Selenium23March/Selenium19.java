package testingacademy.Selenium23March;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium19 {
    EdgeDriver driver;
    @BeforeTest
    public void openbrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);

    }
    @Test
    public void searchresult() throws InterruptedException {
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id ='gh-ac']")).sendKeys("macmini");
        driver.findElement(By.cssSelector("input[value ='Search']")).click();
        List<WebElement> Searchtitle = driver.findElements(By.xpath("//div[@class ='s-item__title']"));
        int i = 0;
        for (WebElement title : Searchtitle){
            System.out.println(title.getText());
            if(i==10){
                title.click();
            }
            i++;
        }

       List<WebElement> Price = driver.findElements(By.xpath("//span[@class ='s-item__price']"));
        for (WebElement itemPr : Price){
            System.out.println(itemPr.getText());
        }


    }

    @AfterTest
    public void closebrowser(){
        driver.quit();
    }
}

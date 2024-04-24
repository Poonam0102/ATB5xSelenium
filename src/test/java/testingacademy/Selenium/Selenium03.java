package testingacademy.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium03 {

    @Test
    public void testmethod(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions ( new File("C:/Users/Sayali/Downloads/AdBlock1.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

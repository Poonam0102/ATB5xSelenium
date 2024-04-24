package testingacademy.Seleniumpart3;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium12 {
    @Test(groups = "QA")
    @Description("Verify the current URL, title of VWO app")
    public void testvwologin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        WebElement anchor_tag = driver.findElement(By.linkText("Start a free trial"));
        WebElement anchor_tag = driver.findElement(By.partialLinkText("Start a free"));
        System.out.println(anchor_tag.getAttribute("href"));
        anchor_tag.click();
        driver.close();
    }
    }

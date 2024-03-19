package testingacademy.Selenium;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium10 {



//        open app.vwo.com
//        Print the title and get the current URL
//        Verify the Current URL is app.vwo.com

        @Test(groups = "QA")
        @Description("Verify the current URL, title of VWO app")
        public void testvwologin() {
            WebDriver driver = new EdgeDriver();
            driver.get("https://app.vwo.com");
            System.out.println(driver.getTitle());

           Assert.assertEquals(driver.getTitle(),"Login - VWO");
           Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
           driver.quit();
        }
    }


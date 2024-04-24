package testingacademy.Selenium17mar;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium13 {
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

//        Que - Print all anchor tag links and print with gettext()

        List<WebElement> all_anchortags = driver.findElements(By.tagName("a"));
        all_anchortags.get(0).click();
        all_anchortags.get(1).click();
        all_anchortags.size();
        for (WebElement element : all_anchortags){
            System.out.println(element.getText());
        }
        driver.close();
    }

}

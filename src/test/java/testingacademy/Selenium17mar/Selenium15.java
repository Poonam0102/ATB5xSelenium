package testingacademy.Selenium17mar;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium15 {
    @Test(groups = "QA")
    @Description("Verify the current URL, title of VWO app")
    public void testvwologin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://cura.com/demo-home-health/");
    }
}
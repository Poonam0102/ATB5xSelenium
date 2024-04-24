package testingacademy.Selenium24mar;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium26 {

    @Test(groups = "QA")
    @Description("Verify the current URL, title of VWO app")
    public void testvwologin() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkbox");
    }
}

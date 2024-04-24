package testingacademy.Seleniumpart3;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium11 {

    @Test(groups = "QA")
    @Description("Verify the current URL, title of VWO app")
    public void testvwologin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");


        //        **Project #1 - TC ( Negaative) - Invalid username, pass - Error message**
//
//        1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        2. **Find the Email id** and enter the email as admin@admin.com
//        3. **Find the pass inputbox** and enter passwrod as admin.
//        4. Find and Click on the submit button
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"
//

        //        2. **Find the Email id** and enter the email as admin@admin.com
      WebElement emailIDbox = driver.findElement(By.id("login-username"));
      emailIDbox.sendKeys("admin@admin.com");
      driver.findElement(By.name("password")).sendKeys("admin");
      driver.findElement(By.id("js-login-btn")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errormsg = driver.findElement(By.className("notification-box-description"));
      String message = errormsg.getText();
      Assert.assertEquals(message,"Your email, password, IP address or location did not match");
      driver.quit();


}
}

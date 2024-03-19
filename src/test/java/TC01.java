import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01 {

    @Test
    @Description("Verify title of the Thetestingacademy website")
    public void vwoLogin(){
        WebDriver driver =new ChromeDriver();
        driver.get("https://thetestingacademy.com");
        System.out.println(driver.getTitle());
    }



}

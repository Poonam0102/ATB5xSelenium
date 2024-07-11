package testingacademy.Selenium23March;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium17 {

    @BeforeTest
    public void openbrowser(){

        WebDriver driver = new ChromeDriver();
    }

    @Test(groups ="QA")
    @Description("Test Case")
    public void test01(){

    }


}

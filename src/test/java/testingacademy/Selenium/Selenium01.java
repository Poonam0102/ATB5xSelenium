package testingacademy.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.get("https://thetestingacademy.com");
    }
}

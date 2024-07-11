package testingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.getTitle();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("icp-nav-flyout")).click();
//        Select dropdown = new Select(driver.findElement(By.id("icp-nav-flyout")));
//        Thread.sleep(3000);
//      dropdown.selectByValue("hi_IN");
//        dropdown.selectByIndex(1);
//        dropdown.selectByVisibleText("हिन्दी");
        driver.findElement(By.xpath("//span[contains(text(),\" हिन्दी \")]")).click();

    }



}

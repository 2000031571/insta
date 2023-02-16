package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class insta {
    @Test
    public void test() {
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
        //driver.findElement(By.id("username")).sendKeys("vyshnavi___chowdary");
        //driver.findElement(By.name("password")).sendKeys("vyshu@030503");


    }
}

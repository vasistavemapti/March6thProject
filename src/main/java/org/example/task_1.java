package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_1
{
    @Test
    public void Test()
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://github.com/login");

       highlight(driver , driver.findElement(By.xpath("//input[(@id,'login_field')]")));
       highlight(driver , driver.findElement(By.xpath("//input[(@id,'password')]")));

    }

    public static void highlight(WebDriver driver, WebElement element)
    {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('style', 'background: gray;')", element);
    }
}
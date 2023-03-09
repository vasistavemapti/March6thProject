package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_2
{

    @Test
    public void Test()
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://github.com/login");
         driver.findElement(By.xpath("//input[contains(@id,'login_field')]")).sendKeys("vasista45@gmail.com");
         driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("20Vasi02@12");
         driver.findElement(By.xpath("//input[contains(@name , 'commit')]")).click();
    }
}

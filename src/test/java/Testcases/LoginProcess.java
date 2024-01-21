package Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginProcess {
    @Test
    public void verifyloginscreen(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(text(),'Form Authentication')]")).click();
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@class='radius']")).click();
        driver.findElement(By.xpath("//*[@class='button secondary radius']")).click();
        driver.quit();

    }

    @Test
    public void invaildusername(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(text(),'Form Authentication')]")).click();
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("ahmed");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@class='radius']")).click();
        String expectedresult="Your username is invalid!";
        String actualresult=driver.findElement(By.id("flash")).getText();
        assertTrue(actualresult.contains(expectedresult));
        driver.quit();


    }

    @Test
    public void invaildpassword(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(text(),'Form Authentication')]")).click();
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Password!");
        driver.findElement(By.xpath("//*[@class='radius']")).click();
        String expectedresult="Your password is invalid!";
        String actualresult=driver.findElement(By.id("flash")).getText();
        assertTrue(actualresult.contains(expectedresult));
        driver.quit();

    }

    @Test
    public void invaildusernameandpassword(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(text(),'Form Authentication')]")).click();
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("ahmed");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Password!");
        driver.findElement(By.xpath("//*[@class='radius']")).click();
        String expectedresult="Your username is invalid!";
        String actualresult=driver.findElement(By.id("flash")).getText();
        assertTrue(actualresult.contains(expectedresult));
        driver.quit();
    }
}

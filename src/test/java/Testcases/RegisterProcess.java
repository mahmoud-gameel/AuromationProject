package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegisterProcess {
    @Test
    public void verifyloginscreen() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[contains(text(),'Register')]")).click();
        WebElement radio = driver.findElement(By.xpath("//input[@value ='M']"));
        radio.click();
        driver.findElement(By.xpath("//*[@name='FirstName']")).sendKeys("mahmoud");
        driver.findElement(By.xpath("//*[@name='LastName']")).sendKeys("gameel!");
        driver.findElement(By.xpath("//*[@name='DateOfBirthDay']")).sendKeys("8!");
        driver.findElement(By.xpath("//*[@name='DateOfBirthMonth']")).sendKeys("March!");
        driver.findElement(By.xpath("//*[@name='DateOfBirthYear']")).sendKeys("1986!");
        driver.findElement(By.xpath("//*[@name='Email']")).sendKeys("mahmoud-gameel@hotmail.com");
        driver.findElement(By.xpath("//*[@name='Company']")).sendKeys("neomtech");
        driver.findElement(By.xpath("//*[@name='Password']")).sendKeys("Yshn@1234");
        driver.findElement(By.xpath("//*[@name='ConfirmPassword']")).sendKeys("Yshn@1234");


    }
}

package com.TestApp;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRegistrationPage {


@Test
public void testRegistrationPage() throws InterruptedException {


WebDriver driver = new FirefoxDriver();

//WebDriver driver = new FirefoxDriver();


driver.get("http://localhost:3000/");

Thread.sleep(2000);

driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();

driver.findElement(By.id(":r1:")).sendKeys("admin");
driver.findElement(By.id(":r3:")).sendKeys("admin");
driver.findElement(By.id(":r5:")).click();

driver.findElement(By.xpath("//li[normalize-space()='Admin']")).click();

Thread.sleep(2000);



driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();





Thread.sleep(2000);

driver.findElement(By.xpath("1")).click();
}

}
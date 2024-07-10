package com.testapp.SeleniumProjectTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBrowser {
		public static void main(String[] args)throws InterruptedException {

			// TODO Auto-generated method stub
			//WebDriver driver = new ChromeDriver();

			WebDriver driver = new FirefoxDriver();
     		//driver.get("https://www.google.com/");
			driver.get("https://www.google.com/intl/en-US/gmail/about/");
			//driver.get("https://www.mozila.com/");
			//Thread.sleep(1000);
			//driver.findElement(By.id("APjFqb")).sendKeys("gmail");
			//driver.findElement(By.name("btnk")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
			driver.findElement(By.id("identifierId")).sendKeys("raghul@gmail.com");
			driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		}

}

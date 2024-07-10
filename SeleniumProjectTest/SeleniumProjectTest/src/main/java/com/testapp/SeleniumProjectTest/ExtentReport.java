package com.testapp.SeleniumProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	
	private static FirefoxDriver driver;

	public static void main(String[] args){
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("Google search Test1","This is a Test to validate");
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		test.log(Status.INFO, "Starting Test Case");
		driver = new FirefoxDriver();
		
		driver.get("http://localhost:3000/");
		test.pass("Navigate to Home page successfully");
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		test.pass("Clicking on the login page successfully");
		driver.findElement(By.id(":r1:")).sendKeys("admin");
		test.pass("Accepting username successfully");
		
		driver.findElement(By.id(":r3:")).sendKeys("admin");
		test.pass("Accepting password successfully");
		
		driver.findElement(By.id(":r5:")).click();
		test.pass("Dropdown is working properly"); 
		
		driver.findElement(By.xpath("//li[normalize-space()='Admin']")).click();
		test.pass("Login successfully");
		
		test.pass("Test Completed");
		extent.flush();
	}
}

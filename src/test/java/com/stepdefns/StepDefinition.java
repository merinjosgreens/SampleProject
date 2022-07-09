package com.stepdefns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;
	
	@Given("user launch facebook Web Application")
	public void user_launch_facebook_Web_Application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    
	}

	@When("user enters invalid username and invalid password")
	public void user_enters_invalid_username_and_invalid_password() {
		driver.findElement(By.id("email")).sendKeys("Greens");
		driver.findElement(By.id("pass")).sendKeys("12345");
	    
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.name("login")).click();
		
	    
	}

	@Then("user verify error message is displayed or not.")
	public void user_verify_error_message_is_displayed_or_not() {
		WebElement errormsg = driver.findElement(By.xpath("//div[contains(text(),'incorrect')]"));
		 String error = errormsg.getText();
		 System.out.println(error);
		 boolean errorMessage = error.contains("incorrect");
		 System.out.println(errorMessage);
	    
	}
	@When("user clicks Create New account button")
	public void user_clicks_Create_New_account_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		
	    
	}

	@Then("user verify sign up text is displayed")
	public void user_verify_sign_up_text_is_displayed() throws Throwable {
		Thread.sleep(3000);
		WebElement sign = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		String signup = sign.getText();
		System.out.println(signup);
		boolean signuptxt = signup.contains("Sign");
		System.out.println(signuptxt);
		
		
	    
	}	
}

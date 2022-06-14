package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepDefinition {

 WebDriver driver;
	
	@Given(": user launch facebook application")
	public void user_launch_facebook_application() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOKUL RAJ\\eclipse-workspace\\1\\Cucumber_examles\\chrome location\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		System.out.println("user launch facebook application");
	}
	@When(": user valied username")
	public void user_valied_username() {
		driver.findElement(By.id("email")).sendKeys("bsdfbf@gmail.com");
		System.out.println("user_valied_username");
	}
	@Then(":user valied password")
	public void user_valied_password() {
	   driver.findElement(By.id("pass")).sendKeys("4565226");
	   System.out.println("user valied password");
	}
	@Then(":click login button")
	public void click_login_button() {
	    driver.findElement(By.id("u_0_d_uC")).click();
	    System.out.println("click login button");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

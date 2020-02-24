package p5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CS2 {
	WebDriver driver;
	@Given("User navigates to URL")
	public void user_navigates_to_URL() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		
			    driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
			    driver.findElement(By.id("details-button")).click();
			    driver.findElement(By.id("proceed-link")).click();
			    driver.findElement(By.linkText("SignUp")).click();
			   // WebDriverWait wait=new  WebDriverWait(driver,10);
			    driver.findElement(By.name("userName")).sendKeys("cfgctyh");
			    driver.findElement(By.name("firstName")).sendKeys("Lalitha");
			    driver.findElement(By.name("lastName")).sendKeys("Lali");
			       driver.findElement(By.name("password")).sendKeys("Password123");
			    driver.findElement(By.name("confirmPassword")).sendKeys("Password123");
			    driver.findElement(By.xpath("//*[@name='gender' and @value='Female']")).click();
			    driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
			    driver.findElement(By.name("mobileNumber")).sendKeys("1234567890");
			    driver.findElement(By.name("dob")).sendKeys("06/02/1998");
			    driver.findElement(By.name("address")).sendKeys("TN");
			    driver.findElement(By.name("securityQuestion")).sendKeys("What is your birth place");
			    driver.findElement(By.name("answer")).sendKeys("TN");
			    driver.findElement(By.name("Submit")).click();
			    System.out.println("Registration successfull");
			    
			   }
	
	private void testRegistration() {
		// TODO Auto-generated method stub
		
	}
	@Given("enter {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void enter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
	    
	}

	@Then("user click on register")
	public void user_click_on_register(io.cucumber.datatable.DataTable dataTable) {
		 driver.findElement(By.name("userName")).sendKeys("Lalitha");
		    driver.findElement(By.name("password")).sendKeys("Password123");
		    driver.findElement(By.name("Login")).click();
		    System.out.println("Login success");  
	}


}

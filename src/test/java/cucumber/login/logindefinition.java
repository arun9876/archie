package cucumber.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class logindefinition {
	WebDriver driver;

	@Given("^user is in the login page$")

    public void user_is_in_the_login_page() throws Throwable {
		driver = utilityclass.startBrowser("chrome", "http://newtours.demoaut.com/"); 
}

@When("^user performs login by adding valid credentials$")
public void user_performs_login_by_adding_valid_credentials() throws Throwable {
    pages page= new pages(driver);
		page.do_login("tutorial", "tutorial");
}

@Then("^user must be in the home page$")
public void user_must_be_in_the_home_page() throws Throwable {
    WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
		driver.close();
}




}

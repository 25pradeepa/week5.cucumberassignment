package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createlead extends baseclass{
	
	@And("Click on CRMSFA")
	public void CRMSFAlink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
				
	}
	@And("Click on Leads")
	public void Leadsbutton()
	{
		
		driver.findElement(By.linkText("Leads")).click();
			
	}
	@And("Click on Create Lead")
	public void createleadbutton()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter the companyname as {string}")
	public void compname(String compname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compname);
	}
	@When("Enter the Firstname as {string}")
	public void firstname(String firstname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}
	@And("Enter the Lastname as {string}")
	public void lastname(String lastname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}
	@Then("Click on submit button")
	public void submitbutton()
	{
		driver.findElement(By.name("submitButton")).click();
	}
}

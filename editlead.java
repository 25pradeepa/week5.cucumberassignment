package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editlead extends baseclass {
	@And("Click on Find Lead")
	public void findlead()
	{
		driver.findElement(By.linkText("Find Leads")).click();		
		
	}
	@And("Click on phone")
	public void phone()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@When("Enter the phonenumber as {string}")
	public void phonenumber(String phonenum)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenum);
	}
	@Then("Click on findlead button and innericon")
	public void findleadbutton_innericon() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("click on Edit link")
	public void editlink()
	{
		driver.findElement(By.linkText("Edit")).click();
	}
	@When("Enter the editcompanyname as {string}")
	public void editcompanyname(String company)
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}
	@Then("click on editleadsubmitbutton")
	public void editleadsubmit()
	{
		driver.findElement(By.name("submitButton")).click();
	}
}

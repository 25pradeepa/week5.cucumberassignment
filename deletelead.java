package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deletelead extends baseclass{
	String leadID;
	@Then("Click on findlead button")
	public void findlead() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@Given("Click on innercellicon")
	public void deleteleads()
	{
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			
		
	}
	
	@Then("Click on deletelink")
	public void deletelink()
	{
		driver.findElement(By.linkText("Delete")).click();
	}
	@And("Click on Find Leads link")
	public void findleadlink()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Enter the leadid")
	public void leadid()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@Then("Click on deletefindlead button")
	public void delete_findlead()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Then("verify the record deletion")
	public void recorddelete()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
}

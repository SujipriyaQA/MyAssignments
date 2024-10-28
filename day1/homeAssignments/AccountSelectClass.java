package week2.day1.homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("YeshuaJohn");
		WebElement Industry =	driver.findElement(By.name("industryEnumId"));
		
		Select indusSelect = new Select(Industry);
		indusSelect.selectByIndex(3);
		
		//ownershipEnumId
		WebElement Owner =	driver.findElement(By.name("ownershipEnumId"));
		
		Select ownerSelect = new Select(Owner);
		ownerSelect.selectByVisibleText("S-Corporation");
		
		//dataSourceId
		WebElement Source =	driver.findElement(By.name("dataSourceId"));
		
		Select sourceSelect = new Select(Source);
		sourceSelect.selectByValue("LEAD_EMPLOYEE");
		
		//eCommerce Site Internal Campaign
		WebElement ecom = driver.findElement(By.id("marketingCampaignId"));
		Select ecs = new Select(ecom);
		ecs.selectByIndex(6);
		
		//generalStateProvinceGeoId
WebElement state =	driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select stateSelect = new Select(state);
		stateSelect.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}

package week2.day1.homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoCSR");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();

driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suji");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sasshi");
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA Lead");
driver.findElement(By.name("submitButton")).click();

System.out.println(driver.getTitle());

String title = "View Lead | opentaps CRM";

driver.close();





	}

}

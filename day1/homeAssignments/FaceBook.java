package week2.day1.homeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suji");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sasshi");
		
		WebElement selectday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select seday1 = new Select(selectday);
		seday1.selectByVisibleText("18");
		
		WebElement selectmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select semonth1 = new Select(selectmonth);
		semonth1.selectByVisibleText("Mar");
		
		WebElement selectyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select seyear1 = new Select(selectyear);
		seyear1.selectByVisibleText("1986");
		
		//input[@id='sex']
		driver.findElement(By.xpath("//input[@id='sex']")).click();
		
		//input[@name='reg_email__']
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9988776655");
		
		//input[@type='password']
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass6655");
		
	}

}

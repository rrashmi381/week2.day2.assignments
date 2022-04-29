package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("(//input[@name= 'accountname'])[2]")).sendKeys("Debit LimitedAccount");
		driver.findElement(By.xpath("(//textarea[@name= 'description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("(//input[@name= 'groupNameLocal']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("(//input[@name= 'officeSiteName']")).sendKeys("Google.com");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[5]")).sendKeys("500000");
		driver.findElement(By.xpath("(//input[@value= 'create Account']")).click();
		driver.close();
	}

}

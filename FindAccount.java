package week2.day2.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
	
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get(" http://leaftaps.com/opentaps/control/login ");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.xpath("//a[text()= 'Accounts']")).click();
			driver.findElement(By.xpath("//a[text()= 'Find Accounts']")).click();
			driver.findElement(By.xpath("(//input[@name= 'accountName'])[2]")).sendKeys("Credit Limited Account");
			driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
			driver.findElement(By.linkText("Credit Limited Account")).click();
			driver.findElement(By.xpath("(//a[@class= 'subMenuButton'])[1]")).click();
			String text1 = driver.findElement(By.xpath("(//input[@name= 'accountName'])[2]")).getAttribute("value");
			System.out.println(text1); 
			String text2 = driver.findElement(By.xpath("//textarea[@name='description']")).getText();
			System.out.println(text2);	
			System.out.println("The Title is :" + driver.getTitle());
			//driver.close();
	}
	}

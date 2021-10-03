import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Createaaccountformtest {

	@Test
	public void LoginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows
		driver.findElement(By.className("login")).click(); // click login button
		Thread.sleep(3000); // slow down
		driver.findElement(By.cssSelector("#email_create")).sendKeys("julianm08@gmail.com");
		Thread.sleep(3000); // slow down
		driver.findElement(By.className("login")).click(); // click create an account button
		Thread.sleep(3000); // slow down
		driver.findElement(By.cssSelector("button[id='SubmitCreate'] span")).click();
		Thread.sleep(3000); // slow down
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
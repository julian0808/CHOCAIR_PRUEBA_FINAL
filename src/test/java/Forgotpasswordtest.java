import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Forgotpasswordtest {
	// Se implemento solo un escenario de prueba.
	@Test
	public void LoginTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows

		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();  // Click Sign in button
		Thread.sleep(3000); // slow down

		driver.findElement(By.cssSelector("a[title='Recover your forgotten password']")).click(); // click forgot password button
		Thread.sleep(3000); // slow down

		driver.findElement(By.cssSelector("#email")).sendKeys("julianm08@gmail.com");
		Thread.sleep(3000); // slow down

		driver.findElement(By.cssSelector("button[class='btn btn-default button button-medium'] span")).click(); // click on Retrieve button password.
		Thread.sleep(3000); // slow down




	}

}
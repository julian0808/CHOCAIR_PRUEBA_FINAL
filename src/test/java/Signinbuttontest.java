import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signinbuttontest {
	// Se implemento solo un escenario de prueba.
	@Test
	void LoginTest(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows

		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();  // Click Sign in button


	}

}
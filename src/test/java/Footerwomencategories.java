import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Footerwomencategories {
	// Se implemento solo un escenario de prueba.
	@Test
	public void LoginTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows
		// Click on the footer categories Women
		driver.findElement(By.xpath("//li[contains(@class,'last')]//a[contains(@title,'')][normalize-space()='Women']")).click();



	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class searchtest {
	// Se implemento solo un escenario de prueba.
	@Test
	public void LoginTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows
		driver.findElement(By.cssSelector("#search_query_top")).sendKeys("Faded Short Sleeve T-shirts"); // find the product
		Thread.sleep(3000); // slow down
		driver.findElement(By.cssSelector("button[name='submit_search']")).click(); // click in the search button
		Thread.sleep(3000); // slow down
		System.out.println(driver.getTitle());
		//driver.close();




	}

}
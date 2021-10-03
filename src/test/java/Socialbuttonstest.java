import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Socialbuttonstest {
	// Se implemento solo un escenario de prueba.
	@Test
	void LoginTest(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows

		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).build().perform();
		driver.findElement(By.cssSelector(".facebook")).click(); // Click on facebook icon
		driver.findElement(By.cssSelector("a[href='https://twitter.com/seleniumfrmwrk']")).click(); //Click on twitter icon
		driver.findElement(By.xpath("//body/div[@id='page']/div[3]/footer[1]/div[1]/section[1]/ul[1]/li[3]/a[1]")).click(); // Click on Youtube icon
		driver.findElement(By.xpath("//body/div[@id='page']/div[3]/footer[1]/div[1]/section[1]/ul[1]/li[4]/a[1]")).click(); // Click on Youtube icon
		action.keyUp(Keys.CONTROL).build().perform();


	}

}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logintest {
// Se implemento solo un escenario de prueba.
	@Test
	void LoginTest(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows
		driver.findElement(By.className("login")).click(); // click login button
		driver.findElement(By.cssSelector("#email")).sendKeys("julianm08@gmail.com"); // Type de email
		driver.findElement(By.cssSelector("#passwd")).sendKeys("12234"); // Type the password
		driver.findElement(By.className("login")).click(); // Click in the sign in button
		driver.findElement(By.cssSelector("button[id='SubmitLogin'] span")).click();
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
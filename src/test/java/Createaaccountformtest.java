import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Createaaccountformtest {

	@Test
	void LoginTest(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows
		driver.findElement(By.className("login")).click(); // click login button
		driver.findElement(By.cssSelector("#email_create")).sendKeys("julianm08@gmail.com");
		driver.findElement(By.className("login")).click(); // click create an account button
		driver.findElement(By.cssSelector("button[id='SubmitCreate'] span")).click();
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
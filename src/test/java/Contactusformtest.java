import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class Contactusformtest {
	// Se implemento solo un escenario de prueba.
	@Test
	public static void LoginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows

		driver.findElement(By.cssSelector("a[title='Contact Us']")).click();
		Thread.sleep(3000); // slow down

		new Select(driver.findElement(By.id("id_contact"))).selectByVisibleText("Webmaster");
		Thread.sleep(3000); // slow down

		driver.findElement(By.id("email")).sendKeys("julianm08@gmail.com"); // Email address
		driver.findElement(By.id("id_order")).sendKeys("1278"); // Order References
		Thread.sleep(3000); // slow down


		WebElement chooseFile = driver.findElement(By.id("fileUpload"));
		Thread.sleep(3000); // slow down

		chooseFile.sendKeys("C://Users//julia//Desktop//UDEMY+other courses//JOBS//Chocair//new.txt");
		Thread.sleep(3000); // slow down

		driver.findElement(By.id("message")).sendKeys("Tengo un problema con la compra necesito ayuda"); // Message
		Thread.sleep(3000); // slow down


		// click the send button
		driver.findElement(By.cssSelector("button[id='submitMessage'] span")).click();
		Thread.sleep(3000);

	}

}

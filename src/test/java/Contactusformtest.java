import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Contactusformtest {
	// Se implemento solo un escenario de prueba.
	@Test
	void LoginTest(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize Windows

		driver.findElement(By.cssSelector("a[title='Contact Us']")).click();

		new Select(driver.findElement(By.id("id_contact"))).selectByVisibleText("Webmaster");

		driver.findElement(By.id("email")).sendKeys("julianm08@gmail.com"); // Email address
		driver.findElement(By.id("id_order")).sendKeys("1278"); // Order References


		WebElement chooseFile = driver.findElement(By.id("fileUpload"));

		chooseFile.sendKeys("C://Users//julia//Desktop//UDEMY+other courses//JOBS//Chocair//new.txt");

		driver.findElement(By.id("message")).sendKeys("Tengo un problema con la compra necesito ayuda"); // Message


		// click the send button
		driver.findElement(By.cssSelector("button[id='submitMessage'] span")).click();

	}

}

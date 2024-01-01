import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTest {

	WebDriver driver;

	@BeforeEach
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inar-academy.netlify.app/");
		driver.findElement(By.xpath("//a[@href='/weborder']")).click();
	}

	@Test
	public void cssWithId() {
		WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
		loginButton.click();
	}

	@Test
	public void cssWithClassName() {
		WebElement userNameInput = driver.findElement(By.cssSelector(".mb-4 .form-control"));
		userNameInput.sendKeys("Inar");
	}

}

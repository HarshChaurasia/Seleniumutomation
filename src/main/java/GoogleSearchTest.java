
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		WebElement searchTxtBx = driver.findElement(By.xpath("//input[@title='Search']"));
		searchTxtBx.sendKeys("Dwayne Jahnson");
		searchTxtBx.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
		
		  
		
		
	}

}

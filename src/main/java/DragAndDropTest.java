import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://jqueryui.com/droppable/");
	driver.switchTo().frame(0);

	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
	.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
	.release()
	.build()
	.perform();
	
	Thread.sleep(5000);
	
	System.out.println(driver.getTitle());
	}
}

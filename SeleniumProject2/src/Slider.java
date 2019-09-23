import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users//shailaja//Downloads//geckodriver-v0.24.0-win64//geckodriver.exe");
		
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://jqueryui.com/slider/");
		  
		  driver.switchTo().frame(0);
		  WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));
		  
		  Actions act=new Actions(driver);
		  act.moveToElement(slider).dragAndDropBy(slider,300, 0).build().perform();
		  
		  
		  
	}

}

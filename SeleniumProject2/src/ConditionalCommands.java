import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C://eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	
		
		driver.get("https://www.facebook.com/");
		WebElement text=driver.findElement(By.xpath("//*[@id=\'email\']"));
		WebElement pass=driver.findElement(By.xpath("//*[@id=\'pass\']"));
		if(text.isDisplayed() && text.isEnabled())
		{
			text.sendKeys("sailu");
		}
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("pathi");
		}
			
		System.out.println(driver.findElement(By.xpath("//*[@id=\'u_0_9\']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\'u_0_a\']")).isSelected());
		
		if(driver.findElement(By.xpath("//*[@id=\'u_0_9\']")).isSelected()==false)
		{
			driver.findElement(By.xpath("//*[@id=\'u_0_9\']")).click();
		}

	}

}

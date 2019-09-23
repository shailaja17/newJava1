import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTry {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C://eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	
	String exptitle="Find a Flight: Mercury Tours:";

	String actitle= driver.getTitle();
	if(exptitle.equals(actitle))
	{
		System.out.println("Test is passed");
	}
	else {
		System.out.println("test is failed");
	}
	driver.close();
	}

}

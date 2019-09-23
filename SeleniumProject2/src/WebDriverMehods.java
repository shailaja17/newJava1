import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMehods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver","C://eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	
		driver.get("http://newtours.demoaut.com/");
		
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	String testval=driver.findElement
			(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText(); 
		
	System.out.println(testval);
	
	driver.close();//it close only one window
	//driver.quit();//it will close multiple windows
	
	}

}

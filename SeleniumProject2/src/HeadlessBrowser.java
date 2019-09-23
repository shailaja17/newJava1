import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	Using Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C://eclipse//chromedriver_win32//chromedriver.exe");

		ChromeOptions options=new ChromeOptions();  
		//options.setHeadless(true);
		
		
		
		options.addArguments("--headless");
		
	WebDriver driver= new ChromeDriver(options);
	driver.get("http://demo.nopcommerce.com/");
	
//	System.out.println(driver.getTitle());*/
		
		//Using Firefox Browser

		System.setProperty("webdriver.gecko.driver","C://eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
		
		FirefoxOptions options=new FirefoxOptions();
		
		options.setHeadless(true);
		FirefoxDriver driver=new FirefoxDriver(options);
		driver.get("http://demo.nopcommerce.com/");
		
		System.out.println(driver.getTitle());
	
	}

}

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest1 {
 
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver","C://eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		
  }
}

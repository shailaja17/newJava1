import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	
		driver.get("http://newtours.demoaut.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		

	}

}

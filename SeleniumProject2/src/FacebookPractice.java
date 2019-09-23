import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C://eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		String exptitle="Facebook - Log In or Sign Up";
		String actitle=driver.getTitle();
		
		if(exptitle.contentEquals(actitle))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test  fail");
		}
		

	}

}

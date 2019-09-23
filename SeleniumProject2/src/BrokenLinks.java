import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C://eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		driver.get("http://newtours.demoaut.com/");
// capture links form a webpage
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		//links size
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			URL link=new URL(url);
			
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			
			Thread.sleep(3000);
			httpconn.connect();
			
			int respond=httpconn.getResponseCode();
			
			if(respond>=400) {
				System.out.println(url+ "   "+ "is invalid");
			}else
				{
					System.out.println(url+"  "+ "is valid");
				}
			}
			
			
		}

		
	
	
	}



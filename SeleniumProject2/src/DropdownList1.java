import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users//shailaja//Downloads//geckodriver-v0.24.0-win64//geckodriver.exe");
		
		  WebDriver driver=new FirefoxDriver();
		  
		  driver.get("https://testautomationpractice.blogspot.com/");
		  WebElement element=driver.findElement(By.id("animals"));
		  Select se=new Select(element);
		  List originalList=new ArrayList();
		  List tempList=new ArrayList();
		 System.out.println( se.getOptions().size());
		 se.selectByVisibleText("Avatar");
		 
		  List <WebElement> options=se.getOptions();
		  for(WebElement e:options)
		  {
		  originalList.add(e.getText());
		  tempList.add(e.getText());
		  
		  
		  }
		  
		  System.out.println(originalList);
		  System.out.println(tempList);
			  Collections.sort(tempList);
			  System.out.println(tempList);
		  
		  
	}

}

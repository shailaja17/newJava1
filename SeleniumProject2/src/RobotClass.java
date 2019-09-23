import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/yearly_calendar_workbook/");
        driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/ul/li[3]/a")).click();
	
	Robot robot=new Robot();
	
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	
	
	}
	

}

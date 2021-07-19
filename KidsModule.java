package myntra_Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KidsModule {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\amol\\Desktop\\Sonali\\selenium jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.myntra.com/");
			Thread.sleep(2000);
			
			//Select Kids module and perform action Mousehover for further option selection
			Actions b=new Actions(driver);
			b.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[3]/div/a"))).perform();
	
			//To select dresses from girls)
driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[3]/div/div/div/div/li[2]/ul/li[2]/a")).click();

//To select Boys radio button from filters
driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label")).click();

///This is a defect,As we choose girls module from kids then there should not be a boys module
	}

}

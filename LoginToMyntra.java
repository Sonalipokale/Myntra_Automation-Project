package myntra_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginToMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\amol\\Desktop\\Sonali\\selenium jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			//To Open Url
			driver.get("http://www.myntra.com");
			Thread.sleep(2000);
			
			//To check Url
			System.out.println(driver.getCurrentUrl());
			
			//To check Title of current page
			System.out.println(driver.getTitle());
			
			//To go to Profile icon by using Mousehover
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/div/div[1]/span[2]"))).perform();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a")).click();
	
	//To enter Mobile number for login
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/input")).sendKeys("9130944793");
	driver.findElement(By.className("submitBottomOption")).click();
	
	//After entering Mobile Number we get otp,this process cant done using Automation.so Entering Otp action perform manually
	}

}

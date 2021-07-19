package myntra_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectWomenModule {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\amol\\Desktop\\Sonali\\selenium jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.myntra.com/");
			Thread.sleep(2000);
			
			//Select Women module and perform action Mousehover for further option selection
			Actions b=new Actions(driver);
			b.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[2]/div/a"))).perform();
	
			//To select Indian and fusion wear)
driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[2]/div/div/div/div/li[1]/ul/li[1]/a")).click();
	
//To select categories (Select Checkbox)
driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/div")).click();
	driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[5]/label/div")).click();

	//To select Brand
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[1]/section/div/div[3]/ul")).click();
	
	// To Select Price
	driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[4]/ul/li[1]/label/div")).click();
	
	//To Scroll Down and Select colour
	driver.manage().window().maximize();   //maximize window

	//it is an interface to convert webdriver object to javascript obj
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	Thread.sleep(2000);
	//scroll upto bottom of height
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
System.out.println("page end");
Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-2000)");
	Thread.sleep(2000);
	
	//Select Color
	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[1]/section/div/div[5]/ul/li[1]/label/div")).click();
	
	//To Scroll Down and Select colour
		driver.manage().window().maximize();   //maximize window
		//it is an interface to convert webdriver object to javascript obj
		
		Thread.sleep(2000);
		//scroll upto bottom of height and To select Discount Range
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	System.out.println("page end");
	Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(2000);
		
		//Select Color
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[1]/section/div/div[5]/ul/li[1]/label/div")).click();
		
		Thread.sleep(2000);
	//To select Discount Range
	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[1]/section/div/div[6]/ul/li[2]/label/input")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[1]/section/div/div[6]/ul/li[2]/label/div")).click();

	//To Select Country of Origin
	//driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[2]/div/div[1]/section/div[1]/div[2]/ul/li[3]/label/h4")).click();
	
	//To Select India 
	//driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[2]/div/div[1]/section/div[1]/div[2]/div/ul/li[2]/label/input")).click();
	
	//To Check functionality of wishlist
	driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[1]/span[2]")).click();	
	}

}

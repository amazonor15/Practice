package allPages;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Generic {

	WebDriver driver;


	public void getDriver(String driverValue) {
		
		if (driverValue.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/shahid2/Desktop/bootCamp1/pnt2-mct-autoproject/chromedriver");
			
			driver = new ChromeDriver();

		} else if (driverValue.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/shahid2/eclipse-workspace/CapitalOne1/Browser/geckodriver");
			
			driver = new FirefoxDriver();
			
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
	
//	public void implicitWait() {
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	}

	
	public void getUrl(String url) {
		driver.get(url);
	}


	public WebElement findElement(String element) {

		WebElement eweb= null;
		
		if (element.contains("Id")) {
			eweb = driver.findElement(By.id(element.split(":")[1]));

		} else if (element.contains("xpath")) {
			eweb = driver.findElement(By.xpath(element.split(":")[1]));

		}else if (element.contains("class")) {
			eweb = driver.findElement(By.className(element.split(":")[1]));
			
		}else if (element.contains("cssSelector")) {
			eweb = driver.findElement(By.cssSelector(element.split(":")[1]));

		}else if (element.contains("tagName")) {
			eweb = driver.findElement(By.tagName(element.split(":")[1]));

		}else if (element.contains("linktext")) {
			eweb =	driver.findElement(By.linkText(element.split(":")[1]));

		}else if (element.contains("name")) {
			eweb =	driver.findElement(By.name(element.split(":")[1]));
		} 
		return eweb;
	}

	
	public void teardown() {
		driver.close();
	}



public void mousHover(String element) {
	
	
	
	Actions actions = new Actions(driver);
	
	if (element.contains("Id")) {
		 actions.moveToElement (driver.findElement (By.id(element.split(":")[1]))).build().perform();

	} else if (element.contains("xpath")) {
		actions.moveToElement (driver.findElement (By.xpath(element.split(":")[1]))).build().perform();


	}else if (element.contains("class")) {
		actions.moveToElement (driver.findElement (By.className(element.split(":")[1]))).build().perform();

		
	}else if (element.contains("cssSelector")) {
		actions.moveToElement (driver.findElement (By.cssSelector(element.split(":")[1]))).build().perform();


	}else if (element.contains("tagName")) {
		actions.moveToElement (driver.findElement (By.tagName(element.split(":")[1]))).build().perform();


	}else if (element.contains("linktext")) {
		actions.moveToElement (driver.findElement (By.linkText(element.split(":")[1]))).build().perform();


	}else if (element.contains("name")) {
		actions.moveToElement (driver.findElement (By.name(element.split(":")[1]))).build().perform();

	} 
	
	
}









}


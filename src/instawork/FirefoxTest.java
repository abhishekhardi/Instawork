package instawork;


import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;*/

import pageclass.GoogleSearchPage;

public class FirefoxTest {
	private WebDriver driver;
	GoogleSearchPage searchpage;
	
  @Test
  public void testFirefox() throws InterruptedException{	  
	   System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		searchpage = new GoogleSearchPage(driver);	
		String baseurl = "https://www.google.com";
		driver.get(baseurl);	
		driver.manage().window().maximize();
		
		searchpage.Textbox.sendKeys("InstaWork");       
		searchpage.Textbox.sendKeys(Keys.ENTER);
        
     	//List<WebElement> links =  driver.findElements(By.tagName("cite"));
	  	for (int i = 0; i< searchpage.links.size(); i++){
		int j = i+1;
		String LinkText = searchpage.links.get(i).getText();	
		System.out.println(LinkText);
		if (LinkText.equals("https://www.instawork.com/")){
			System.out.println("www.instawork.com appeared at "+j+" position");
			break;				
		}
		
	}
  }
	}
  

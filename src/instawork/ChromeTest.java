package instawork;


import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageclass.GoogleSearchPage;
/*import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;*/



public class ChromeTest{
	private WebDriver driver;
	GoogleSearchPage searchpage;
	
	@Test

	public void testChrome() throws InterruptedException{
		
		String baseurl = "https://www.google.com";
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		searchpage = new GoogleSearchPage(driver);	
		
		searchpage.Textbox.sendKeys("InstaWork");       
		searchpage.Textbox.sendKeys(Keys.ENTER);
		
		List<WebElement> links =  driver.findElements(By.tagName("cite"));
		System.out.println(links.size());
		for (int i = 0; i< links.size(); i++){
			int j = i+1;
			String LinkText = links.get(i).getText();
			System.out.println(LinkText);
			if (LinkText.equals("https://www.instawork.com/")){
				System.out.println("www.instawork.com appeared in "+j+" position");
				break;				
			}
			
	}

  }
}



package pageclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;

public class GoogleSearchPage { 
 WebDriver driver;
 
@FindBy(id="lst-ib")
public WebElement Textbox;

@FindBy(tagName="cite")
public List<WebElement> links;

	
public GoogleSearchPage(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

}

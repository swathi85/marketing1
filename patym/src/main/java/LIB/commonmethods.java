package LIB;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class commonmethods {
	WebDriver driver;
	//Actions act;
	Alert alert;

	public void startbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\tet\\Selenium_Demp\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();*/
		 driver.get("http://apps.qaplanet.in//qahrm");
	}
	public void MaximiseBrowser()
	{
		driver.manage().window().maximize();
	}
	
	public WebElement webelementid(String identifier,String locator)
	{
		
		WebElement e;
		switch(identifier)
		{
		case "id":
			e=driver.findElement(By.id(locator));
			break;
		case "name":
			e=driver.findElement(By.name(locator));
			break;
		case "className":
			e=driver.findElement(By.className(locator));
			break;
		case "tagName":
			e=driver.findElement(By.tagName(locator));
			break;
		case "linkText":
			e=driver.findElement(By.linkText(locator));
			break;
		case "xpath":
			e=driver.findElement(By.xpath(locator));
			break;
		case "cssSelector":
			e=driver.findElement(By.cssSelector(locator));
			break;
		case "partialLinkText":
			e=driver.findElement(By.partialLinkText(locator));
			break;
			default :
				System.out.println("locator not found");
		e=null;
		}
		return e;
		}
	//sendkeys();
	
	public void sendkeys(String identifier,String locator,String content)
	{
		WebElement e=webelementid(identifier,locator);
		e.sendKeys(content);
	}
	//clear()tesxt fields
	public void cleartextfields(String identifier,String locator){
		WebElement e=webelementid(identifier,locator);
		e.clear();
	}
	//click	();
	public void clickbutton(String identifier,String locator){

		WebElement e=webelementid(identifier,locator);

	e.click();
	}
	
	//verify text();
	public void  verifytextpresent(String identifier,String locator,String text) {
		WebElement e=webelementid(identifier, locator);
		if(e.getText().equals(text))
		{
			System.out.println(text +"-----is displayed"); 
			
		}
		else
		{
			System.out.println(text +"-----is not displayed"); 
		}
		
	}
	public void verifyElementPresent (String identifier,String locator)
	{
		WebElement e=webelementid(identifier, locator);
		if(e.isDisplayed())
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
	public void verifytitle(String title)
	{
		if (driver.getTitle().equals(title))
		{
			System.out.println(title +"------Title is displayed");
		}
		else
		{
			System.out.println(title +"------Title is Not displayed");
		}
		
	}
	public void Actionseg(String identifier,String locator)
	{
		Actions act=new Actions(driver);
		WebElement e=webelementid(identifier, locator);
		act.moveToElement(e).perform();
		
	}
	public void switchtoframe1(String name)
	{
		driver.switchTo().frame(name);
	}
	public void Alertseg(String text)
		{
		alert=driver.switchTo().alert();
					if(alert.getText().equals(text)){
				alert.accept();
			System.out.println("alert messag ");
			
		}
			else{
			alert.dismiss();
			System.out.println("alet not displayed");
			}
			
	}
		
	
	public void closebrowser() {
		driver.close();
		

	}
	public void quitebrowser()
	{
		driver.quit();
	}

}

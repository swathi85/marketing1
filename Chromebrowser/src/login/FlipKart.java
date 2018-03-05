package login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart 
{	public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "D:\\swathireddyv\\chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(Driver, 30);
	Driver.manage().window().maximize();
	Driver.get("https://www.flipkart.com/");
	
	String s1=Driver.getTitle();
	System.out.println(s1);
	
	if(s1.equals("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More home page displayed")){
		System.out.println("home page displayed");
	}
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div[2]/div/div/button"))).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/head/iframe")));
	wait.until(ExpectedConditions.titleContains("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"));
	if(Driver.getTitle().equals("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More")){
		System.out.println("home page displayed");
	}
	else {
		System.out.println("Not displayed");
	}	
	
}
}
                                                                                                                                                  
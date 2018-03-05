package login;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.management.openmbean.KeyAlreadyExistsException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Chromelogin {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\swathireddyv\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://accounts.google.com/SignUp");
		Driver.manage().window().maximize();
	    Driver.findElement(By.linkText("Sign in")).click();
		Driver.findElement(By.id("identifierId")).sendKeys("swathireddy.v18@gmail.com");
		WebElement next=Driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("swathireddy12");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//div[@class='vmZ0T']/a[2]")).click();
		Driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id(":8x")).sendKeys("vdurga207@gmail.com");
		Driver.findElement(By.name("subjectbox")).sendKeys("Sample");
				Robot R=new Robot();
		Driver.findElement(By.id(":a4")).click();
		StringSelection SS=new StringSelection("C:\\Users\\QAP03\\Downloads\\ece.doc");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
		R.delay(1000);
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		Driver.findElement(By.id(":86")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("#\3a 49 > div > div.aio.UKr6le > span > a")).click();
		
		Driver.findElement(By.xpath("//span[@class='nU n1']/a[1]")).click();
	
		
		Driver.findElement(By.linkText("Sign out")).click();
		R.keyPress(KeyEvent.VK_ENTER);
		
	}

}

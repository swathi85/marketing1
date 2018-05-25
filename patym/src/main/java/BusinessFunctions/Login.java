package BusinessFunctions;

import java.io.File;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import LIB.commonmethods;

public class Login {
	
	commonmethods c=new commonmethods();
	Properties locaters=new Properties();
		File locfile=new File("D:\\patym\\src\\main\\java\\Elementlocators\\login.properties");
		
		
	public void setup() throws Exception, Exception
	{
		c.startbrowser();
		
		locaters.load(new FileInputStream(locfile));
	}
	public void logintoapp() throws Exception {
		
		String tit=locaters.getProperty("Title");
		String unid=locaters.getProperty("usernameIdenti");
		String unloc=locaters.getProperty("usernameLocat");
		String uncon=locaters.getProperty("usercontent");

		String pwdid=locaters.getProperty("passwordIdenti");
		String pwdloc=locaters.getProperty("passwordLocat");
		String pwdcon=locaters.getProperty("passwordcontent");

		String loginid=locaters.getProperty("loginIdenti");
		String loginloc=locaters.getProperty("loginLocat");
		String clearid=locaters.getProperty("clearIdenti");
		String clearloc=locaters.getProperty("clearLocat");


	c.verifytitle(tit);
	c.verifyElementPresent(unid, unloc);
	c.verifyElementPresent(pwdid, pwdloc);
	c.verifyElementPresent(loginid, loginloc);
	c.verifyElementPresent(clearid, clearloc);
	
	 Thread.sleep(3000);
	c.cleartextfields(unid, unloc);
	c.sendkeys(unid,unloc,uncon);
	
	c.cleartextfields(pwdid,pwdloc);
	c.sendkeys(pwdid,pwdloc,pwdcon);
	
	c.clickbutton(loginid, loginloc);
	
	
	}

	
	

}

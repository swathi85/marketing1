package BusinessFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import LIB.commonmethods;

public class AddEmployee {
	
	commonmethods c1=new commonmethods();
	
Properties loca=new Properties();
File F1=new File("D:\\patym\\src\\main\\java\\Elementlocators\\login.properties");
public void Addemployeeapp() throws Exception, Exception
{
	c1.startbrowser();
	loca.load(new FileInputStream(F1));
}
public void addemp()

{
	//String pimover=loca.getProperty("pimidenti");
	String pimloc=loca.getProperty("pimLocat");
	String Addempid=loca.getProperty("Addempidenti");
	String Addemploc=loca.getProperty("Addemploc");
	String saveid=loca.getProperty("name");
	String switchfra=loca.getProperty("switchframeidenti");
    String saveloc=loca.getProperty("savebutton");
   String alertme=loca.getProperty("alertmessageidintei");
    
	c1.Actionseg("linkText", "PIM");
	c1.clickbutton(Addempid, Addemploc);
	c1.switchtoframe1(switchfra);
	c1.clickbutton(saveid, saveloc);
	c1.Alertseg(alertme);
	
}


}

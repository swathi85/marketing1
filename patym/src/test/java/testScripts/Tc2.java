package testScripts;

import org.testng.annotations.Test;

public class Tc2 extends RootTest{
@Test
public void Addemployee() throws Exception
{
	l.setup();
	l.logintoapp();
	Thread.sleep(4000);
	aadd.addemp();
}
}

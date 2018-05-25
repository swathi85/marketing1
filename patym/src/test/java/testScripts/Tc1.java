package testScripts;

import org.testng.annotations.Test;

public class Tc1 extends RootTest{

	@Test
	public void login() throws Exception
	{
		l.setup();
		l.logintoapp();

	}

}

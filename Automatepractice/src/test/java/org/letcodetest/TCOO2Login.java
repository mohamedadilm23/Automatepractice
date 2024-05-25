package org.letcodetest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.letcodebaseclass.Driverbaseclass;
import org.letcodepages.loginpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCOO2Login extends Driverbaseclass
{
	@Test
	public  void login  () 
	{

		loginpage lp=new loginpage();
		boolean useremail=lp.getuseremaillabel();
		Assert.assertEquals(useremail, true);
		boolean password=lp.getpasswordabel();
		Assert.assertTrue(password);




		new loginpage()
		.Enteremail("admin")
		.Enterpassword("pass@123")
		.Enterclicklogin();

	}

}

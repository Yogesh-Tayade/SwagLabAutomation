package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.AddtoCartpage;
import ObjectRepository.cartpage;
import ObjectRepository.checkoutdetailpage;
import ObjectRepository.loginPage;
import TestCompnents.TestBaseClasss;
@Listeners(TestCompnents.Listener.class) 

public class checkouttestcase extends TestBaseClasss{
	
	@Test
	public void checkout()
	{
		driver.get(baseurl);
		loginPage login=new loginPage(driver);
		login.username().sendKeys(username);
		login.password().sendKeys(password);
		login.loginbtn().click();
		
		AddtoCartpage Addcart=new AddtoCartpage(driver);
		Addcart.addIntocart();
		
		cartpage cart=new cartpage(driver);
		cart.clickoncart().click();
		cart.printTextMsg();
		cart.checkout().click();
		
		checkoutdetailpage check=new checkoutdetailpage(driver);
		check.fname().sendKeys("Yogesh");
		check.Lname().sendKeys("Tayade");
		check.zip().sendKeys("443103");
		check.continues().click();
		check.finish().click();
		check.thanku();
	}
}









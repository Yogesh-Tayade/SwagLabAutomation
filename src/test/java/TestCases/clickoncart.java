package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.AddtoCartpage;
import ObjectRepository.cartpage;
import ObjectRepository.loginPage;
import TestCompnents.TestBaseClasss;
@Listeners(TestCompnents.Listener.class) 
public class clickoncart extends TestBaseClasss {
	@Test
	public void clickoncart()
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
	}

}

package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.AddtoCartpage;
import ObjectRepository.loginPage;
import TestCompnents.TestBaseClasss;
@Listeners(TestCompnents.Listener.class) 
public class AddTocartTestcase extends TestBaseClasss {

	@Test
	public void clickonAddtocart()
	{
		driver.get(baseurl);
		loginPage login=new loginPage(driver);
		login.username().sendKeys(username);
		login.password().sendKeys(password);
		login.loginbtn().click();
		
		AddtoCartpage Addcart=new AddtoCartpage(driver);
		Addcart.addIntocart();
	}
}

package TestCases;

import org.testng.annotations.Test;

import ObjectRepository.AddtoCartpage;
import ObjectRepository.loginPage;
import TestCompnents.TestBaseClasss;

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

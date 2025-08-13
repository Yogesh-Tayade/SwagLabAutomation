package TestCases;

import org.testng.annotations.Test;

import ObjectRepository.loginPage;
import TestCompnents.TestBaseClasss;


public class LoginTestcases extends TestBaseClasss{
	@Test
	public void loginBycorrectCredential()
	{
		driver.get(baseurl);
		loginPage login=new loginPage(driver);
		login.username().sendKeys(username);
		login.password().sendKeys(password);
		login.loginbtn().click();
	
	}
	
}

package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutdetailpage {
public static WebDriver driver;	
	
	public checkoutdetailpage(WebDriver driver)
	{
		this.driver=driver;
	}
	By FirstName=By.id("first-name");
	public WebElement fname()
	{
		return driver.findElement(FirstName);
	}
	By LastName=By.id("last-name");
	public WebElement Lname()
	{
		return driver.findElement(LastName);
	}
	
	By zip=By.id("postal-code");
	public WebElement zip()
	{
		return driver.findElement(zip);
	}
	
	By clickonContinue=By.id("continue");
	public WebElement continues()
	{
		return driver.findElement(clickonContinue);
	}
	
	By clickonfinsh=By.id("finish");
	public WebElement finish()
	{
		return driver.findElement(clickonfinsh);
	}
	By thankyoumsg =By.xpath("//*[text()='Thank you for your order!']");
	public void thanku()
	{
		WebElement textmsg=driver.findElement(thankyoumsg);
		System.out.println(textmsg.getText());
	}
	
}

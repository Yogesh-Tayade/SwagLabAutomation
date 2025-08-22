package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartpage {
	public static WebDriver driver;	

	public cartpage(WebDriver driver)
	{
		this.driver=driver;
	}
	By clickoncart=By.xpath("//*[@class='shopping_cart_link']");
	public WebElement clickoncart()
	{
		return driver.findElement(clickoncart);
	}
	
	By textmsg=By.xpath("//*[@class='cart_item_label']");
	public void printTextMsg()
	{
	    WebElement s = driver.findElement(textmsg);
	    System.out.println(s.getText());  // just print
	}
	
	By clickcheckout = By.id("checkout");

	public WebElement checkout()
	{
	    return driver.findElement(clickcheckout);  
	}
}

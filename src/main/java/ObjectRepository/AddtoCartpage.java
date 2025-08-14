package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCartpage {
	public static WebDriver driver;	
	public AddtoCartpage(WebDriver driver)
	{
	this.driver=driver;	
	
	}
	By addIntocart=By.xpath("//*[@class='btn btn_primary btn_small btn_inventory ']");
	public void addIntocart()
	{
		List<WebElement>products=driver.findElements(addIntocart);

	for(WebElement ch:products)
	{
		ch.click();
	}
	}
	
}

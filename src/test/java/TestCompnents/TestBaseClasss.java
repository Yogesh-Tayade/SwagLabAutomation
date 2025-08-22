package TestCompnents;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;

import ObjectRepository.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.readDatadfromPropertiesFile;

public class TestBaseClasss {
	public static WebDriver driver;
	public loginPage login;

	readDatadfromPropertiesFile read = new readDatadfromPropertiesFile();
	public String baseurl = read.getapplicationurl();
	public String username = read.getusername();
	public String password = read.getpassword();

	@BeforeClass
	public WebDriver setupmethod() {
 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public String getscreenshot(String testCaseName, WebDriver driver) {
		File obj = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(obj, new File("C:/Pooja Kolte/army.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	FileHandler.copy(obj, new File("user.dir")+"//reports"+testCaseName+".png");
		return testCaseName;

	}

	public loginPage launchApplication() {
		driver = setupmethod();
		login = new loginPage(driver);
		login.goTo();
		return login;
	}
}

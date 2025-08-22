package TestCompnents;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public String getscreenshot(String testCaseName, WebDriver driver) {
	    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    String destinationPath = System.getProperty("user.dir") + "/reports/" + testCaseName + ".png";

	    try {
	        FileHandler.copy(srcFile, new File(destinationPath));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return destinationPath; // ✅ return full path, not just testCaseName
	}

	public loginPage launchApplication() {
		driver = setupmethod();
		login = new loginPage(driver);
		login.goTo();
		return login;
	}
}

package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CodeBase {

	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public CodeBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src/test/java/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
		
	}
		
	public static void iniciarBrowser(String tag) {
		String browserName = prop.getProperty("browser");
		
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/igorc/Documents/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/likin/Documents/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(CodeUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(CodeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}



		
		
		
	
	

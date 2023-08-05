package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	WebDriver driver;
	public Properties prop;

	public WebDriver launchBrowser() throws Exception {
		prop = new Properties();

		File file = new File("src\\main\\java\\resources\\data.properties");

		FileInputStream fis = new FileInputStream(file);

		prop.load(fis);
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}

	public String takeScreenShot(String testName, WebDriver driver) throws IOException {
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date(0));

		File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotFilePath = System.getProperty("user.dir") + "\\Screenshots\\" + testName + timestamp + ".png";
		FileUtils.copyFile(srcScreenshot, new File(screenshotFilePath));
		return screenshotFilePath;
	}

}

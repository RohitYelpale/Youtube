package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePage;

public class HomePageTest extends Base {
	public WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception {
		driver = launchBrowser();
		driver.get(prop.getProperty("url"));
}

	@Test
	public void changeDeviceTheme() {
		HomePage ele = new HomePage(driver);
		ele.setting.click();
		ele.appearance.click();
		ele.darkTheme.click();
	}
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//yt-icon-shape[@class='style-scope yt-icon'])[11]")
	public WebElement setting;
	@FindBy(xpath = "(//div[@id='label'])[2]")
	public WebElement appearance;
	@FindBy(xpath = "//yt-formatted-string[@id='label'and text()='Dark theme']")
	public WebElement darkTheme;

}

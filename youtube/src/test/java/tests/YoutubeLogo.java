package videotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeLogo {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ukkul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   	driver.manage().window().maximize();
	   	Thread.sleep(5000);
	      driver.get("https://www.youtube.com");
          WebElement logo = driver.findElement( By.xpath("//*[@id=\"logo-icon\"]"));
	
	if (logo.isDisplayed()) {
		
		System.out.println("Logo is displayed");
	}
	else {
		System.out.println("Logo is not displayed");
	}
	
	
	
	}

}

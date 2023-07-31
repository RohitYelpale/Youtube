package videotest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videolaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ukkul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
	     driver.get("https://www.youtube.com/@JONATHANGAMINGYT");
	     Thread.sleep(8000);
         WebElement ele = driver.findElement(By.partialLinkText("JONATHAN TWO THUMB GYRO HANDCAM | "));
         ele.click();
         js.executeScript("window.scrollBy(500,5000)");

	     Thread.sleep(2000);

	}

}

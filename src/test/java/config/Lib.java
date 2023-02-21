package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.cucumber.messages.internal.com.google.protobuf.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lib {
	public static WebDriver driver;
	public static void browser(String browserName, String URL) {
		if(browserName .equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(URL);
		}
	}
	public static void impWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void frame(String myxp) {
		WebElement ele = driver.findElement(By.xpath(myxp));
		driver.switchTo().frame(ele);
	}
}

package Selinium_Programs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testlaptop4\\eclipse-workspace\\Testing_Programs\\src\\Selinium_Programs\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		
		File source = sc.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Testlaptop4\\eclipse-workspace\\Testing_Programs\\Schreenshot.png");
		
		FileUtils.copyFile(source, dest);
		
		driver.quit();

		

	}

}

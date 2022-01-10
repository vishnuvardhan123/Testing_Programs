package Selinium_Programs;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testlaptop4\\eclipse-workspace\\Java_Programs\\src\\Selinium_Programs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		String parent_windiow = driver.getWindowHandle();
		
		Set<String> child_window =driver.getWindowHandles();
		
//		System.out.println(child_window);
//		
//		System.out.println(parent_windiow);
		
		Iterator<String> I1= child_window.iterator();

		while(I1.hasNext())
		{

			String window=I1.next();

			if(!parent_windiow.equals(window))
				{
				driver.switchTo().window(window);
		
				System.out.println(driver.switchTo().window(window).getTitle());
		
				driver.close();
				
				}
		
		
		}
		
		driver.switchTo().window(parent_windiow);
	}

	

}

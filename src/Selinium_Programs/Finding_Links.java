package Selinium_Programs;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_Links {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testlaptop4\\eclipse-workspace\\Java_Programs\\src\\Selinium_Programs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		String parent_windiow = driver.getWindowHandle();
		
		Set<String> child_window =driver.getWindowHandles();
		
		System.out.println(child_window);
		
		System.out.println(parent_windiow);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int total_count = links.size();

		System.out.println(total_count);
		
//		Iterator<WebElement> it = links.iterator();
//	
//		String url = it.next().getAttribute("href");
//		
//		try {
//		huc = (HttpURLConnection)(new URL(url).openConnection());
//
//		huc.setRequestMethod("HEAD");
//
//		huc.connect();
//
//		respCode = huc.getResponseCode();
//
//		if(respCode >= 400){
//		System.out.println(url+" is a broken link");
//		}
//		else{
//		System.out.println(url+" is a valid link");
//		}
//
//		} catch (MalformedURLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		}
//		}
//
//		driver.quit();
//			
	
	driver.quit();
		
	}

}

package JavaBasics;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class trySelenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/user/local/Ruchika/Downloads/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.gmail.com/");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.findElement(By.id("")).sendKeys("abc@gmail.com");
		dr.findElement(By.className("click")).click();
		String str = dr.getTitle();
		String expStr = "gmail";
		dr.close();
		if(str == expStr) {
			System.out.println("Test passed");
		}
		elseif(str.equalsIgnoreCase(expStr)){
			System.out.println();
		}
	}

}

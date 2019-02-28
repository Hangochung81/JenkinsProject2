package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", getProjectPath() + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
  
	}
	
	public static String getProjectPath() {
		String workingDir = System.getProperty("user.dir");
		return workingDir;
	}

}

package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestCase2 {
	
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = DemoClass2.getProjectPath() + "\\Driver\\chromedriver.exe";
    public WebDriver driver ; 
	
	@Test
	public void testCase2() {
		
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
	}

	@BeforeTest
	public void beforeTest() {
		
        System.out.println("launching chrome browser"); 
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
		
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

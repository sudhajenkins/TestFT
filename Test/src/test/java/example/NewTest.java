package example;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private WebDriver driver;
	
	
  @Test
  public void testEasy() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		 
	  driver=new ChromeDriver();
	//  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in");
	  String title = driver.getTitle();	
	  Assert.assertEquals(title, "Google");
	  
	//  WebElement Searchbox = driver.findElement(By.id("lst-ib"));
	  //Searchbox.sendKeys("Software Testing Studio");
	//  WebElement search_button = driver.findElement(By.name("btnK"));
	 // String text = search_button.getAttribute("value");
	  //Assert.assertEquals(text, search_text, "Text not found!");
	  
	/* driver.get("http://localhost:8094/spring-mvc-example/");  
		//String title = driver.getTitle();	
		String title = driver.getCurrentUrl();
		System.out.println("Getting the title:"+title);
		WebElement name=driver.findElement(By.id("userName"));
		
		name.sendKeys("sudhas");
        driver.findElement(By.id("u_0_b")).click();
		System.out.println("Getting the title:"+name);
		//Assert.assertTrue(title.contains("google"));
	//	Assert.assertEquals(title, "Home");*/
	  
		
	  
  }
  @BeforeTest
  public void beforeTest() {
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

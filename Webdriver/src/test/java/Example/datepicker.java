package Example;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class datepicker {
	  @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhilteja.maram\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	  WebDriver d1;
	  	  d1=new ChromeDriver();
	  	  
	  	  d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
		  d1.get("http://www.leafground.com/pages/Calendar.html");
		  
		  JavascriptExecutor jse=(JavascriptExecutor) d1;
		  
		  jse.executeScript("document.getElementById('datepicker').value='10/12/2021'");
	  }
	}




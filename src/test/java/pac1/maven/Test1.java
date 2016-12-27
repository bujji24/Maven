package pac1.maven;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void f() throws Exception
  {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bujji24\\Downloads\\geckodriver\\geckodriver.exe");
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
  }
  
}

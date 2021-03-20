package tests;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 
{
	@Test
	@Parameters({"url","browser"})
	public void method(String x,String y) throws Exception
	{
	URL u=new URL(x); //node url
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("browserName",y);
	RemoteWebDriver driver=new RemoteWebDriver(u,dc);
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in");
	driver.close();
	}

}

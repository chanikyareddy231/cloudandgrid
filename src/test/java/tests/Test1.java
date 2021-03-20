package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 {

	public static void main(String[] args) throws Exception
	{
		URL u1=new URL("http://192.168.55.102:5556/wd/hub"); //node url
		DesiredCapabilities dc1=new DesiredCapabilities();
		dc1.setCapability("browserName","chrome");
		RemoteWebDriver driver1=new RemoteWebDriver(u1,dc1);
		driver1.manage().window().maximize();
		driver1.get("https://www.google.co.in");
		driver1.close();
		URL u2=new URL("http://192.168.55.102:5557/wd/hub"); //node url
		DesiredCapabilities dc2=new DesiredCapabilities();
		dc2.setCapability("browserName","firefox");
		RemoteWebDriver driver2=new RemoteWebDriver(u2,dc2);
		driver2.manage().window().maximize();
		driver2.get("https://www.google.co.in");
		driver2.close();
		URL u3=new URL("http://192.168.55.102:5558/wd/hub"); //node url
		DesiredCapabilities dc3=new DesiredCapabilities();
		dc3.setCapability("browserName","edge");
		RemoteWebDriver driver3=new RemoteWebDriver(u3,dc3);
		driver3.manage().window().maximize();
		driver3.get("https://www.google.co.in");
		driver3.close();
		

	}

}

package tests;

import org.openqa.grid.selenium.GridLauncherV3;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterChrome 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		String x[]=new String[]{"-role","node","-hub","http://192.168.55.102:4444/grid/register",
				"-browser","browserName=chrome","-port","5556"};
		GridLauncherV3.main(x);
	}
}

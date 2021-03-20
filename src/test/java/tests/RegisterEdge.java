package tests;

import org.openqa.grid.selenium.GridLauncherV3;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterEdge 
{
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		GridLauncherV3.main(new String[]{"-role","node","-hub","http://192.168.55.102:4444/grid/register",
				"-browser","browserName=edge","-port","5558"});
	}
}

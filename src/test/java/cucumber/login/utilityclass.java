package cucumber.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class utilityclass {
	
		static WebDriver driver;

		public static WebDriver startBrowser(String browsername,String url)
		{
			if(browsername.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2A.04.30\\Desktop\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_C2A.04.30\\Desktop\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		        driver= new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
		}

	}



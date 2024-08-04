package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;

	public BaseClass() {
		prop = new Properties();

		String path = System.getProperty("user.dir") + "/src/main/java/ConfigurationLayer/config.properties";

		FileInputStream fis;

		try {
			fis = new FileInputStream(path);
			prop.load(fis);

		} catch (Exception e) {

			e.getLocalizedMessage();
		}

	}

	public static void intializtion(String browsername ) {
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		} else if (browsername.equalsIgnoreCase("headless")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			driver = new ChromeDriver();
		}

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies(); 
		
		String url =prop.getProperty("url");
		driver.get(url);

	}

}

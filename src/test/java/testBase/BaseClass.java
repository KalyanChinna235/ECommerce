package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {

	public static WebDriver driver;
	public static Logger log;
    public static Properties p;
	@BeforeClass
	@Parameters({"os","browser"})
	public void setUp(String os,String br) throws InterruptedException, IOException {
		// Loading properties file...
		FileReader file = new FileReader(".//src/test/resources/config.properties");
		p = new Properties();
		p.load(file);
		
		// Loading log4j file...
		log = LogManager.getLogger(BaseClass.class);
		log.info("ChromeDriver Setup is Done.");
		
		switch (br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver();
		break;
		case "edge": driver = new EdgeDriver();
		break;
		default : System.out.println("No matching browser...");
		return;
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@AfterClass
	public void tearDown() {
		// driver.close();
	}

//	public String randomString() {
//
//		String random_String = RandomStringUtils.randomAlphabetic(6);
//		return random_String;
//
//	}
//
//	public String randomAlphaNumeric() {
//
//		String str = RandomStringUtils.randomAlphabetic(3);
//		String num = RandomStringUtils.randomNumeric(3);
//		return (str + "@" + num);
//	}

}

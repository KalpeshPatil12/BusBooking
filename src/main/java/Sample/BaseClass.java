//package Sample;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class BaseClass {
//	
//public static WebDriver driver=null;
//	
//	public static void getbrowserInstance(String browser) {
//		
//	switch(browser)
//	
//	{
//	
//	case "Chrome":
//		
//    WebDriverManager.chromedriver().setup();
// 
//    driver=new ChromeDriver();
//    
//    break;
//    
//	case "Edge":
//	
//	WebDriverManager.edgedriver().setup();
//
//	driver=new EdgeDriver();
//	
//	break;
//	
//	case "FireFox":
//		
//	WebDriverManager.firefoxdriver().setup();
//		
//	driver=new FirefoxDriver();
//	
//	default:
//		
//	WebDriverManager.chromedriver().setup();
//			
//	driver=new ChromeDriver();
//
//	}
//		
//	}
//
//}

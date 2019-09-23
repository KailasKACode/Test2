import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NuakriWale {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver dri=new ChromeDriver();
	dri.get("https://www.naukri.com/");
	dri.manage().window().maximize();
	//dri.manage().timeouts().pageLoadTimeout(1000, TimeUnit.MICROSECONDS);
	String title=dri.getTitle();
	System.out.println(title);
	dri.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueAndAttri {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\091819\\AttributeAndValue\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("vishnu");
		String c = name.getAttribute("class");
		System.out.println(c);
		String f = name.getAttribute("value");
		System.out.println(f);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("welcome");
		String d = pass.getAttribute("class");
		System.out.println(d);
		String g = pass.getAttribute("value");
		System.out.println(g);
		WebElement btnclick = driver.findElement(By.xpath("//input[@value='Log In']"));
		String attribute = btnclick.getAttribute("type");
		System.out.println(attribute);
		String b = btnclick.getText();
		System.out.println(b);
	}

}

package LoginFacebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {


		public static void main(String[] args) {
		
	     // adding something in this code after login code

			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("9970848029");
			driver.findElement(By.id("pass")).sendKeys("406721");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//new things added to check Git repo to Jenkins connection through Webhook plugins
			//click on friends //Any way we are commiting below code as facebook there problem of voice recognition authenticaion always due to that below line is not working as UI is not opening
			//driver.findElement(By.xpath("(//span[contains(text(),'Friends')]")).click();
		


}
}

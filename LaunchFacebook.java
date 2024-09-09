package sample;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import java.time.Duration;

public class LaunchFacebook {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		if (title.contains("Facebook")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Dharshu");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("dharhini1804@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345@12345");
	}

		
	}



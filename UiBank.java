package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class UiBank {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/login");
		String title = driver.getTitle();
		if (title.contains("UiBank")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dharshu@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123@123");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("dharshini");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("kumar");
		driver.findElement(By.xpath("//select[@id='sex']")).sendKeys("Female");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("Ms");
		driver.findElement(By.xpath("//select[@id='employmentStatus']")).sendKeys("Unemployed");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("18/04/2004");
		driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("Single");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Dharshini");

	}

}

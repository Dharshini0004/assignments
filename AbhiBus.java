package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='search-button']")).click();
		WebElement element = driver.findElement(By.xpath("//h5[@class='title']"));
		String text=element.getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
	    WebElement element1=driver.findElement(By.xpath("//div[@class='text-grey']"));
	    String seat=element.getText();
		System.out.println(seat);
	
		
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("//span[text()='6UA']")).click();
		driver.findElement(By.xpath("//div[@class='label']/p")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		WebElement element2=driver.findElement(By.xpath("//div[@class='selected-seat col auto']/div/div"));
		String selectedseats=element2.getText();
		System.out.println("Selected seats:" +selectedseats);
		
		WebElement element3=driver.findElement(By.xpath("//div[@class='seat-fare col auto']/div/div"));
		String totalfare=element3.getText();
		System.out.println("Total Fare:" +totalfare);
		
	}
}



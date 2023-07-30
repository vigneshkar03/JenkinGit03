package a1_googleTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_BingTest {


	@Test
	public void validateGoogleTest() throws IOException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		System.out.println(wd.getTitle());
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		System.out.println(wd.getTitle());
		
		File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:/Batch261/J1_GitTest/screenshot/bing.png"));
		
		wd.quit();
	}
}


package automation01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Webbrowser\\chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com"); // URL in the browser

		driver.findElement(By.id("email")).sendKeys("Nazrul");

		driver.findElement(By.name("pass")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();

		//System.out.println("Succsessfully logged in");


		//	driver.findElement(By.linkText("Forgot account?")).click();


		//	System.out.println(driver.findElement(By.xpath("//*[@id='identify_yourself_flow']/div/div[2]/div/table/tbody/tr[1]/td[2]/div")).getText());

		Thread.sleep(6000);

		driver.close();


	}

}
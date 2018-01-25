package automation01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","E:\\\\Webbrowser\\\\chromedriver_win32/chromedriver.exe");

		WebDriver nazrul = new ChromeDriver();

		nazrul.get("http://google.com"); // URL in browser
		Thread.sleep(2000);

		nazrul.findElement(By.xpath("//*[@id=\'hptl\']/a[1]")).click();
		Thread.sleep(2000);

		nazrul.findElement(By.xpath("/html/body/main/div/section[1]/p/a")).click();
		Thread.sleep(2000);

		nazrul.findElement(By.xpath("//*[@id=\'footer-sitemap-about-content\']/div/ul/li[1]/a")).click();

		Thread.sleep(5000);

		nazrul.quit();
	}
}
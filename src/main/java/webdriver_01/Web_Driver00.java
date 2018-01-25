package webdriver_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Driver00 {

    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the Firefox driver
        System.setProperty("webdriver.gecko.driver", "E://Webbrowser/geckodriver-v0.19.1-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Launch the Online Store Website
        driver.get("http://www.espncricinfo.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the sports website http://www.espncricinfo.com");

        //Wait for 6 Sec
        Thread.sleep(6000);

        // Close the driver
        driver.quit();
    }
}
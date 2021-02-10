package z1_01_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver_lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://docs.katalon.com/katalon-studio/docs/overview.html");
		Thread.sleep(1000);

		WebElement dark = driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div/nav[2]/div/div[2]/div[1]/ul/li/div/div[2]/label/div"));

		dark.click();
		Thread.sleep(1000);

		driver.close();
	}
}
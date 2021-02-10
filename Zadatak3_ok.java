package z1_01_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak3_ok {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver_lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		Thread.sleep(1500);
		int startCounter = 4;

		for (int i = 0; i < 5; i++) {
			dodajRed(driver, startCounter);
			startCounter++;
		}
		driver.quit();
	}

	public static void dodajRed(WebDriver driver, int tableRow) throws InterruptedException {
		WebElement dodaj = driver.findElement(By.xpath("html/body/div/div/div/div/div/div[2]/button"));
		dodaj.click();

		WebElement polje1 = driver.findElement(By.xpath("//*[@name='name']"));
		polje1.sendKeys("Borivoje Stojiljkovic");
		Thread.sleep(1000);

		WebElement polje2 = driver.findElement(By.xpath("//*[@name='department']"));
		polje2.sendKeys("QA Engineer");
		Thread.sleep(1000);

		WebElement polje3 = driver.findElement(By.xpath("//*[@name='phone']"));
		polje3.sendKeys("(381) 66270813");
		Thread.sleep(1000);

		WebElement zavrsi = driver
				.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr[" + tableRow + "]/td[4]/a[1]"));
		zavrsi.click();
		// tableRow se povecava za 1, u svakoj iteraciji, prilikom dodavanja novog reda.
	}
}

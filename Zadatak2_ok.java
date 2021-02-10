package z1_01_02;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2_ok {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite zeljeni broj zvezdica, mozete najvise 5: ");
		int brojZvezdica = input.nextInt();

		System.setProperty("webdriver.chrome.driver", "driver_lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");

		String zvezdica = "rating-star-" + brojZvezdica;
		driver.findElement(By.id(zvezdica)).click();
		Thread.sleep(1500);

		input.close();
		driver.close();
	}
}
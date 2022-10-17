package testfront;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageHome {
	@Test
	public void testNavegarPaginaHome() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://localhost:4200/");
		
		driver.findElement(By.cssSelector("a[href='/cadastro']")).click();
		driver.findElement(By.cssSelector("input[id='nome']")).sendKeys("Administrador");
		driver.findElement(By.cssSelector("input[id='senha']")).sendKeys("Admin1234");
		driver.findElement(By.cssSelector("button[id='enviar']")).click();
		driver.findElement(By.cssSelector("button[id='mostrarCadastro']")).click();
	}
}

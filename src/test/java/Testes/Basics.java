package Testes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics {
	
	WebDriver  driver;
	By Pateint_Login_button = By.xpath("//a[@data-target='#PatientLoginPop']");
	By Doctor_Login_button = By.xpath("//a[@data-target='#Doctor_Login']");
	
	@BeforeMethod
	 public void open() {
		

		/*String urladds="sfwebhtml.sourcefuse.com/automation-form-demo-for-interview";
		String uname="sfwebhtml";*/
		//String pwd="t63KUfxL5vUyFLG4eqZNUcuRQ";
		String URL = "http://docnu.com/" ;
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		  driver = new ChromeDriver();
		  //driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(URL);
		}
	@Test(enabled=true)
	public void Submit_Form_Label() {
		
		String title1=driver.findElement(Pateint_Login_button).getText();
		String title2=driver.findElement(Doctor_Login_button).getText();
		
		System.out.println(title1);
		System.out.println(title2);
		}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}

}

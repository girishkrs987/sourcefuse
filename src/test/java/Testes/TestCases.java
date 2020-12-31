package Testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.BasePage;

public class TestCases extends BasePage{
	public WebDriver  driver;
	
	//public static void main(String[] args) {
			/*@Test()
			public void OpenUrl() {
				 BasePage Obj=new BasePage();
					
				
				}*/
	
	
			
			@Test(priority=1)
			public void Submit_Form() {
				 BasePage Obj=new BasePage(WebDriver  driver);
				By First_Name = By.xpath("div[id=\"fnameInput\"]");
				driver.findElement(First_Name).sendKeys("Girish");
			}
}

package Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	// used SoftAssert class to implement soft assertion TC
	SoftAssert Sassert =new SoftAssert();
	
	WebDriver  driver;
	By First_Name = By.xpath("//*[@id=\"fnameInput\"]/input");
	By Last_Name= By.xpath("//*[@id=\"lnameInput\"]/input");
	By email= By.xpath("//*[@id=\"emailInput\"]/input");
	By curCompany= By.xpath("//*[@id=\"curCompanyInput\"]/input");
	By mobile= By.xpath("//*[@id=\"mobInput\"]/input");
	By DOB= By.xpath("//*[@id=\"DOBInput\"]/div/input");
	By Position  = By.xpath("//*[@id=\"positionInput\"]/input");
	By Portfolio= By.xpath("//*[@id=\"portfolioInput\"]/input");
	By Salary= By.xpath("//*[@id=\"salaryInput\"]/input");
	By When_can_you_start= By.xpath("//*[@id=\"whenStartInput\"]/input");
	By Address= By.xpath("//*[@id=\"address\"]");
	By resume= By.xpath("//*[@id=\"resume\"]");
	By Relocate= By.xpath("//*[@id=\"yes\"]");
	By Submit_button = By.xpath("/html/body/div/form/button[1]");
	
	
	
	

	@BeforeMethod
	 public void open() {
		

		String urladds="sfwebhtml.sourcefuse.com/automation-form-demo-for-interview";
		String uname="sfwebhtml";
		String pwd="t63KUfxL5vUyFLG4eqZNUcuRQ";
		String URL = "http://" + uname + ":" + pwd + "@" +urladds ;
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(URL);
		}
		
		@Test(enabled=true)
		public void Submit_Form_Label() {
			
			String title=driver.findElement(First_Name).getAttribute("title");
			System.out.println(title);
			driver.findElement(Submit_button).click();
			By Reqr_Lables=By.xpath("//span[@class = 'required']//..//..//label");
			List<WebElement> list=	driver.findElements(Reqr_Lables);
			System.out.println("Total Number of Required labels"+" " + list.size());
			for(int i=0; i<list.size();i++) {
			
				System.out.println(list.get(i).getText());
				}
			}
			
			
			@Test(enabled=true)
			public void Sort_assertion() {
				
			
			Assert.assertEquals(true,driver.findElement(First_Name) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Last_Name) .isEnabled());
			Sassert.assertEquals(false,driver.findElement(email).isEnabled());
			
			
			Sassert.assertEquals(false,driver.findElement(curCompany) .isEnabled());
			Assert.assertEquals(true,driver.findElement(mobile) .isEnabled());
			Assert.assertEquals(true,driver.findElement(DOB) .isEnabled());
			Assert.assertEquals(true,driver.findElement(First_Name) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Position) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Portfolio) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Salary) .isEnabled());
			Assert.assertEquals(true,driver.findElement(First_Name) .isEnabled());
			Assert.assertEquals(true,driver.findElement(When_can_you_start) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Address) .isEnabled());
			Assert.assertEquals(true,driver.findElement(resume) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Relocate) .isEnabled());
			
			System.out.println("All input fileds displayed – Assert passed");
			}
			
			
			@Test(enabled=true)
			public void Hard_assertion() {
				
				//By Submit_button = By.xpath("/html/body/div/form/button[1]");
			//WebElement First_Name = driver.findElement(By.Id(“irctclogo”));
			Assert.assertEquals(true,driver.findElement(First_Name) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Last_Name) .isEnabled());
			Assert.assertEquals(false,driver.findElement(email).isEnabled());
			
			Assert.assertEquals(false,driver.findElement(curCompany) .isEnabled());
			Assert.assertEquals(true,driver.findElement(mobile) .isEnabled());
			Assert.assertEquals(true,driver.findElement(DOB) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Position) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Portfolio) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Salary) .isEnabled());
			Assert.assertEquals(true,driver.findElement(When_can_you_start) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Address) .isEnabled());
			Assert.assertEquals(true,driver.findElement(resume) .isEnabled());
			Assert.assertEquals(true,driver.findElement(Relocate) .isEnabled());
			
			System.out.println("All input fileds displayed – Assert passed");
			}
			
		@Test(enabled=true)
		public void FillForm() throws InterruptedException {
			
			driver.findElement(First_Name).sendKeys("Girish");
			driver.findElement(Last_Name).sendKeys("KR");
			driver.findElement(email).sendKeys("abc@test.com");
			driver.findElement(curCompany).sendKeys("Quest");
			driver.findElement(mobile).sendKeys("9999652365");
			
			
			driver.findElement(DOB).click();
				
			WebDriverWait wait =new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top']"))));
				 
			
			driver.findElement(DOB).sendKeys("06/04/1989");
			
			driver.findElement(DOB).sendKeys(Keys.TAB);
			driver.findElement(Position).sendKeys("QA Lead");
			driver.findElement(Portfolio).sendKeys("www.nothing.com");
			driver.findElement(Salary).sendKeys("9000");
			driver.findElement(When_can_you_start).sendKeys("Today");
			driver.findElement(Address).sendKeys("Banglore");
			driver.findElement(resume).sendKeys("C:\\Users\\admin\\Downloads\\QA Automation Lead-JD.pdf");
			driver.findElement(Relocate).click();
			driver.findElement(Submit_button).click();
			
		}
		
	@Test(enabled=true)
	public void verifyDB() throws ClassNotFoundException, SQLException {
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:mysql://localhost:3036/emp";					

		//Database Username		
		String username = "root";	
        
		//Database Password		
		String password = "giri@123";				

		//Query to Execute		
		String query = "select *  from Sourcefuse;";	
        
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);							
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String FirstName = rs.getString(1);		
	        		String LastName = rs.getString(2);	
	        		String email = rs.getString(3);	
                    int Mobile = rs.getInt(4)	;		                               
                    System. out.println(FirstName+"  "+LastName+""+email+""+Mobile);		
                    
                  //  return myName;
                   // return myName;
            }		
		
			 // closing DB Connection	
		
		con.close();
				
			
		}

	@Test(enabled=true)
	public void verifyemailTriggered() throws ClassNotFoundException, SQLException {
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:mysql://localhost:3036/emp";					

		//Database Username		
		String username = "root";	
        
		//Database Password		
		String password = "giri@123";				

		//Query to Execute		
		String query = "select  *  from Sourcefuse where email=yes;";	
        
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);							
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		
                    String Email = rs.getString(3)	;
                    Assert.assertEquals(Email, "yes");
                    		
                    
                  //  return myName;
                   // return myName;
            }		
		
			 // closing DB Connection	
		
		con.close();
				

	}
	
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
	
}
	
	
	

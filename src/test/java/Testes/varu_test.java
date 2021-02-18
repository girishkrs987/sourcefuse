package Testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class varu_test {
	
	
	
public static WebDriver driver ;

static String xl = Constant.Path_TestData + Constant.File_TestData;
static String Sheet1 = "Organization_Name";
public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
		
		 //WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		
			
		


	      //System.setProperty("webdriver.chrome.driver", "\"C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\");
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\leo\\Desktop\\chromedriver.exe");
			 
	      //  WebDriver driver1 = new FirefoxDriver();
	
	ExcelUtils.setExcelFile(xl, Sheet1);
		 
		 
		 // int rowCount = ExcelUtils.getRowCount(xl, Sheet);
		 // int colCount = ExcelUtils.getColCount(xl, Sheet);
		 // Testes.Xls_Reader xls=new Xls_Reader("E://office_lap//selenium_projects//DOCNU//src//TestData//TestData.xlsx");
		 // Xls_Reader 
		//  xls.getCellData(Sheet, 1, 1);
		 
		int rowCount=  ExcelUtils.getRowCountInSheet();
		

System.out.println("row count"+rowCount);
//System.out.println("col count"+colCount);
			driver.get("http://13.235.83.195/");
			//driver.get("https://natixis.kyc.stride.ai/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("john");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("beatles");
			driver.findElement(By.xpath("//button[@class='btn text-large btn-stride-blue center-block mgbt30']")).click();
			Thread.sleep(8000);
			
			
			// fetch data from exxcel 
			
			//System.out.println("Number of rows"+rowCount);

			
			
				
				
		   
		  //  Search_Patient_Page.Txt_MobileNo(driver).sendKeys(sMobile);
			
			ExcelUtils.setExcelFile(xl, Sheet1);
			System.out.println(ExcelUtils.getCellData_patinet(1, 0));
			
			for (int i=1;i<rowCount;i++)

			{
			
			//driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("hni");
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(ExcelUtils.getCellData_patinet(1, 0));
			// get the entered value
			
			//String Organization_name=driver.findElement(By.xpath("//input[@id='mat-input-1']")).getText();
			//System.out.println("selected Organization name is"+Organization_name);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'cdk-step-content-0-0\']/div/div[5]/button/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='mat-select-3']/div/div[1]")).click();
			Thread.sleep(2000);

		    driver.findElement(By.xpath("//span[contains(text(),'France')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//span[@class='mat-button-wrapper'][contains(text(),'Next')]")).click();
			Thread.sleep(2000);
			WebElement fileUpload = null;
			//WebElement fileUpload = driver.findElement(By.xpath("//span[contains(text(),'Upload Annual Report')]"));
			//fileUpload.sendKeys("C:\\Users/leo/Stride_KYC_User_Guide%201.2.pdf");
			//fileUpload.sendKeys("D:\\upload.pdf");
//				fileUpload.sendKeys("file:///C:/Users/leo/Stride_KYC_User_Guide%201.2.pdf");

			driver.findElement(By.xpath("//div[@class='row mt-4']//span[@class='mat-button-wrapper'][contains(text(),'Next')]")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//span[@class='slider round']")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/div")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/div")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-3\"]/label/div")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-4\"]/label/div")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-5\"]/label/div")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-6\"]/label/div")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-7\"]/label/div")).click();
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-8\"]/label/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn mt-2 btn-blue-outline']")).click();
			System.out.println(driver.findElement(By.xpath("//h4[@class='text-bold-blue text-smaller']")).getText());
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("//button[contains(text(),'Add to favorites')]")).click();
			//driver.findElement(By.xpath("/i[@class='fa fa-plus-circle']")).click();
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys("Test it");
			//driver.findElement(By.xpath("//input[@id='mat-input-9']")).sendKeys("Test it");
		//	driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
			driver.findElement(By.xpath("//button[@class='btn mt-2 btn-blue-outline']")).click();
			String Organization_name=driver.findElement(By.xpath("//span[contains(text(),'hni')]")).getText();
			System.out.println("selected Organization name is"+Organization_name);
			Thread.sleep(2000);
			driver.quit();
			}

	}
	}



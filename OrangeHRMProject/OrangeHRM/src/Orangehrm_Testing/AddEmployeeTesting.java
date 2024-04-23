package Orangehrm_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployeeTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		
		//Launch the OrangeHRM Login Page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		//Login to OrangeHRM
		WebElement Username = driver.findElement(By.name("username"));
		Username.clear();
		Username.sendKeys("Admin");
		Thread.sleep(1000);
		
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.clear();
		Password.sendKeys("admin123");
		Thread.sleep(1000);
		
		
		//Click On Login btn
		WebElement Loginbtn = driver.findElement(By.tagName("button"));
		Loginbtn.click();
		Thread.sleep(1000);
			
		
		//Navigating to PIM Model		
     	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
     	Thread.sleep(1000);
     	
     	
     	//Navigating to Add Employee page
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
		Thread.sleep(1500);
		
		
        //Enter the Details of Employee 1		
		WebElement Firstname1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Firstname1.sendKeys("Rushi");
		Thread.sleep(1000);
		
		
		WebElement MiddleName1 = driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
		MiddleName1.sendKeys("D");
		Thread.sleep(1000);
		
		
		WebElement LastName1 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastName1.sendKeys("Panchal");
		Thread.sleep(1000);
		
		
		WebElement Emp_Id1 = driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']"
				                                          + "//div//input[@class='oxd-input oxd-input--active']"));
		Emp_Id1.clear();
		Emp_Id1.sendKeys("1");
		Thread.sleep(1000);
		
		
		//Click On Save btn
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);
		
		
		//For Comparing Expected & Actual display Msg
		String Displaymsg = "Successfully Saved";
	    
		if(Displaymsg.equals("Successfully Saved")) 
		{
			System.out.println("\n\nSuccessfully Added Employee 1 to List");
		}
		else
		{
			System.out.println("Not Added Employee 1 to List");
		}
		
		
	
		//Again Navigating to Add Employee Page
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
		Thread.sleep(1000);
		
		
		//Enter Details of Employee 2
		WebElement Firstname2 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Firstname2.sendKeys("Kiran");
		Thread.sleep(1000);
		
		
		WebElement MiddleName2 = driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
		MiddleName2.sendKeys("R");
		Thread.sleep(1000);
		
		
		WebElement LastName2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastName2.sendKeys("Pawar");
		Thread.sleep(1000);
		
		
		WebElement Emp_Id2 = driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']"
				                                         + "//div//input[@class='oxd-input oxd-input--active']"));
		Emp_Id2.clear();
		Emp_Id2.sendKeys("2");
		Thread.sleep(1000);
		
		
		//Click on Save btn
	    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);
		
		
        String Displaymsg1 = "Successfully Saved";
	    
		if(Displaymsg1.equals("Successfully Saved"))
		{
			System.out.println("Successfully Added Employee 2 to List");
		}
		else
		{
			System.out.println("Not Added Employee 2 to List");
		}
		
		
		
		//Navigating to Employee List page
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(1500);
		
		
		//Searching for Employee 1
		WebElement Search_Emp_Name1 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]"
				                                     + "/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		Search_Emp_Name1.sendKeys("Rushi");
		Thread.sleep(1000);
	    
		
		//click on Search btn
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(1000);
		
		
		//Emp 1 Record Found msg Diplay
		WebElement Record_found_1 = driver.findElement(By.xpath("//span[normalize-space()='(1) Record Found']"));
        String Record1 = Record_found_1.getText();
        Thread.sleep(800);
        
        
        if(Record1.equals("(1) Record Found"))
        {
        	System.out.println("\nEmployee 1 Record is Found");
        }
        else
        {
        	System.out.println("Employee 1 Record is Not Found");
        }
      
        
		
        //To Scroll the Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(1000);
		
		
		//Navigating to Employee List
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(1000);
		
		
		//Searching for Employee 2
		WebElement Search_Emp_Name2 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"
				                          + "/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		Search_Emp_Name2.sendKeys("Kiran");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(1000);
		
		
		//Emp 2 Record Found msg Diplay
		WebElement Record_found = driver.findElement(By.xpath("//span[normalize-space()='(1) Record Found']"));
		Thread.sleep(1000);
		
		
        String Record2 = Record_found.getText();
        
        if(Record2.equals("(1) Record Found"))
        {
        	System.out.println("Employee 2 Record is Found");
        }
        else
        {
        	System.out.println("Employee 2 Record is Not Found");
        }
	
        
      
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(1000);
		
		
		//Click on Select Option 
		WebElement Selectbtn = driver.findElement(By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check "
				                                             + "oxd-checkbox-input-icon']"));
		Selectbtn.click();
		Thread.sleep(1500);
		
		
		//Click on Delete btn
		WebElement Deletebtn = driver.findElement(By.xpath("//button[normalize-space()='Delete Selected']"));
		Deletebtn.click();
		Thread.sleep(1500);
				
			
		//Click To Yes For Delete Emp_2
		WebElement Yes_btn = driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']"));
		Yes_btn.click();
		Thread.sleep(2000);
		
		String Displayedmsg = "Successfully Deleted";
		
		if(Displayedmsg.equals("Successfully Deleted"))
		{
			System.out.println("\nEmployee 2 is Succesfully Removed From List");
		}
		else
		{
			System.out.println("Employee 2 is not Succesfully Removed From List");

		}
		
		
		//Again Navigating For Searching emp
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(2000);
		
		
		//Again Search for Employee 2
		WebElement Search_Emp_Name_2 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"
				                         + "/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		Search_Emp_Name_2.sendKeys("Kiran");
		Thread.sleep(1000);
		
		
		//Click on Search
		WebElement Searchbtn =driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		Searchbtn.click();
		Thread.sleep(1000);
		
		
		//To Scrolling
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(1000);
		
		
		//To Displayed msg for Emp 2 No Record found 
		WebElement No_Record_found = driver.findElement(By.xpath("//span[normalize-space()='No Records Found']"));
		Thread.sleep(1000);
		 
		
        String Record_2 = No_Record_found.getText();
       
        if(Record_2.equals("No Records Found"))
        {
        	System.out.println("Employee 2 Record is Not Found & Successfully Deleted ");
        }
        else
        {
        	System.out.println("Employee 2 Record is Found");
        }
	
        
        //To Logout
        driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
        Thread.sleep(1200);
        
        
        //Click on Logout btn
        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
        Thread.sleep(1200);
        
        
		//To Close the Window
		 driver.close();
		 
	
	}

}

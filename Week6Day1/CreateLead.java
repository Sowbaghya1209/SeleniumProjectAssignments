package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@Test (dataProvider = "fetchData" )
	public void createLead(String cname,String fname,String lname) {
		System.out.println(Thread.currentThread().getId());
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	@DataProvider(name="fetchData")
    public String[][] sendData() throws IOException {
                
		 String[][] readExcel = ReadXL.readExcel();
         return readExcel;
   
        
}
}
package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoCsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sudharsan");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("san");
    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("raja");
    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Tester");
    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("0");
    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("san");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("software Tesater");
    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("6000059");
    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("abcd");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sudharsan@gmail.com");
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9723456634");
    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("nothing");
    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https//:ghsfghs");
    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("tester");
    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("tambaram");
    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6200567");
    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("tambaram");
    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("tambaram");
    driver.findElement(By.className("smallSubmit")).click();
	

}

}

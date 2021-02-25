package pages;

 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

 

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class Logintest {

 

WebDriver driver;


 

@FindBy(xpath="//*[contains(text(),'Sign in')]")
WebElement lnkLogin;

 

@FindBy(xpath="//input[@id='login_field']")
WebElement editUsername;

 

@FindBy(xpath="//input[@id='password']")
WebElement editpwd;

 



 

@FindBy(xpath="//input[@name='commit']")
WebElement btnPwd;

 

public Logintest(WebDriver testdriver) {
    this.driver=testdriver;
    PageFactory.initElements(driver, this);
}

 


public void Login(String UserName,String Password) throws IOException {
    
    
    lnkLogin.click();
    
    //driver.quit();
    
     //to find a string
    //*[contains(text(),'Welcome')]
    
    
    editUsername.sendKeys(UserName);
  

    editpwd.sendKeys(Password);

    btnPwd.click();
    
}

}
package TestCases;

import Common.Constants;
import Common.Locators;
import Models.EmployeeModel;
import TestBase.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class AttachFileForPersonalDetailTest extends BaseClass {

    EmployeeModel employee;
    String filename;

    @Test(priority = 1,groups = {"regression"})
    public void login() throws InterruptedException {
/*        logger.info("----------------------login-----------------------");*/
        ChainTestListener.log("----------------------login-----------------------");
        loginpage.login(properties.getProperty("admin_login"),properties.getProperty("admin_password"));
    }

    @Test(priority = 2,dependsOnMethods = {"login"},groups = {"regression"})
    public void addNewEmployee() throws InterruptedException {
/*        logger.info("----------------------addNewEmployee-----------------------");*/
        ChainTestListener.log("----------------------addNewEmployee-----------------------");
        driver.findElement(By.xpath(Locators.MainPage.sideMenuOptionXpath("PIM"))).click();
        String name = fake.name().fullName();
        employee = pimPage.addAnEmployee(name,name,fake.name().lastName(),fake.number().digits(4),name,"qwerty@1234");
    }

    @Test(priority = 3,dependsOnMethods = {"addNewEmployee"},groups = {"regression"})
    public void attachFileToDetails() throws InterruptedException, AWTException {
/*        logger.info("----------------------attachFileToDetails-----------------------");*/
        ChainTestListener.log("----------------------attachFileToDetails-----------------------");
        ScrollToBottomOfpage();
        filename = "Pranav Final Resume.pdf";
        String filePath = System.getProperty("user.dir")+String.format("\\TestData\\%s",filename);
        pimPage.addAttachementAndSave(filePath);
    }

    @Test(priority = 4)
    public void checkFileIsAttached(){
/*        logger.info("----------------------checkFileIsAttached-----------------------");*/
        ChainTestListener.log("----------------------checkFileIsAttached-----------------------");
        Assert.assertTrue(pimPage.getColumnValues(Constants.PIMPage.FileNameText).contains(filename));
    }
}

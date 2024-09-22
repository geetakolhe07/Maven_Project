package testing.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertCase(){
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();

        String text = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        softAssert.assertEquals(text,"Create a Rediffmail account","Text should be matched");
        WebElement fullNameTextBox = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        softAssert.assertTrue(fullNameTextBox.isDisplayed(),"full name text box should be displayed");
        WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[starts-with(@name,'gender')][2]"));
        softAssert.assertFalse(femaleRadioBtn.isSelected(),"female radio button should to be clickable");
        softAssert.assertAll();

        driver.close();
    }


}

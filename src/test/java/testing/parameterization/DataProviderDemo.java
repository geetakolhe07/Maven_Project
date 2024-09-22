package testing.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun(){
        return new Object[][]{
                {
                        "Java", "Pune"
                },
                {
                    "Selenium", "Mumbai"
                },
                {
                    "Python", "Delhi"
                },
        };
    }

    @Test(dataProvider = "test-data")
    public void verifyParameterizationCases(String courceName,String cityName) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courceName+" "+cityName);
        Thread.sleep(3000);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}

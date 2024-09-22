package basicofmaven;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotDemo {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver(); //upcasting
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\acer\\Pictures\\Screenshots\\Screenshot 2024-07-14 134347_"+timestamp()+".png");
        FileUtils.copyFile(src, dest);

        driver.close();
    }

    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}

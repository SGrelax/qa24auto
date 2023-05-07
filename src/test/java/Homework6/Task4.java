package Homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task4 {
    @Test
    public void task4(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Cromedrivesg\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/section/form/div[3]/label/input[1]")).click();


    }
}

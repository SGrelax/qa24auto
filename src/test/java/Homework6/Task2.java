package Homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2 {
    @Test
    public void task2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Cromedrivesg\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String Nexturl = "https://uhomki.com.ua/ru/oplata-i-dostavka/";
        driver.get("https://uhomki.com.ua/ru/");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div/div[1]/div/nav/span[3]/a")).click();
       assertEquals(driver.getCurrentUrl(), Nexturl);
    }
}

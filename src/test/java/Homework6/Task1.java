package Homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1 {
    @Test
    public void task1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Cromedrivesg\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("https://dan-it.com.ua/uk/");
        driver.findElement(By.xpath("/html/body/header/div/button")).click();
        Thread.sleep(2000);
        WebElement link1 = driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a"));
        actions.moveToElement(link1);
        actions.perform();
        actions.moveToElement(driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/ul/li[6]/a")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/ul/li[3]/a")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/ul/li[8]/a")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        assertEquals(driver.getWindowHandles(),4);
    }
}

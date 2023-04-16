package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/");
        WebElement search = driver.findElement(By.className("search__input"));
        search.click();
        search.sendKeys("Хорек");
        Thread.sleep(2000);

        search.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[2]/div/ul/li")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/section/div[1]/div[2]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/div")).click();
        WebElement search1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/form/input"));
        search1.click();
        search1.sendKeys("Медведь");
        Thread.sleep(2000);
        search1.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[3]/div[2]/div/ul/li")).click();
        driver.findElement(By.xpath("//*[@id=\"comparison-product-14684-381\"]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]/div/a")).click();



    }


}

package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/");
        WebElement hom = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div"));
        WebElement hom2 = driver.findElement(By.xpath("/html/body/div[2]/footer/div/div/div/div[2]/div/div"));
        WebElement hom3 = driver.findElement(By.xpath("/html/body/div[2]/footer/div/div/div/div[3]/div/div[1]"));
        System.out.println(hom.getText());
        System.out.println("-------------------------------------");
        System.out.println(hom2.getText());
        System.out.println("-------------------------------------");
        System.out.println(hom3.getText());
        System.out.println("-------------------------------------");

    }
}

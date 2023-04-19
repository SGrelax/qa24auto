package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        WebElement carElement = driver.findElement(By.id("Carlist"));
        Select carSelect = new Select(carElement);
        carSelect.selectByVisibleText("Renault");

        WebElement countryElement = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[2]/table/tbody/tr/td[1]/select"));
        Select countrySelect = new Select(countryElement);
        countrySelect.selectByVisibleText("France");
        countrySelect.selectByVisibleText("Germany");
        countrySelect.selectByVisibleText("Italy");
        countrySelect.selectByVisibleText("Spain");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[2]/table/tbody/tr/td[2]/input[1]")).click();
    }
}

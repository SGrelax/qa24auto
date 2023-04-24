package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(10000);

        driver.findElement(By.xpath("//circle[@stroke='#ffffff']")).click();
        actions.moveToElement(driver.findElement
                        (By.xpath("//circle[@stroke='#ffffff']"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//circle[@stroke'#000000']"))).
                release().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement
        (By.xpath("//circle[@stroke='#ffffff']"))).
        clickAndHold().moveToElement(driver.findElement(By.xpath("//circle[@stroke'#000000']"))).
                release().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement
                        (By.xpath("//circle[@stroke='#ffffff']"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//circle[@stroke'#000000']"))).
                release().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement
                        (By.xpath("//circle[@stroke='#ffffff']"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//circle[@stroke'#000000']"))).
                release().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement
                        (By.xpath("//circle[@stroke='#ffffff']"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//circle[@stroke'#000000']"))).
                release().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement
                        (By.xpath("//circle[@stroke='#ffffff']"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//circle[@stroke'#000000']"))).
                release().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement
                        (By.xpath("//circle[@stroke='#ffffff']"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//circle[@stroke'#000000']"))).
                release().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement
                        (By.xpath("//circle[@stroke='#ffffff']"))).
                clickAndHold().moveToElement(driver.findElement(By.xpath("//circle[@stroke'#000000']"))).
                release().build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/textarea")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/textarea")).sendKeys("Задание выполнено!");




    }
}

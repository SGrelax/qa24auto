package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(15000);
        WebElement task1 = driver.findElement(By.xpath("/html/body/svg"));


        Actions action = new Actions(driver);
        action.moveToElement(task1, 476,60).clickAndHold().moveToElement(task1,580,180).release().build().perform();
    }
}

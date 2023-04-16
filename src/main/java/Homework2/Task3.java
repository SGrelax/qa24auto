package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://liquipedia.net/counterstrike/Main_Page");
        WebElement trending = driver.findElement(By.xpath("//*[@id=\"trending-pages-menu-toggle\"]/span[2]"));
        WebElement buttonTrending = driver.findElement(By.xpath("//*[@id=\"trending-pages-menu-toggle\"]"));

        System.out.println(buttonTrending.getTagName());
        System.out.println(buttonTrending.getText());
        System.out.println(buttonTrending.getAttribute(""));
        System.out.println(buttonTrending.getLocation());
        System.out.println(buttonTrending.getCssValue(""));
        System.out.println(buttonTrending.getAccessibleName());
        System.out.println(buttonTrending.getAriaRole());
        System.out.println(buttonTrending.getRect());
    }
}

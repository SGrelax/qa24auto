package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://liquipedia.net/counterstrike/Main_Page");
        WebElement trending = driver.findElement(By.xpath("//*[@id=\"trending-pages-menu-toggle\"]/span[2]"));
        WebElement buttonTrending = driver.findElement(By.xpath("//*[@id=\"trending-pages-menu-toggle\"]"));
        System.out.println("Кнопка trending");
        System.out.println("Местонахождение верхнего левого угла элемента " + trending.getLocation());
        System.out.println("Координата x верхнего левого угла элемента " + trending.getLocation().x);
        System.out.println("Координата y верхнего левого угла элемента " + trending.getLocation().y);

        System.out.println("Размер нашей кнопки "+ buttonTrending.getSize());
        System.out.println("Высота нашей кнопки "+ buttonTrending.getSize().height);
        System.out.println("Ширина нашей кнопки "+ buttonTrending.getSize().width);

        //
        WebElement players = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/div[2]/div/div[1]/div/div/a"));
        WebElement buttonPlayers = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/div[2]/div/div[1]"));
        System.out.println("Кнопка Players");
        System.out.println("Местонахождение верхнего левого угла элемента " + players.getLocation());
        System.out.println("Координата x верхнего левого угла элемента " + players.getLocation().x);
        System.out.println("Координата y верхнего левого угла элемента " + players.getLocation().y);

        System.out.println("Размер нашей кнопки "+ buttonPlayers.getSize());
        System.out.println("Высота нашей кнопки "+ buttonPlayers.getSize().height);
        System.out.println("Ширина нашей кнопки "+ buttonPlayers.getSize().width);

        System.out.println("--------------------------------------");
        if (players.getLocation().y > trending.getLocation().y){
            System.out.println("Кнопка trending находится выше");
    }
        else {
            System.out.println("Кнопка Players находится выше");
        }
        if (players.getLocation().x < trending.getLocation().x) {
            System.out.println("Кнопка Players находится левее");
        }
        else {
            System.out.println("Кнопка trending находится левее");
        }
        if (buttonTrending.getSize().height * buttonTrending.getSize().width > buttonPlayers.getSize().height * buttonPlayers.getSize().width){
            System.out.println("Кнопка trending занимает большую площадь");
        }
        else {
            System.out.println("Кнопка Players занимает большую площадь");
        }


    }
}

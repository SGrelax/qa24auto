package Homework2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://uhomki.com.ua/");
        System.out.println("У Хомки (https://uhomki.com.ua/)");
        Set<String> setFirst = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setSecond = driver.getWindowHandles();
        setSecond.removeAll(setFirst);
        String finalDesc = setSecond.iterator().next();
        driver.switchTo().window(finalDesc);
        driver.get("https://zoo.kiev.ua/");
        System.out.println("Київський зоопрак (https://zoo.kiev.ua/)");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setThird = driver.getWindowHandles();
        setThird.removeAll(setFirst);
        setThird.removeAll(setSecond);
        finalDesc = setThird.iterator().next();
        driver.switchTo().window(finalDesc);
        driver.get("https://www.w3schools.com/");
        System.out.println("W3Schools (https://www.w3schools.com/)");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setFourth = driver.getWindowHandles();
        setFourth.removeAll(setFirst);
        setFourth.removeAll(setSecond);
        setFourth.removeAll(setThird);
        finalDesc = setFourth.iterator().next();
        driver.switchTo().window(finalDesc);
        driver.get("https://taxi838.ua/ru/dnepr/");
        System.out.println("Такси в Днепре (https://taxi838.ua/ru/dnepr/)");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setFifth = driver.getWindowHandles();
        setFifth.removeAll(setFirst);
        setFifth.removeAll(setSecond);
        setFifth.removeAll(setThird);
        setFifth.removeAll(setFourth);
        finalDesc = setFifth.iterator().next();
        driver.switchTo().window(finalDesc);
        driver.get("https://klopotenko.com/");
        System.out.println("Клопотенко (https://klopotenko.com/)");
        Thread.sleep(2000);
        finalDesc = setFirst.iterator().next();
        driver.switchTo().window(finalDesc);
        Thread.sleep(2000);
        finalDesc = setSecond.iterator().next();
        driver.switchTo().window(finalDesc);
        Thread.sleep(2000);
        finalDesc = setThird.iterator().next();
        driver.switchTo().window(finalDesc);
        Thread.sleep(2000);
        finalDesc = setFourth.iterator().next();
        driver.switchTo().window(finalDesc);
        Thread.sleep(2000);
        finalDesc = setFifth.iterator().next();
        driver.switchTo().window(finalDesc);
        Thread.sleep(2000);
        finalDesc = setSecond.iterator().next();
        driver.switchTo().window(finalDesc);
        ((JavascriptExecutor)driver).executeScript("window.close()");



    }

}

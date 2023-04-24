package Homework4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("https://www.guinnessworldrecords.com/account/register?");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys(Keys.ENTER);
        Actions actions = new Actions(driver);
        Set<String> setFirst = driver.getWindowHandles();
        //((JavascriptExecutor)driver).executeScript("window.open()");
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Set<String> setSecond = driver.getWindowHandles();
        String finalDesc = setSecond.iterator().next();
        setSecond.removeAll(setFirst);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[3]/div[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/textarea")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/textarea")).sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/textarea")).sendKeys(Keys.ENTER);
        actions.moveToElement(driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Set<String> setThird = driver.getWindowHandles();
        setThird.removeAll(setFirst);
        setThird.removeAll(setSecond);
        Thread.sleep(3000);
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        Thread.sleep(15000);
        driver.findElement(By.xpath("//input[@id='fname']")).click();
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Artem");
        driver.findElement(By.xpath("/html/body/form/input[2]")).click();
        driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("Tsiuro");
        driver.findElement(By.xpath("/html/body/form/input[3]")).click();
        System.out.println("Note: This tutorial will not teach you how servers are processing input. Processing input is explained in our PHP tutorial.");
        finalDesc = setFirst.iterator().next();
        driver.switchTo().window(finalDesc);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[1]/div[1]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[1]/div[1]/div[2]/input")).sendKeys("Tsiuro");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[1]/div[2]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[1]/div[2]/div[2]/input")).sendKeys("Artem");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[2]/input[1]")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[2]/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[2]/input[2]")).sendKeys("10");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[2]/input[3]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[2]/input[3]")).sendKeys("1999");
        WebElement countryElement = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[3]/div/div[1]/div[2]/select"));
        Select countrySelect = new Select(countryElement);
        Thread.sleep(2000);
        countrySelect.selectByVisibleText("Ukraine");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[3]/div/div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[3]/div/div[2]/div[1]/label")).sendKeys("Dnipro");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[3]/div[1]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[3]/div[1]/div[2]/input")).sendKeys("tsiuro@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[3]/div[2]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[3]/div[2]/div[2]/input")).sendKeys("tsiuro@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[2]/div[1]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[2]/div[1]/div[2]/input")).sendKeys("301099");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[2]/div[2]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[2]/div[2]/div[2]/input")).sendKeys("301099");
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[4]/label/input[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/div[1]/button")).click();
        System.out.println("Please fill in the Confirm password field.");
        finalDesc = setThird.iterator().next();
        driver.switchTo().window(finalDesc);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[1]/button")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[2]/button")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[3]/button")).sendKeys(Keys.ENTER);









    }
}

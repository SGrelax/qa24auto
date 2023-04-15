package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        //driver.get("https://uhomki.com.ua/ru/koshki/1074/");
        //Thread.sleep(2000);
        //driver.findElement(By.className("userbar__button-text")).click();

        //2
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
       // driver.get("https://uhomki.com.ua/ru/koshki/1074/");
       // Thread.sleep(2000);
        //driver.findElement
               // (By.xpath("/html/body/div[2]/footer/div/div/div/div[2]/div/div/ul/li[3]/a")).click();

        //3
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        //driver.get("https://itstep.dp.ua/ru");
        //Thread.sleep(2000);
        //driver.findElement(By.linkText("IT специальностям")).click();

        //4
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        //driver.get("https://uhomki.com.ua/koshki/1074/");
        //Thread.sleep(2000);
        //driver.findElement
         //(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/div/div/div/div/ul/li[8]/div[1]/a")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.linkText("Аквариумы")).click();

        //5
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        //driver.get("https://itstep.dp.ua/ru");
        //Thread.sleep(2000);
        //driver.findElement
        //(By.xpath("//*[@id=\"header-new\"]/div[3]/div[2]/div[2]/div/div/div[1]/div/img")).click();


        //6
       // System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
       // driver.get("https://itstep.dp.ua/ru");
       // Thread.sleep(2000);
        //driver.findElement
       //         (By.xpath("//*[@id=\"header-new\"]/div[3]/div[1]/nav/ul/div[1]/a")).click();
        //Thread.sleep(2000);
       // driver.findElement
        //        (By.xpath("//*[@id=\"header-new\"]/div[3]/div[1]/nav/ul/div[1]/div[1]/div/div/div/ul[3]/div/a[1]/div")).click();

        //9
       // System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        //driver.get("https://www.jetbrains.com/idea/");
        //Thread.sleep(2000);
        //driver.findElement(By.className("wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary")).click();

        //8
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        //driver.get("https://itstep.dp.ua/ru");
        //Thread.sleep(2000);
        //driver.findElement
       //        (By.xpath("//*[@id=\"academy_page\"]/main/section[2]/div/div/div[5]/a/div/picture/img")).click();
       // Thread.sleep(2000);
       // driver.navigate().back();
       // Thread.sleep(2000);
      //  driver.findElement
              //  (By.xpath("//*[@id=\"academy_page\"]/main/section[2]/div/div/div[1]/a/div/picture/img")).click();

        //7
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        //driver.get("https://www.w3schools.com/");
        //Thread.sleep(2000);
        //driver.findElement(By.id("learntocode_searchicon")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("search2")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("gsc-i-id1")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("navbtn_tutorials")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("navbtn_references")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("navbtn_exercises")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("cert_navbtn")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("w3loginbtn")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("signupbtn_topnav")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("getdiploma")).click();

        //10
    }
    private static final By DownloadCommunity = By.xpath("//*[@id=\"download-block\"]/section[1]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[2]/span/a");
    private static final By DownloadUltimate = By.xpath("//*[@id=\"download-block\"]/section[1]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/span/a");
}

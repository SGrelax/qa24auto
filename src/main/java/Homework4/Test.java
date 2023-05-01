package Homework4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.waiters.WaitersStart;

import java.time.Duration;
import java.util.Set;

public class Test {
    public static <WaitersStart> void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        driver.get("https://www.google.com/search");
        WaitersStart waitersStart = new WaitersStart(driver);
        waitersStart.toString();
        driver.findElement(By.xpath("//div[text()='Принять все']")).click();
        waitersStart.toString();
        WebElement searchField = driver.findElement(By.xpath("//textarea[@type='search']"));
        searchField.sendKeys("https://www.guinnessworldrecords.com/account/register?");
        searchField.sendKeys(Keys.ENTER);

        waitersStart.toString();
        WebElement firstPage = driver.findElement(By.xpath("//h3[text()='Create account | Guinness World Records']"));
        Set<String> firstWindows = driver.getWindowHandles();
        Actions actions = new Actions(driver);
        actions.moveToElement(firstPage).keyDown(Keys.CONTROL).click(firstPage).keyUp(Keys.CONTROL).build().perform();
        Set<String> secondWindows = driver.getWindowHandles();
        secondWindows.removeAll(firstWindows);


        String secondWindowHandle = secondWindows.iterator().next();


        WebElement searchField2 = driver.findElement(By.xpath("//textarea[@type='search']"));
        searchField2.clear();
        searchField2.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        searchField2.sendKeys(Keys.ENTER);

        Set<String> firstWindowsUp = driver.getWindowHandles();
        WebElement secondPage = driver.findElement(By.xpath("//h3[text()='AlertsDemo - H Y R Tutorials']"));
        actions.moveToElement(secondPage).keyDown(Keys.CONTROL).click(secondPage).keyUp(Keys.CONTROL).build().perform();
        Set<String> secondWindowsUp = driver.getWindowHandles();
        secondWindowsUp.removeAll(firstWindowsUp);

        String thirdWindowHandle = secondWindowsUp.iterator().next();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        waitersStart.toString();
        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();

        waitersStart.toString();
        Thread.sleep(2000);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        WebElement fname = driver.findElement(By.xpath("//input[@id='fname']"));
        WebElement lname = driver.findElement(By.xpath("//input[@id='lname']"));
        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));

        fname.clear();
        fname.sendKeys("Sergey");

        lname.clear();
        lname.sendKeys("Kudaev");

        submitBtn.click();

        waitersStart.toString();
        Thread.sleep(2000);
        System.out.println(driver.findElements(By.xpath("//p")).get(1).getText());

        driver.switchTo().window(secondWindowHandle);

        waitersStart.toString();
        driver.findElement(By.id("ez-accept-all")).click();
        waitersStart.toString();
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kudaev");
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sergey");
        driver.findElement(By.xpath("//input[@id='DateOfBirthDay']")).sendKeys("12");
        driver.findElement(By.xpath("//input[@id='DateOfBirthMonth']")).sendKeys("6");
        driver.findElement(By.xpath("//input[@id='DateOfBirthYear']")).sendKeys("1992");
        Select select1= new Select(driver.findElement(By.xpath("//select[@id='Country']")));
        select1.selectByVisibleText("Ukraine");
        waitersStart.toString
                ();
        WebElement countryField = driver.findElement
                (By.xpath("//input[@class='input-large create-application-name']"));
        countryField.sendKeys("Dnipro");

        driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys("mailgmail@mails.cim");
        driver.findElement(By.xpath("//input[@id='ConfirmEmailAddress']")).sendKeys("mailgmail@mails.cim");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9876543210");
        WebElement confirmPass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPass.sendKeys("1234567890");
        confirmPass.sendKeys(Keys.ENTER);
        waitersStart.toString
                ();
        System.out.println(driver.findElement(By.xpath("//span[@for='ConfirmPassword']")).getText());

        driver.switchTo().window(thirdWindowHandle);

        waitersStart.toString();
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alertbox = wait.until(ExpectedConditions.alertIsPresent());
        alertbox.accept();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
        Alert confirmbox = wait.until(ExpectedConditions.alertIsPresent());
        confirmbox.dismiss();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='promptBox']")).click();


        Alert promtBox = wait.until(ExpectedConditions.alertIsPresent());
        promtBox.sendKeys("\'Final step of this task\'");
        promtBox.accept();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

        Thread.sleep(4000);
        //driver.quit();
    }
}



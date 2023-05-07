package Homework4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Cromedrivesg\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search");
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("https://www.guinnessworldrecords.com/account/register?");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys(Keys.ENTER);

        //((JavascriptExecutor)driver).executeScript("window.open()");
        Thread.sleep(2000);

        actions.moveToElement(driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Set<String> firstWindows = driver.getWindowHandles();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[3]/div[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/textarea")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/textarea")).sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/textarea")).sendKeys(Keys.ENTER);
        actions.moveToElement(driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Set<String> secondWindows = driver.getWindowHandles();
        secondWindows.removeAll(firstWindows);
        String secondWindowHandle = secondWindows.iterator().next();
        Thread.sleep(3000);
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        Set<String> thirdWindowHandle = driver.getWindowHandles();
        Thread.sleep(15000);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(iframe);
        WebElement fname = driver.findElement(By.xpath("//input[@id='fname']"));
        WebElement lname = driver.findElement(By.xpath("//input[@id='lname']"));
        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));

        fname.clear();
        fname.sendKeys("Artem");

        lname.clear();
        lname.sendKeys("Tsiuro");

        submitBtn.click();
        System.out.println(driver.findElements(By.xpath("//p")).get(1).getText());
        driver.switchTo().window(secondWindowHandle);

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

        Thread.sleep(2000);
        driver.switchTo().window(thirdWindowHandle.toString());



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



    }
}

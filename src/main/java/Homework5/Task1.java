package Homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Test.Test1.WaitersStart.EXPLICITLY_WAIT;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static sun.net.ftp.impl.FtpClient.logger;


public class Task1 {


    public static WebDriver driver;

    public Task1(WebDriver driver) {
        this.driver = driver;
    }


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public static void Visability() {
        driver.get("http://www.seleniumframework.com/Practiceform/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Element5")));

        private  void waitForFunction(Function function, Long timeOutInSeconds) {
            logger.info("Waiting for function");
            FluentWait<WebDriver> wait = fluentWaiter(timeOutInSeconds);
            wait.until(function);
        }

        public void waitForVisibilityOf(WebElement webElement) {
            waitForFunction(ExpectedConditions.visibilityOf(webElement),EXPLICITLY_WAIT);
        }
        public  void waitForVisibilityOf(By by) {
            waitForFunction(ExpectedConditions.visibilityOf(driver.findElement(by)),EXPLICITLY_WAIT);
        }
        public WebElement waitForVisibilityOfElement(WebElement webElement) {
            return fluentWaiter(EXPLICITLY_WAIT).until(ExpectedConditions.visibilityOf(webElement));
        }
        public WebElement waitForVisibilityOfElement(By by) {
            logger.info("Waiting for visability of element located by "+by.toString());
            return fluentWaiter(EXPLICITLY_WAIT).until(ExpectedConditions.visibilityOf(driver.findElement(by)));
        }

        public  void waitForElementBeClickable(WebElement element) {
            waitForFunction(elementToBeClickable(element),EXPLICITLY_WAIT);
        }
        public  void waitForElementBeClickable(By by) {
            waitForFunction(elementToBeClickable(driver
                            .findElement(by)),EXPLICITLY_WAIT);
        }

        public  WebElement waitForElementToBeClickable(WebElement element) {
            return fluentWaiter(EXPLICITLY_WAIT).until(elementToBeClickable(element));
        }
        public WebElement waitForElementToBeClickable(By by) {
            return fluentWaiter(EXPLICITLY_WAIT)
                    .until(elementToBeClickable(driver.findElement(by)));
        }
        public void waitForPresentElementLocated(By by) {
            logger.info("Waiting for present of element located by "+by.toString());
            waitForFunction(presenceOfElementLocated(by),EXPLICITLY_WAIT);
        }
        public WebElement waitForPresentElementLocatedBy(By by) {
            return fluentWaiter(EXPLICITLY_WAIT)
                    .until(presenceOfElementLocated(by));
        }
        public ArrayList<WebElement> waitForPresentElementsLocatedAndReturnArrayList(By by) {
            waitForFunction(presenceOfElementLocated(by),EXPLICITLY_WAIT);
            return new ArrayList<>(driver.findElements(by));
        }

        public  WebElement waitForElementToBeClickable(MobileElement element, Long duration) {
            return  fluentWaiter(duration).until(elementToBeClickable(element));
        }
        public  WebElement waitForElementToBeClickable(By by, Long duration) {
            return  fluentWaiter(duration)
                    .until(elementToBeClickable(driver.findElement(by)));
        }
        public  void waitForElementToDissapear(WebElement element){
            waitForFunction(ExpectedConditions.invisibilityOf(element),EXPLICITLY_WAIT);
        }
        public  void waitForElementToDissapear(By by){
            waitForFunction(ExpectedConditions.
                    invisibilityOf(driver.findElement(by)),EXPLICITLY_WAIT);
    }


}






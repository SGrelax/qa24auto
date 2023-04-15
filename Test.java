public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/css/default.asp");
    }
}

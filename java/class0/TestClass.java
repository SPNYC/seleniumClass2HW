package class0;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.safari.SafariDriver;



public class TestClass {
    public static void main(String[] args) {

        //WebDriverManager.operadriver().setup();
        WebDriverManager.safaridriver().setup();

        WebDriver driver=new SafariDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}

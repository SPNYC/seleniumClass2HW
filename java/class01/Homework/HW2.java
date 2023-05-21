package class01.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
/*
HW2:
navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
enter the username "Tester"
enter the password "test"
get the title of the webPage and confirm that it is  "Web Orders Login"
------------------__------__**happy coding ***

 */
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new SafariDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("tester");
        String title= driver.getTitle();

        if(title.equals("Web Order Login")){
            System.out.println("The title is Web Order Login "+title);
        } else {
            System.out.println("The title of the page is incorrect");
        }
        Thread.sleep(5000);
        driver.quit();
    }
}

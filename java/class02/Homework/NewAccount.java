package class02.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

/*
HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
 */
public class NewAccount {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Svetlana");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pisareva");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pisarevasvetlana84@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("pisarevasvetlana84@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("passwordPassword987");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Aug");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("3");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1984");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@class='_58mt']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();

       Thread.sleep(3000);
        driver.quit();



    }
}

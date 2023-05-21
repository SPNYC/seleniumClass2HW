package class01.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name or id as locators

 */
public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new SafariDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Svetlna");
        driver.findElement(By.id("customer.lastName")).sendKeys("Pisareva");
        driver.findElement(By.id("customer.address.street")).sendKeys("72nd Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Brooklyn");
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11209");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
        driver.findElement(By.id("customer.ssn")).sendKeys("0987654");
        driver.findElement(By.id("customer.username")).sendKeys("spisareva");
        driver.findElement(By.id("customer.password")).sendKeys("Cucumber123!");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Cucumber123!");
        Thread.sleep(5000);
        driver.quit();
    }
}

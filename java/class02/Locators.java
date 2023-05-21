package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new SafariDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
       // driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");
        //slow down
        Thread.sleep(2000);
        //after sending the usernme to the textbox clear text box
        userNameTextBox.clear();
        //passing Admin again
        userNameTextBox.sendKeys("Admin");
        //entering password
        WebElement pass=driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        //find a login button
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();

        //get the welcome message
        WebElement message=driver.findElement(By.linkText("Welcome Admin"));
        String text=message.getText();
        System.out.println(text);

        driver.findElement(By.partialLinkText("Recru")).click();

    }
}

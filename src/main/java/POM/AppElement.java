package POM;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppElement {
    AndroidDriver driver;

    public AppElement(AndroidDriver driver) {
        this.driver = driver;
    }

    public void inputField(String username, String passWord) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='usernameTextField']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='passwordTextField']")));
        driver.findElement(By.xpath("//*[@id='passwordTextField']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Login']")));
        driver.findElement(By.xpath("//*[@text='Login']")).click();
        driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
        driver.findElement(By.xpath("//*[@text='Cancel']")).click();
        driver.findElement(By.xpath("//*[@text='Logout']")).click();
    }
}
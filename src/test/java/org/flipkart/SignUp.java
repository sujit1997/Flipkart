package org.flipkart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        // SignUp
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div/a/span")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("9415645303");
        driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[3]/button")).click();

        // login

    }
}
package com.redsea.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {


    public static WebDriver driver;
    public static Properties props = new Properties();

    public Base() {


        try {
            File file = new File("src/main/java/com/properties/config.properties");
            FileInputStream fis = new FileInputStream(file);
            // FileInputStream fis = new FileInputStream(new File("src/main/java/com/properties/config.properties"));
            props.load(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void launchBrowser() {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //driver.get("http://ci.thingstalk.io/");

        driver.get(props.getProperty("url"));
    }
}

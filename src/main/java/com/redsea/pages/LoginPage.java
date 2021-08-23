package com.redsea.pages;

import com.redsea.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(name = "login")
    WebElement login;


    public void performLogin(String name, String pass) {
        username.sendKeys(name);
        password.sendKeys(pass);
        login.click();
    }

}

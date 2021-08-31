package com.redsea.pages;

import com.redsea.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends Base {
    public LogoutPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "user-menu")
    WebElement userMenuICON;
    @FindBy(id = "logout")
    WebElement logOutButton;


    public void performLogout() {
        userMenuICON.click();
        logOutButton.click();

    }
}

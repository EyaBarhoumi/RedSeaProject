package com.redsea.pages;

import com.redsea.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamPage extends Base {


    public TeamPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-icon-button")
    WebElement AddIconButton;
    @FindBy(id = "page-link-Teams")
    WebElement TeamsPageId;
    @FindBy(id = "mat-input-11")
    WebElement TeamName;

    @FindBy(id = "mat-input-12")
    WebElement TeamDescription;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[3]/div/div/mat-form-field/div/div[1]/div/mat-select")
    WebElement TeamShift;
    @FindBy(xpath = "/html/body/div[3]/div[4]/div/div/div/mat-option[4]")
    WebElement TeamShiftOption;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[4]/div[1]/div/div/mat-form-field/div/div[1]/div/mat-select")
    WebElement TeamZoneGroup;
    @FindBy(xpath = "/html/body/div[3]/div[4]/div/div/div/mat-option[1]")
    WebElement TeamZoneGroupOption;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-team-dialog/form/div[3]/button[2]")
    WebElement submitButton;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[7]/div/span/tb-ag-grid-row-actions/div[2]/button[1]")
    WebElement EditButton;
    @FindBy(id = "delete-button")
    WebElement deleteButton;



    public void gotoAddIconbutton() {
        AddIconButton.click();
    }
    public void gotoTeamPage() {
        VehiclesPageId.click();
    }
}

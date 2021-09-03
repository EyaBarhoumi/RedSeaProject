package com.redsea.pages;

import com.redsea.base.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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


    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[2]/mat-form-field/div/div[1]/div[3]/textarea")
    WebElement TeamDescription;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-edit-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[2]/mat-form-field/div/div[1]/div[3]/textarea")
    WebElement TeamDescriptionEdit;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[1]/mat-form-field/div/div[1]/div[3]/input")
    WebElement TeamName;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-edit-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[1]/mat-form-field/div/div[1]/div[3]/input\n")
    WebElement TeamNameEdit;
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
    @FindBy(id = "cancel")
    WebElement cancelButton;

    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[7]/div/span/tb-ag-grid-row-actions/div[2]/button[1]")
    WebElement EditButton;
    @FindBy(id = "delete-button")
    WebElement deleteButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-confirm-dialog/div[2]/button[2]")
    WebElement confirmDeleteButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-edit-team-dialog/form/div[3]/button[2]")
    WebElement saveUpdateButton;
    @FindBy(id = "search-text-input")
    WebElement SearchInputText;
    @FindBy(id = "search-button")
    WebElement SearchButton;


    //Error Messages
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[1]/mat-form-field/div/div[2]/div/mat-error")
    WebElement TeamNameError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[3]/div/div/mat-form-field/div/div[3]/div/mat-error")
    WebElement predefinedShiftError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[4]/div[1]/div/div/mat-form-field/div/div[3]/div/mat-error")
    WebElement zoneGroupError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-team-dialog/form/div[2]/tb-team/div/form/fieldset/div[4]/div[2]/div/div/mat-form-field/div/div[3]/div/mat-error")
    WebElement zoneError;

    //delete message
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[2]/div/span[1]")
    WebElement selectMessage;


    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div")
    WebElement emptyrightclick;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[6]/div/div/div[5]")
    WebElement exportdiv;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[7]/div/div/div[3]")
    WebElement excelFile;


    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/tb-ag-grid-header-select")
    WebElement selectAll;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[2]/div/button")
    WebElement deleteAll;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[1]/div/div[1]/span")
    WebElement spanclick;

    // Error Messages Get methodes
    public String getTeamNameErrorMessage() {
        String message = (TeamNameError).getText();
        System.out.println(message);
        return message;
    }

    public String getpredefinedShiftErrorMessage() {
        String message = (predefinedShiftError).getText();
        System.out.println(message);
        return message;
    }

    public String getzoneGroupErrorMessage() {
        String message = (zoneGroupError).getText();
        System.out.println(message);
        return message;
    }

    public String getzoneErrorMessage() {
        String message = (zoneError).getText();
        System.out.println(message);
        return message;
    }


    public void gotoAddIconbutton() {
        AddIconButton.click();
    }

    public void gotoTeamPage() {
        TeamsPageId.click();
    }

    public void enterTeamName(String name) {
        TeamName.sendKeys(name);
    }

    public void enterTeamDescription(String desciption) {
        TeamDescription.sendKeys(desciption);
    }

    public void clickOnTeamshift() {
        TeamShift.click();
        TeamShiftOption.click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();

    }

    public void clickOnTeamZoneGroup() {
        TeamZoneGroup.click();
        TeamZoneGroupOption.click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public void clickOnEditButton() {
        EditButton.click();
    }

    public void clickOnDeleteButton() {
        deleteButton.click();
        confirmDeleteButton.click();
    }

    public void clickonsearchbutton(String name) {
        SearchInputText.sendKeys(name);
        SearchButton.click();
    }

    public void clickonsearchbuttonDelete(String name) {
        SearchInputText.clear();
        SearchInputText.sendKeys(name);
        SearchButton.click();
    }

    public void saveUpdateButton() {

        saveUpdateButton.click();
    }

    public void cancelButton() {

        cancelButton.click();
    }

    public void enternewupdateforTeam(String name, String desciption) {
        TeamNameEdit.clear();
        TeamNameEdit.sendKeys(name);
        TeamDescriptionEdit.clear();
        TeamDescriptionEdit.sendKeys(desciption);

    }

    public void exportfile() {
        Actions action = new Actions(driver);
        action.contextClick(emptyrightclick).perform();
        exportdiv.click();
        excelFile.click();

    }

    public void clickonSelectAll() {
        selectAll.click();
        spanclick.click();
    }

    public void clickOndeleteAll() {
        deleteAll.click();

    }


    public String getSelectMessage() {
        String message = (selectMessage).getText();
        System.out.println(message);
        return message;
    }
public void confirmdelete(){
    confirmDeleteButton.click();
}

}

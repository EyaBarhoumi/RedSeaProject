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
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-confirm-dialog/div[2]/button[2]")
    WebElement confirmDeleteButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-edit-vehicle-dialog/form/div[3]/button[2]")
    WebElement saveUpdateButton;
    @FindBy(id = "search-text-input")
    WebElement SearchInputText;
    @FindBy(id = "search-button")
    WebElement SearchButton;


    public void gotoAddIconbutton() {
        AddIconButton.click();
    }

    public void gotoTeamPage() {
        TeamsPageId.click();
    }

    public void enterTeamName() {
        TeamName.sendKeys("team created");
    }

    public void enterTeamDescription() {
        TeamDescription.sendKeys("team description");
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

    public void clickonsearchbutton() {
        SearchInputText.sendKeys("team created");
        SearchButton.click();
    }

    public void clickonsearchbuttonDelete() {
        SearchInputText.clear();
        SearchInputText.sendKeys("team updated");
        SearchButton.click();
    }
    public void saveUpdateButton() {

        saveUpdateButton.click();
    }

    public void enternewupdateforTeam() {
        TeamName.sendKeys("team updated");
        TeamDescription.sendKeys("team description  updated");

    }
}

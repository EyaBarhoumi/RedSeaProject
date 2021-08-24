package com.redsea.pages;

import com.redsea.base.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage extends Base {

    public VehiclePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "page-link-Vehicles")
    WebElement VehiclesPageId;
    @FindBy(id = "add-icon-button")
    WebElement AddIconButton;
    @FindBy(id = "Addnewvehicle")
    WebElement Addnewvehicle;
    @FindBy(id = "name")
    WebElement vehicleID;
    @FindBy(id = "brand")
    WebElement brand;
    @FindBy(xpath = "/html/body/div[3]/div[4]/div/div/div/mat-option[1]")
    WebElement brandValue;

    @FindBy(id = "profile")
    WebElement profileV;
    @FindBy(id = "profile-panel")
    WebElement profileValue;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-vehicle-dialog/form/div[3]")
    WebElement clickempty;

    @FindBy(id = "plateNumber")
    WebElement plateNumber;
    @FindBy(id = "color")
    WebElement color;
    @FindBy(xpath = "/html/body/div[3]/div[4]/div/div/div/mat-option[1]")
    WebElement colorBlack;
    @FindBy(id = "Staff")
    WebElement Staff;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/mat-option[3]")
    WebElement StaffValue;

    @FindBy(id = "shift")
    WebElement shift;
    @FindBy(xpath = "/html/body/div[3]/div[4]/div/div/div/mat-option[1]")
    WebElement shiftValue;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-vehicle-dialog/form/div[3]/button[2]")
    WebElement submitButton;


    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[1]/div/div[2]/button[2]\n")
    WebElement exportButton;

    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[4]/div[9]/div/span/tb-ag-grid-row-actions/div[2]/button[1]/span[1]/mat-icon/div\n")
    WebElement updateButton;

    @FindBy(id = "Importvehicles")
    WebElement importButton;

    @FindBy(id = "select")
    WebElement dragImportButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-import-excel-dialog/div/div/div/button[2]")
    WebElement saveImportButton;

    //search button
    @FindBy(id = "search-text-input")
    WebElement SearchInputText;
    @FindBy(id = "search-button")
    WebElement SearchButton;

    @FindBy(id = "delete-button")
    WebElement deleteButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-confirm-dialog/div[2]/button[2]")
    WebElement confirmDeleteButton;

    @FindBy(id = "edit-vehicle")
    WebElement EditButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-edit-vehicle-dialog/form/div[3]/button[2]")
    WebElement saveUpdateButton;

    public void gotoAddIconbutton() {
        AddIconButton.click();
    }

    public void gotovehiclePage() {
        VehiclesPageId.click();
    }

    public void gotoAddvehicle() {
        Addnewvehicle.click();
    }

    public void gotoImportvehicle() {
        importButton.click();
    }

    public void enterVehicleId() {
        vehicleID.sendKeys("123654789");
    }

    public void clickonBrand() {
        brand.click();
        brandValue.click();
    }

    public void clickonVehicleProfile() {
        profileV.click();
        profileValue.click();
    }

    public void enterPlateNumber() {
        plateNumber.sendKeys("123654789");
    }

    public void clickonColor() {
        color.click();
        colorBlack.click();
    }

    public void clickonDriveName() {
        Staff.click();
        StaffValue.click();
    }

    public void clickonShift() {
        shift.click();
        shiftValue.click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
    }

    public void submitNewVehicle() {
        submitButton.click();
    }

    public void clickonexportbutton() {

        exportButton.click();
    }

    public void clickonupdatebutton() {

        updateButton.click();
    }

    public void clickOnEditButton() {
        EditButton.click();

    }

    public void clickOnDeleteButton() {
        deleteButton.click();
        confirmDeleteButton.click();
    }


    public void importnewVehicle() {
        AddIconButton.click();
        importButton.click();
    }

    public void clickondragbutton() {

        dragImportButton.sendKeys("C:\\Users\\Eyaba\\Desktop\\Vehicle.xlsx");
    }

    public void SaveImport() {
        saveImportButton.click();
    }

    public void saveUpdateButton() {

        saveUpdateButton.click();
    }

    public void clickonsearchbutton() {
        SearchInputText.sendKeys("123654789");
        SearchButton.click();
    }

    public void clickonsearchbuttonDelete() {
        SearchInputText.clear();
        SearchInputText.sendKeys("123654788");
        SearchButton.click();
    }


    public void enternewupdateforvehicle() {
        vehicleID.clear();
        vehicleID.sendKeys("123654788");
        brand.click();
        brandValue.click();

    }
}

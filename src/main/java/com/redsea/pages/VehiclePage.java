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
    @FindBy(id = "ACCARS")
    WebElement brandValue;

    @FindBy(id = "profile")
    WebElement profileV;
    @FindBy(id = "Compactorvehicle")
    WebElement profileValue;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-vehicle-dialog/form/div[3]")
    WebElement clickempty;

    @FindBy(id = "plateNumber")
    WebElement plateNumber;
    @FindBy(id = "color")
    WebElement color;
    @FindBy(id = "Black")
    WebElement colorBlack;
    @FindBy(id = "Staff")
    WebElement Staff;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/mat-option[3]")
    WebElement StaffValue;

    @FindBy(id = "shift")
    WebElement shift;
    @FindBy(id = "Shift1708")
    WebElement shiftValue;
    @FindBy(id = "save")
    WebElement submitButton;
    @FindBy(id = "cancel")
    WebElement cancelButton;


    @FindBy(id = "vehicle-export")
    WebElement exportButton;

    @FindBy(id = "edit-vehicle")
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
    // delete button
    @FindBy(id = "delete-button")
    WebElement deleteButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-confirm-dialog/div[2]/button[2]")
    WebElement confirmDeleteButton;

    @FindBy(id = "edit-vehicle")
    WebElement EditButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-edit-vehicle-dialog/form/div[3]/button[2]")
    WebElement saveUpdateButton;

    //Error messages
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-vehicle-dialog/form/div[2]/tb-vehicle/div/form/fieldset/mat-form-field[1]/div/div[2]/div/mat-error")
    WebElement VehicleIdError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-vehicle-dialog/form/div[2]/tb-vehicle/div/form/fieldset/mat-form-field[2]/div/div[2]/div/mat-error")
    WebElement brandError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-vehicle-dialog/form/div[2]/tb-vehicle/div/form/fieldset/mat-form-field[3]/div/div[2]/div/mat-error")
    WebElement ProfileError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-vehicle-dialog/form/div[2]/tb-vehicle/div/form/fieldset/div[1]/div[1]/mat-form-field/div/div[2]/div/mat-error")
    WebElement PlateError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-vehicle-dialog/form/div[2]/tb-vehicle/div/form/fieldset/div[1]/div[2]/mat-form-field/div/div[2]/div/mat-error")
    WebElement ColorError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-new-vehicle-dialog/form/div[2]/tb-vehicle/div/form/fieldset/div[2]/div[2]/div/div/mat-form-field/div/div[3]/div/mat-error")
    WebElement ShiftError;


    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[2]/div/span[1]")
    WebElement selectMessage;


    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/tb-ag-grid-header-select")
    WebElement selectAll;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[2]/div/button")
    WebElement deleteAll;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[1]/div/div[1]/span")
    WebElement spanclick;

    // Error Messages Get methodes
    public String getVehicleIdErrorMessage() {
        String message = (VehicleIdError).getText();
        System.out.println(message);
        return message;
    }

    public String getbrandErrorMessage() {
        String message = (brandError).getText();
        System.out.println(message);
        return message;
    }

    public String getProfileErrorMessage() {
        String message = (ProfileError).getText();
        System.out.println(message);
        return message;
    }

    public String getPlateErrorMessage() {
        String message = (PlateError).getText();
        System.out.println(message);
        return message;
    }

    public String getColorErrorMessage() {
        String message = (ColorError).getText();
        System.out.println(message);
        return message;
    }

    public String getShiftErrorMessage() {
        String message = (ShiftError).getText();
        System.out.println(message);
        return message;
    }

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

    public void enterVehicleId(String id) {
        vehicleID.sendKeys(id);
    }

    public void clickonBrand() {
        brand.click();
        brandValue.click();
    }

    public void clickonVehicleProfile() {
        profileV.click();
        profileValue.click();
    }

    public void enterPlateNumber(String plNumber) {

        plateNumber.sendKeys(plNumber);
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

    public void cancelButton() {
        cancelButton.click();
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

    public void clickonsearchbutton(String id) {
        SearchInputText.sendKeys(id);
        SearchButton.click();
    }

    public void clickonsearchbuttonDelete(String id) {
        SearchInputText.clear();
        SearchInputText.sendKeys(id);
        SearchButton.click();
    }


    public void enternewupdateforvehicle(String id) {
        vehicleID.clear();
        vehicleID.sendKeys(id);
        brand.click();
        brandValue.click();

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

    public void confirmdelete() {
        confirmDeleteButton.click();
    }
}

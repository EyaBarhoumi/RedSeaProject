package com.redsea.pages;

import com.redsea.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VisitorPage extends Base {

    public VisitorPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "page-link-Visitors")
    WebElement VisitorPID;
    @FindBy(id = "add-icon-button")
    WebElement AddIconButton;
    @FindBy(id = "AddVisitor")
    WebElement AddVisitor;
    @FindBy(id = "fullName")
    WebElement fullName;
    @FindBy(id = "mobileNumber")
    WebElement mobileNumber;
    @FindBy(id = "idNumber")
    WebElement idNumber;
    @FindBy(id = "gender")
    WebElement gender;
    @FindBy(id = "visitorStartDate")
    WebElement visitorStartDate;
    @FindBy(id = "female")
    WebElement female;
    @FindBy(id = "nationality")
    WebElement nationality;
    @FindBy(id = "India")
    WebElement India;
    @FindBy(id = "visitorType")
    WebElement visitorType;
    @FindBy(id = "interview")
    WebElement interview;
    @FindBy(id = "visitorEndDate")
    WebElement visitorEndDate;
    @FindBy(id = "attachment-name-input")
    WebElement attachmentInput;
    @FindBy(id = "attachment-file-input")
    WebElement attachmentInputFile;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[3]/button[2]\n")
    WebElement submitButton;

    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[1]/div/div[2]/button[2]/span[1]/mat-icon")
    WebElement exportButton;

    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[4]/div[9]/div/span/tb-ag-grid-row-actions/div[2]/button[1]/span[1]/mat-icon/div\n")
    WebElement updateButton;

    @FindBy(id = "ImportVisitor")
    WebElement importButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[3]/button[1]")
    WebElement cancelButton;

    @FindBy(id = "select")
    WebElement dragButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-import-excel-dialog/div/div/div/button[2]")
    WebElement saveImportButton;

    @FindBy(id = "search-text-input")
    WebElement SearchInputText;

    @FindBy(id = "search-button")
    WebElement SearchButton;
    @FindBy(id = "delete-button")
    WebElement deleteButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-confirm-dialog/div[2]/button[2]")
    WebElement confirmdeleteButton;

    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[9]/div/span/tb-ag-grid-row-actions/div[2]/button[1]")
    WebElement EditButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-edit-visitor-dialog/form/div[3]/button[2]")
    WebElement saveUpdateButton;
    //Error Messages
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[2]/tb-visitor/div/form/fieldset/div[2]/div/mat-form-field/div/div[2]/div/mat-error")
    WebElement fullnameError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[2]/tb-visitor/div/form/fieldset/div[3]/div/div[1]/mat-form-field/div/div[2]/div/mat-error")
    WebElement numberError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[2]/tb-visitor/div/form/fieldset/div[3]/div/div[2]/mat-form-field/div/div[2]/div/mat-error")
    WebElement idPassportNumberError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[2]/tb-visitor/div/form/fieldset/div[4]/div[1]/mat-form-field/div/div[2]/div/mat-error")
    WebElement genderError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[2]/tb-visitor/div/form/fieldset/div[4]/div[2]/mat-form-field/div/div[2]/div/mat-error")
    WebElement nationalityError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[2]/tb-visitor/div/form/fieldset/div[5]/div[1]/mat-form-field/div/div[2]/div/mat-error")
    WebElement visitorTypeError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[2]/tb-visitor/div/form/fieldset/div[6]/div[1]/mat-form-field/div/div[2]/div/mat-error")
    WebElement startDateError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-visitor-dialog/form/div[2]/tb-visitor/div/form/fieldset/div[6]/div[2]/mat-form-field/div/div[2]/div/mat-error")
    WebElement endDateError;

    // Error Messages Get methodes
    public String getfullnameErrorMessage() {
        String message = (fullnameError).getText();
        System.out.println(message);
        return message;
    }

    public String getnumberErrorMessage() {
        String message = (numberError).getText();
        System.out.println(message);
        return message;
    }

    public String getidPassportNumberErrorMessage() {
        String message = (idPassportNumberError).getText();
        System.out.println(message);
        return message;
    }

    public String getnationalityErrorMessage() {
        String message = (nationalityError).getText();
        System.out.println(message);
        return message;
    }

    public String getgenderErrorMessage() {
        String message = (genderError).getText();
        System.out.println(message);
        return message;
    }

    public String getvisitorTypeErrorMessage() {
        String message = (visitorTypeError).getText();
        System.out.println(message);
        return message;
    }

    public String getstartDateErrorMessage() {
        String message = (startDateError).getText();
        System.out.println(message);
        return message;
    }

    public String getendDateErrorMessage() {
        String message = (endDateError).getText();
        System.out.println(message);
        return message;
    }


    public void gotoVisitor() {
        VisitorPID.click();
    }

    public void clickOncancelButton() {
        cancelButton.click();
    }

    public void gotoAddIconbutton() {
        AddIconButton.click();
    }

    public void gotoAddvisitor() {
        AddVisitor.click();
    }

    public void entervisitorInformationP1() {
        fullName.sendKeys("visitorTest");
        mobileNumber.sendKeys("523698000");
        idNumber.sendKeys("523698000");
    }

    public void clickonGender() {
        gender.click();
        female.click();
    }

    public void clickOnnationality() {
        nationality.click();
        India.click();
    }

    public void clickOnVisType() {
        visitorType.click();
        interview.click();
    }

    public void clickOnStartDate() {
        visitorStartDate.sendKeys("09252017");
        visitorStartDate.sendKeys(Keys.TAB);
        visitorStartDate.sendKeys("0345PM");

    }

    public void clickOnEndDate() {
        visitorEndDate.sendKeys("09252020");
        visitorEndDate.sendKeys(Keys.TAB);
        visitorEndDate.sendKeys("0245PM");

    }

    public void ClickOnattachment() {
        attachmentInput.sendKeys("file123");
        attachmentInputFile.sendKeys("C:\\Users\\Eyaba\\Desktop\\file.pdf");
    }

    public void clickToConfirmAdd() {

        submitButton.click();
    }

    public void clickonexportbutton() {

        exportButton.click();
    }

    public void clickonupdatebutton() {

        updateButton.click();
    }

    public void clickondragbutton() {
        dragButton.sendKeys("C:\\Users\\Eyaba\\Desktop\\Visitorlist.xlsx");
    }

    public void clickonsearchbutton() {
        SearchInputText.sendKeys("visitorTest");
        SearchButton.click();
    }


    public void clickOnEditButton() {
        EditButton.click();

    }

    public void clickOnDeleteButton() {
        deleteButton.click();
        confirmdeleteButton.click();
    }

    public void enterVisitornewInformation() {
        fullName.clear();
        fullName.sendKeys("visitorTestTest");
        mobileNumber.clear();
        mobileNumber.sendKeys("523698015");
        idNumber.clear();
        idNumber.sendKeys("523698015");
        visitorEndDate.clear();
        visitorEndDate.sendKeys("09252021");
        visitorEndDate.sendKeys(Keys.TAB);
        visitorEndDate.sendKeys("0245PM");

    }


    public void importnewvisitor() {
        AddIconButton.click();
        importButton.click();
    }

    public void SaveImport() {
        saveImportButton.click();
    }

    public void saveUpdateButton() {
        saveUpdateButton.click();
    }

    public void clickonsearchbuttonDelete() {
        SearchInputText.clear();
        SearchInputText.sendKeys("visitorTestTest");
        SearchButton.click();
    }


}

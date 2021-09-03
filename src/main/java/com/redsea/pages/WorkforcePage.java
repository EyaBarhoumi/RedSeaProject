package com.redsea.pages;

import com.redsea.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkforcePage extends Base {
    public WorkforcePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-icon-button")
    WebElement AddIconButton;
    @FindBy(id = "Addnewworkforce")
    WebElement AddnewworkforceButton;
    @FindBy(id = "ImportWorkforce")
    WebElement ImportWorkforceButton;
    @FindBy(id = "page-link-Workforces")
    WebElement pageWorkforce;
    @FindBy(id = "0dbb337e-b68b-d6f9-2f23-f1d5fac549a0")
    WebElement dragImButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[2]/div/div/tb-image-input/div/div/div[3]")
    WebElement dragImageButton;
    @FindBy(id = "fullname")
    WebElement fullnameWF;
    @FindBy(id = "email")
    WebElement emailwf;
    @FindBy(id = "mobileNumber")
    WebElement numberwf;
    @FindBy(id = "birthday")
    WebElement birthdatewf;
    @FindBy(id = "idNumber")
    WebElement idPassportNumberwf;
    @FindBy(id = "nationality")
    WebElement nationalitywf;
    @FindBy(xpath = "/html/body/div[3]/div[4]/div/div/div/mat-option[2]")
    WebElement nationalitySAwf;
    @FindBy(id = "India")
    WebElement nationalityIndia;
    @FindBy(id = "gender")
    WebElement genderwf;
    @FindBy(id = "female")
    WebElement genderfemalewf;
    @FindBy(id = "employmentType")
    WebElement professionwf;
    @FindBy(id = "engnieer")
    WebElement professionEngineerwf;
    @FindBy(id = "driver")
    WebElement professiondriverwf;
    @FindBy(id = "workingStatus")
    WebElement Workingstatuswf;
    @FindBy(id = "retired")
    WebElement Retiredwf;
    @FindBy(id = "workforceProfile")
    WebElement profilewf;
    @FindBy(id = "Team")
    WebElement teamwf;
    @FindBy(id = "Team01")
    WebElement teamcreatedwf;
    @FindBy(id = "Vehicle")
    WebElement vehicledwf;
    @FindBy(id = "attachment-name-input")
    WebElement UploadattachmentNamewf;
    @FindBy(id = "attachment-file-input")
    WebElement attachmentInputFile;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[3]/button[2]")
    WebElement submitButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[3]/button[1]")
    WebElement cancelButton;


    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[1]/div/div[2]/button[2]")
    WebElement exportButton;

    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[4]/div[9]/div/span/tb-ag-grid-row-actions/div[2]/button[1]/span[1]/mat-icon/div\n")
    WebElement updateButton;

    @FindBy(id = "select")
    WebElement dragImportButton;

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
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-edit-workforce-dialog/form/div[3]/button[2]")
    WebElement saveUpdateButton;

    //Error Messages
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[3]/div[1]/mat-form-field/div/div[2]/div")
    WebElement fullnameError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[3]/div[2]/mat-form-field/div/div[2]/div/mat-error")
    WebElement emailError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[4]/div/div[1]/mat-form-field/div/div[2]/div")
    WebElement numberError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[4]/div/div[2]/mat-form-field/div/div[2]/div")
    WebElement birthdateError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[5]/div[1]/mat-form-field/div/div[2]/div/mat-error")
    WebElement idPassportNumberError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[5]/div[2]/mat-form-field/div/div[2]/div")
    WebElement nationalityError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[6]/div[1]/mat-form-field/div/div[2]/div")
    WebElement genderError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[6]/div[2]/mat-form-field/div/div[2]/div")
    WebElement professionError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[7]/div[1]/mat-form-field/div/div[2]/div")
    WebElement WorkingstatusError;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/tb-add-workforce-dialog/form/div[2]/tb-workforce/div/form/fieldset/div[7]/div[2]/mat-form-field/div/div[2]/div")
    WebElement profileError;

    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/ag-grid-angular/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/tb-ag-grid-header-select")
    WebElement selectAll;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[2]/div/button")
    WebElement deleteAll;
    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[1]/div/div[1]/span")
    WebElement spanclick;


    @FindBy(xpath = "/html/body/tb-root/tb-home/mat-sidenav-container/mat-sidenav-content/div/div/tb-ag-grid-entity/mat-drawer-container/mat-drawer-content/div/div/mat-toolbar[2]/div/span[1]")
    WebElement selectMessage;

    // Error Messages Get methodes
    public String getfullnameErrorMessage() {
        String message = (fullnameError).getText();
        System.out.println(message);
        return message;
    }

    public String getemailErrorMessage() {
        String message = (emailError).getText();
        System.out.println(message);
        return message;
    }

    public String getnumberErrorMessage() {
        String message = (numberError).getText();
        System.out.println(message);
        return message;
    }

    public String getbirthdateErrorMessage() {
        String message = (birthdateError).getText();
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

    public String getprofessionErrorMessage() {
        String message = (professionError).getText();
        System.out.println(message);
        return message;
    }

    public String getWorkingstatusErrorMessage() {
        String message = (WorkingstatusError).getText();
        System.out.println(message);
        return message;
    }

    public String getprofileErrorMessage() {
        String message = (profileError).getText();
        System.out.println(message);
        return message;
    }


    public void gotoAddIconbutton() {
        AddIconButton.click();
    }

    public void gotoworkforcePage() {
        pageWorkforce.click();
    }

    public void gotoAddworkforce() {
        AddnewworkforceButton.click();
    }

    public void gotoImportWorkforce() {
        ImportWorkforceButton.click();
    }


    public void Enterfullname(String name) {
        fullnameWF.sendKeys(name);
    }

    public void enteremail(String email) {
        emailwf.sendKeys(email);
    }

    public void enternumberwf(String number) {
        numberwf.sendKeys(number);
    }

    public void enterIdPassport(String id) {
        idPassportNumberwf.sendKeys(id);
    }

    public void clickonGender() {
        genderwf.click();
        genderfemalewf.click();
    }

    public void clickOnnationality() {
        nationalitywf.click();
        nationalitySAwf.click();
    }

    public void clickOnbirthdatewf(String birthday) {
        birthdatewf.sendKeys(birthday);
    }

    public void clickOnprofessionwf() {
        professionwf.click();
        professionEngineerwf.click();
    }

    public void clickOnWorkingstatuswf() {
        Workingstatuswf.click();
        Retiredwf.click();
    }

    public void clickOnWorkforceprofile(String profile) {
        profilewf.sendKeys(profile);
    }

    public void clickOnTeamwf() {
        teamwf.click();
        teamcreatedwf.click();
    }

    public void clickonSelectvehicle(String vehicle) {
        vehicledwf.sendKeys(vehicle);
    }

    public void ClickOnattachment(String filename, String filelocation) {
        UploadattachmentNamewf.sendKeys(filename);
        attachmentInputFile.sendKeys(filelocation);
    }

    public void ClickOnImageupload() {
        dragImButton.sendKeys("C:\\Users\\Eyaba\\Desktop\\5172619.png");
    }

    public void ClickOnImageuploadButton() {
        dragImageButton.sendKeys("C:\\Users\\Eyaba\\Desktop\\5172619.png");
    }

    public void clickToAddWf() {
        submitButton.click();
    }

    public void clickOncancelButton() {
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
        confirmdeleteButton.click();
    }


    public void importnewWorkforce() {
        AddIconButton.click();
        ImportWorkforceButton.click();
    }

    public void clickondragbutton() {
        dragImportButton.sendKeys("C:\\Users\\Eyaba\\Desktop\\Workforce.xlsx");
    }

    public void SaveImport() {
        saveImportButton.click();
    }

    public void saveUpdateButton() {
        saveUpdateButton.click();
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

    public void enternewupdateforworkforce(String name, String email, String birthday, String id) {
        fullnameWF.clear();
        fullnameWF.sendKeys(name);
        emailwf.clear();
        emailwf.sendKeys(email);
        birthdatewf.clear();
        birthdatewf.sendKeys(birthday);
        idPassportNumberwf.clear();
        idPassportNumberwf.sendKeys(id);
//        nationalitywf.clear();
        nationalitywf.click();
        nationalityIndia.click();
//        professionwf.clear();
        professionwf.click();
        professiondriverwf.click();
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
        confirmdeleteButton.click();
    }

}

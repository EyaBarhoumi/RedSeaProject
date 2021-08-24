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


    public void Enterfullname() {
        fullnameWF.sendKeys("workforce Test");
    }

    public void enteremail() {
        emailwf.sendKeys("wftest01@gmail.com");
    }

    public void enternumberwf() {
        numberwf.sendKeys("523611000");
    }

    public void enterIdPassport() {
        idPassportNumberwf.sendKeys("523611000");
    }

    public void clickonGender() {
        genderwf.click();
        genderfemalewf.click();
    }

    public void clickOnnationality() {
        nationalitywf.click();
        nationalitySAwf.click();
    }

    public void clickOnbirthdatewf() {
        birthdatewf.sendKeys("12252020");
    }

    public void clickOnprofessionwf() {
        professionwf.click();
        professionEngineerwf.click();
    }

    public void clickOnWorkingstatuswf() {
        Workingstatuswf.click();
        Retiredwf.click();
    }

    public void clickOnWorkforceprofile() {
        profilewf.sendKeys("profile");
    }

    public void clickOnTeamwf() {
        teamwf.click();
        teamcreatedwf.click();
    }

    public void clickonSelectvehicle() {
        vehicledwf.sendKeys("vehicle");
    }

    public void ClickOnattachment() {
        UploadattachmentNamewf.sendKeys("file123");
        attachmentInputFile.sendKeys("C:\\Users\\Eyaba\\Desktop\\file.pdf");
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

    public void clickonsearchbutton() {
        SearchInputText.sendKeys("workforce Test");
        SearchButton.click();
    }

    public void clickonsearchbuttonDelete() {
        SearchInputText.clear();
        SearchInputText.sendKeys("workforceTestTest");
        SearchButton.click();
    }

    public void enternewupdateforworkforce() {
        fullnameWF.clear();
        fullnameWF.sendKeys("workforceTestTest");
        emailwf.clear();
        emailwf.sendKeys("workforcetesttest@gmail.com");
        birthdatewf.clear();
        birthdatewf.sendKeys("12252021");
        idPassportNumberwf.clear();
        idPassportNumberwf.sendKeys("523698009");
//        nationalitywf.clear();
        nationalitywf.click();
        nationalityIndia.click();
//        professionwf.clear();
        professionwf.click();
        professiondriverwf.click();
    }

}

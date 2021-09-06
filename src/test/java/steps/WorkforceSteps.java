package steps;

import com.redsea.base.Base;
import com.redsea.pages.WorkforcePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class WorkforceSteps extends Base {


    WorkforcePage workforcePage;

    @Given("User go to workforce page")
    public void userGoToWorkforcePage() throws InterruptedException {
        Thread.sleep(3000);
        workforcePage = new WorkforcePage();
        workforcePage.gotoworkforcePage();
        Thread.sleep(3000);
    }

    @And("click on add new workforce")
    public void clickOnAddNewWorkforce() {
        workforcePage.gotoAddIconbutton();
        workforcePage.gotoAddworkforce();

    }

    @When("User type workforce new information")
    public void userTypeWorkforceNewInformation(DataTable data) throws InterruptedException {
        //   workforcePage.ClickOnImageupload();
        //  workforcePage.ClickOnImageuploadButton();
        Thread.sleep(3000);
        workforcePage.Enterfullname(data.cell(0, 0));
        workforcePage.enteremail(data.cell(0, 1));
        workforcePage.enternumberwf(data.cell(0, 2));
        workforcePage.clickOnbirthdatewf(data.cell(0, 3));
        workforcePage.enterIdPassport(data.cell(0, 4));
        workforcePage.clickOnnationality();
        workforcePage.clickonGender();
        workforcePage.clickOnprofessionwf();
        workforcePage.clickOnWorkingstatuswf();
        workforcePage.clickOnWorkforceprofile(data.cell(0, 5));
        workforcePage.clickOnTeamwf();
        workforcePage.clickonSelectvehicle(data.cell(0, 6));
        workforcePage.ClickOnattachment(data.cell(0, 7), data.cell(0, 8));


    }

    @And("click on submit button to confirm")
    public void clickOnSubmitButtonToConfirm() throws InterruptedException {
        workforcePage.clickToAddWf();
        Thread.sleep(4000);
    }

    @Then("User should navigate to workforce dashboard")
    public void userShouldNavigateToWorkforceDashboard() {
        driver.navigate().refresh();
    }

    @Given("User select workforce to update")
    public void userSelectWorkforceToUpdate(DataTable data) throws InterruptedException {
        Thread.sleep(3000);
        workforcePage = new WorkforcePage();
        workforcePage.gotoworkforcePage();
        workforcePage.clickonsearchbutton(data.cell(0, 0));
        Thread.sleep(1000);
        workforcePage.clickOnEditButton();
    }

    @When("User update workforce information")
    public void userUpdateWorkforceInformation(DataTable data) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(" load workforce to update");

        workforcePage.enternewupdateforworkforce(data.cell(0, 0), data.cell(0, 1), data.cell(0, 2), data.cell(0, 3));

    }

    @Then("User click on save workforce update button")
    public void userClickOnSaveWorkforceUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        workforcePage.saveUpdateButton();
    }

    @Given("User select workforce to delete")
    public void userSelectWorkforceToDelete(DataTable data) throws InterruptedException {
        Thread.sleep(3000);
        workforcePage = new WorkforcePage();
        workforcePage.gotoworkforcePage();
        workforcePage.clickonsearchbuttonDelete(data.cell(0, 0));
    }

    @When("User click the delete workforce button")
    public void userClickTheDeleteWorkforceButton() throws InterruptedException {
        Thread.sleep(3000);
        workforcePage.clickOnDeleteButton();
    }

    @Given("User go to workforce menu")
    public void userGoToWorkforceMenu() throws InterruptedException {
        Thread.sleep(3000);
        workforcePage = new WorkforcePage();
        workforcePage.gotoworkforcePage();
    }

    @When("User click on import workforce list")
    public void userClickOnImportWorkforceList() throws InterruptedException {
        System.out.println(" load workforce to import");
        Thread.sleep(1000);
        //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        workforcePage.importnewWorkforce();
    }

    @Then("User add the workforce list")
    public void userAddTheWorkforceList() {
        workforcePage.clickondragbutton();
        workforcePage.SaveImport();
    }

    @When("User click on export workforce button")
    public void userClickOnExportWorkforceButton() throws InterruptedException {
        Thread.sleep(1000);
        workforcePage.clickonexportbutton();
    }


    @Given("User go to add new workforce")
    public void userGoToAddNewWorkforce() throws InterruptedException {
        Thread.sleep(3000);
        workforcePage = new WorkforcePage();
        workforcePage.gotoworkforcePage();
        Thread.sleep(3000);
        workforcePage.gotoAddIconbutton();
        workforcePage.gotoAddworkforce();

    }

    @When("User click directly on submit button")
    public void userClickDirectlyOnSubmitButton() throws InterruptedException {
        workforcePage.clickToAddWf();
        Thread.sleep(3000);
    }

    @Then("Error messages should be displayed")
    public void errorMessagesShouldBeDisplayed() {

        String fullnameError = workforcePage.getfullnameErrorMessage();
        Assert.assertEquals((fullnameError), "Full Name is required.");


        String emailError = workforcePage.getemailErrorMessage();
        Assert.assertEquals((emailError), "Please enter a valid email address");

        String numberError = workforcePage.getnumberErrorMessage();
        Assert.assertEquals((numberError), "Mobile No is required.");

        String birthdateError = workforcePage.getbirthdateErrorMessage();
        Assert.assertEquals((birthdateError), "Date of birth is required");

        String idPassportNumberError = workforcePage.getidPassportNumberErrorMessage();
        Assert.assertEquals((idPassportNumberError), "ID/passport number is required");

        String nationalityError = workforcePage.getnationalityErrorMessage();
        Assert.assertEquals((nationalityError), "Nationality is required");

        String genderError = workforcePage.getgenderErrorMessage();
        Assert.assertEquals((genderError), "Gender is required");

        String professionError = workforcePage.getprofessionErrorMessage();
        Assert.assertEquals((professionError), "Profession is required");

        String WorkingstatusError = workforcePage.getWorkingstatusErrorMessage();
        Assert.assertEquals((WorkingstatusError), "Working status is required");

        String profileError = workforcePage.getprofileErrorMessage();
        Assert.assertEquals((profileError), "Workforce profile is required");


    }

    @And("User quit the page workforce")
    public void userQuitThePageWorkforce() throws InterruptedException {
        workforcePage.clickOncancelButton();
        Thread.sleep(3000);
    }

    @When("Add multiple workforces")
    public void addMultipleWorkforces(DataTable WorkforceData) throws InterruptedException {
        Thread.sleep(3000);
        List<Map<String, String>> wf = WorkforceData.asMaps(String.class, String.class);
        for (Map<String, String> workforce : wf) {
            Thread.sleep(2000);
            workforcePage.gotoAddIconbutton();
            workforcePage.gotoAddworkforce();
            Thread.sleep(2000);
            workforcePage.Enterfullname(workforce.get("fullName"));
            workforcePage.enteremail(workforce.get("email"));
            workforcePage.enternumberwf(workforce.get("Number"));
            workforcePage.clickOnbirthdatewf(workforce.get("birthdate"));
            workforcePage.enterIdPassport(workforce.get("idPassport"));
            workforcePage.clickOnnationality();
            workforcePage.clickonGender();
            workforcePage.clickOnprofessionwf();
            workforcePage.clickOnWorkingstatuswf();
            workforcePage.clickOnWorkforceprofile(workforce.get("Workforceprofile"));
            workforcePage.clickOnTeamwf();
            workforcePage.clickonSelectvehicle(workforce.get("vehicle"));
            workforcePage.ClickOnattachment(workforce.get("fileName"), workforce.get("fileLocation"));

            workforcePage.clickToAddWf();
        }

    }

    @Then("select the workforces added")
    public void selectTheWorkforcesAdded() throws InterruptedException {
        Thread.sleep(3000);
        workforcePage.clickonSelectAll();
        String MessagePop = workforcePage.getSelectMessage();
        Assert.assertEquals((MessagePop), "6 workforces selected");
        Thread.sleep(9000);

    }

    @And("Click on delete workforces button")
    public void clickOnDeleteWorkforcesButton() throws InterruptedException {
        Thread.sleep(3000);
        workforcePage.clickOndeleteAll();
        workforcePage.confirmdelete();
        Thread.sleep(3000);
    }
}

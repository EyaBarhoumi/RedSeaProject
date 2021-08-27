package steps;

import com.redsea.base.Base;
import com.redsea.pages.WorkforcePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    public void userTypeWorkforceNewInformation() throws InterruptedException {
        //   workforcePage.ClickOnImageupload();
        //  workforcePage.ClickOnImageuploadButton();
        Thread.sleep(3000);
        workforcePage.Enterfullname();
        workforcePage.enteremail();
        workforcePage.enternumberwf();
        workforcePage.clickOnbirthdatewf();
        workforcePage.enterIdPassport();

        workforcePage.clickOnnationality();
        workforcePage.clickonGender();
        workforcePage.clickOnprofessionwf();
        workforcePage.clickOnWorkingstatuswf();
        workforcePage.clickOnWorkforceprofile();
        workforcePage.clickOnTeamwf();
        workforcePage.clickonSelectvehicle();
        workforcePage.ClickOnattachment();


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
    public void userSelectWorkforceToUpdate() throws InterruptedException {
        Thread.sleep(3000);
        workforcePage = new WorkforcePage();
        workforcePage.gotoworkforcePage();
        workforcePage.clickonsearchbutton();
        Thread.sleep(1000);
        workforcePage.clickOnEditButton();
    }

    @When("User update workforce information")
    public void userUpdateWorkforceInformation() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(" load workforce to update");

        workforcePage.enternewupdateforworkforce();

    }

    @Then("User click on save workforce update button")
    public void userClickOnSaveWorkforceUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        workforcePage.saveUpdateButton();
    }

    @Given("User select workforce to delete")
    public void userSelectWorkforceToDelete() throws InterruptedException {
        Thread.sleep(3000);
        workforcePage = new WorkforcePage();
        workforcePage.gotoworkforcePage();
        workforcePage.clickonsearchbuttonDelete();
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

}

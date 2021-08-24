package steps;

import com.redsea.base.Base;
import com.redsea.pages.WorkforcePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
}

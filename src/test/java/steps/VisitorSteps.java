package steps;

import com.redsea.base.Base;
import com.redsea.pages.VisitorPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class VisitorSteps extends Base {
    VisitorPage visitorPage;

    @Given("User go to visitor page and click on add new visitor")
    public void user_go_to_visitor_page_and_click_on_add_new_visitor() throws InterruptedException {

        System.out.println(" load visitor");
        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(3000);

    }

    @And("click on add new visitor")
    public void clickOnAddNewVisitor() throws InterruptedException {
        visitorPage.gotoAddIconbutton();
        visitorPage.gotoAddvisitor();
        Thread.sleep(3000);
    }


    @When("User type visitor information")
    public void user_type_visitor_information(DataTable data) throws InterruptedException {
        Thread.sleep(3000);
        visitorPage.entervisitorInformationP1(data.cell(0, 0), data.cell(0, 1), data.cell(0, 2));
        visitorPage.clickonGender();
        visitorPage.clickOnnationality();
        visitorPage.clickOnVisType();
        visitorPage.clickOnStartDate(data.cell(0, 3), data.cell(0, 4));
        visitorPage.clickOnEndDate(data.cell(0, 5), data.cell(0, 6));
        visitorPage.ClickOnattachment(data.cell(0, 7), data.cell(0, 8));
        Thread.sleep(3000);
    }


    @And("click on button to confirm")
    public void clickOnButtonToConfirm() throws InterruptedException {

        visitorPage.clickToConfirmAdd();
        Thread.sleep(4000);
    }

    @Then("User should navigate to visitor dashboard")
    public void user_should_navigate_to_visitor_dashboard() {
        System.out.println("visitor created");
        driver.navigate().refresh();

    }

    @Given("User go to visitor page")
    public void userGoToVisitorPage() throws InterruptedException {
        System.out.println(" load visitor");
        Thread.sleep(3000);
        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(3000);
    }


    @When("User click on export button")
    public void userClickOnExportButton() throws InterruptedException {
        Thread.sleep(1000);
        visitorPage.clickonexportbutton();
    }

    @Given("User select visitor to update")
    public void userSelectVisitorToUpdate(DataTable data) throws InterruptedException {
        System.out.println(" load visitor");
        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(1000);
        visitorPage.clickonsearchbutton(data.cell(0, 0));
        visitorPage.clickOnEditButton();
        Thread.sleep(2000);
    }

    @When("User update information")
    public void userUpdateInformation(DataTable data) throws InterruptedException {
        System.out.println(" load visitor to update");
        Thread.sleep(3000);
        visitorPage.enterVisitornewInformation(data.cell(0, 0), data.cell(0, 1), data.cell(0, 2), data.cell(0, 3), data.cell(0, 4));

    }

    @Then("User click on save update button")
    public void userClickOnSaveUpdateButton() throws InterruptedException {
        System.out.println(" looking for import button");
        Thread.sleep(2000);
        visitorPage.saveUpdateButton();
        Thread.sleep(2000);
    }

    @Given("User select visitor to delete")
    public void userSelectVisitorToDelete(DataTable data) throws InterruptedException {
        System.out.println(" load visitor");
        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(2000);
        visitorPage.clickonsearchbuttonDelete(data.cell(0, 0));
    }

    @When("User click the delete button")
    public void userClickTheDeleteButton() throws InterruptedException {
        Thread.sleep(2000);
        visitorPage.clickOnDeleteButton();
    }

    @Given("User go to visitor menu")
    public void userGoToVisitorMenu() throws InterruptedException {
        System.out.println(" load visitor");
        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(3000);
    }

    @When("User click on import visitors list")
    public void userClickOnImportVisitorsList() throws InterruptedException {
        System.out.println(" load visitor to import");
        Thread.sleep(5000);
        visitorPage.importnewvisitor();
    }

    @Then("User add the visitors list")
    public void userAddTheVisitorsList(DataTable data) {
        visitorPage.clickondragbutton(data.cell(0, 0));
        visitorPage.SaveImport();
    }

    @Given("User go to add new visitor")
    public void userGoToAddNewVisitor() throws InterruptedException {
        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(3000);
        visitorPage.gotoAddIconbutton();
        visitorPage.gotoAddvisitor();
        Thread.sleep(3000);

    }

    @When("User click directly on submit visitor button")
    public void userClickDirectlyOnSubmitVisitorButton() throws InterruptedException {
        visitorPage.clickToConfirmAdd();
        Thread.sleep(3000);
    }

    @Then("Error messages should be displayed visitor")
    public void errorMessagesShouldBeDisplayedVisitor() {
        String fullnameError = visitorPage.getfullnameErrorMessage();
        Assert.assertEquals((fullnameError), "Full Name is required.");

        String numberError = visitorPage.getnumberErrorMessage();
        Assert.assertEquals((numberError), "Mobile No is required.");

        String idPassportNumberError = visitorPage.getidPassportNumberErrorMessage();
        Assert.assertEquals((idPassportNumberError), "ID/passport number is required");

        String genderError = visitorPage.getgenderErrorMessage();
        Assert.assertEquals((genderError), "Gender is required");

        String nationalityError = visitorPage.getnationalityErrorMessage();
        Assert.assertEquals((nationalityError), "Nationality is required");

        String visitorTypeError = visitorPage.getvisitorTypeErrorMessage();
        Assert.assertEquals((visitorTypeError), "Visitor type is required");

        String startDateError = visitorPage.getstartDateErrorMessage();
        Assert.assertEquals((startDateError), "Visit Start Date is required");

        String endDateError = visitorPage.getendDateErrorMessage();
        Assert.assertEquals((endDateError), "Visit End Date is required");


    }

    @And("User quit the add page visitor")
    public void userQuitTheAddPageVisitor() throws InterruptedException {
        visitorPage.clickOncancelButton();
        Thread.sleep(1000);

    }


    @When("Add multiple visitors")
    public void addMultipleVisitors(DataTable visitorData) throws InterruptedException {
        Thread.sleep(3000);
        List<Map<String, String>> vis = visitorData.asMaps(String.class, String.class);
        for (Map<String, String> visitor : vis) {
            visitorPage.gotoAddIconbutton();
            visitorPage.gotoAddvisitor();
            Thread.sleep(3000);
            visitorPage.entervisitorInformationP1(visitor.get("fullName"), visitor.get("mobileNumber"), visitor.get("idNumber"));
            visitorPage.clickonGender();
            visitorPage.clickOnnationality();
            visitorPage.clickOnVisType();
            visitorPage.clickOnStartDate(visitor.get("visitorStartdate"), visitor.get("visitorStartTime"));
            visitorPage.clickOnEndDate(visitor.get("visitorEnddate"), visitor.get("visitorEndTime"));
            visitorPage.ClickOnattachment(visitor.get("fileName"), visitor.get("fileLocation"));
            visitorPage.clickToConfirmAdd();
        }
    }


    @Then("select the visitors added")
    public void selectTheVisitorsAdded() throws InterruptedException {
        Thread.sleep(3000);
        visitorPage.clickonSelectAll();
        String MessagePop = visitorPage.getSelectMessage();
        Assert.assertEquals((MessagePop), "4 visitors selected");
        Thread.sleep(9000);
    }

    @And("Click on delete button")
    public void clickOnDeleteButton() throws InterruptedException {
        Thread.sleep(3000);
        visitorPage.clickOndeleteAll();

        visitorPage.confirmdelete();
        Thread.sleep(3000);
    }
}

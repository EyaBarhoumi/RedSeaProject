package steps;

import com.redsea.base.Base;
import com.redsea.pages.VisitorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;


public class VisitorSteps extends Base {
    VisitorPage visitorPage;

    @Given("User go to visitor page and click on add new visitor")
    public void user_go_to_visitor_page_and_click_on_add_new_visitor() throws InterruptedException {

        System.out.println(" load visitor");

        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(5000);
        visitorPage.gotoAddIconbutton();
        visitorPage.gotoAddvisitor();
        Thread.sleep(5000);


    }

    @When("User type visitor information")
    public void user_type_visitor_information() {

        visitorPage.entervisitorInformationP1();
        visitorPage.clickonGender();
        visitorPage.clickOnnationality();
        visitorPage.clickOnVisType();
        visitorPage.clickOnStartDate();
        visitorPage.clickOnEndDate();
        visitorPage.ClickOnattachment();
        visitorPage.clickToConfirmAdd();
    }

    @When("click to confirm")
    public void click_to_confirm() throws InterruptedException {
        Thread.sleep(5000);
        visitorPage.clickToConfirmAdd();
    }

    @Then("User should navigate to visitor dashboard")
    public void user_should_navigate_to_visitor_dashboard() {
        System.out.println("visitor created");

    }

    @Given("User go to visitor page")
    public void userGoToVisitorPage() throws InterruptedException {
        System.out.println(" load visitor");
        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(5000);
    }


    @When("User click on export button")
    public void userClickOnExportButton() throws InterruptedException {
        Thread.sleep(1000);
        visitorPage.clickonexportbutton();
    }

    @Given("User select visitor to update")
    public void userSelectVisitorToUpdate() throws InterruptedException {
        System.out.println(" load visitor");
        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(1000);
        visitorPage.clickonsearchbutton();
        visitorPage.clickOnEditButton();
    }

    @When("User update information")
    public void userUpdateInformation() throws InterruptedException {
        System.out.println(" load visitor to update");
        Thread.sleep(3000);
        visitorPage.enterVisitornewInformation();

    }

    @Then("User click on save update button")
    public void userClickOnSaveUpdateButton() {
        System.out.println(" looking for import button");
        visitorPage.saveUpdateButton();
    }

    @Given("User select visitor to delete")
    public void userSelectVisitorToDelete() throws InterruptedException {
        System.out.println(" load visitor");
        visitorPage = new VisitorPage();
        visitorPage.gotoVisitor();
        Thread.sleep(2000);
        visitorPage.clickonsearchbuttonDelete();

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
        //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        visitorPage.importnewvisitor();

    }

    @Then("User add the visitors list")
    public void userAddTheVisitorsList() {
        visitorPage.clickondragbutton();
        visitorPage.SaveImport();
    }


}

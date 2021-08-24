package steps;

import com.redsea.base.Base;
import com.redsea.pages.VehiclePage;
import com.redsea.pages.WorkforcePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VehicleSteps extends Base {
    VehiclePage vehiclePage;

    @Given("User go to vehicle page")
    public void user_go_to_vehicle_page() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
        Thread.sleep(2000);
    }


    @And("click on add new vehicle")
    public void clickOnAddNewVehicle() {
        vehiclePage.gotoAddIconbutton();
        vehiclePage.gotoAddvehicle();
    }

    @When("User type vehicle new information")
    public void userTypeVehicleNewInformation() throws InterruptedException {
        Thread.sleep(4000);
        vehiclePage.enterVehicleId();
        vehiclePage.clickonBrand();
        vehiclePage.clickonVehicleProfile();
        vehiclePage.enterPlateNumber();
        vehiclePage.clickonColor();
        vehiclePage.clickonDriveName();
        vehiclePage.clickonShift();
    }

    @And("click on submit button vehicle to confirm")
    public void clickOnSubmitButtonVehicleToConfirm() throws InterruptedException {
        vehiclePage.submitNewVehicle();
        Thread.sleep(4000);
    }

    @Then("User should navigate to vehicle dashboard")
    public void userShouldNavigateToVehicleDashboard() {
        driver.navigate().refresh();
    }

    @Given("User select vehicle to update")
    public void userSelectVehicleToUpdate() {
    }

    @When("User update vehicle information")
    public void userUpdateVehicleInformation() {
    }

    @Then("User click on save vehicle update button")
    public void userClickOnSaveVehicleUpdateButton() {
    }

    @Given("User select vehicle to delete")
    public void userSelectVehicleToDelete() {
    }

    @When("User click the delete vehicle button")
    public void userClickTheDeleteVehicleButton() {
    }

    @Given("User go to vehicle menu")
    public void userGoToVehicleMenu() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
    }

    @When("User click on import vehicle list")
    public void userClickOnImportVehicleList() {

        vehiclePage.clickondragbutton();
        vehiclePage.SaveImport();
    }

    @Then("User add the vehicle list")
    public void userAddTheVehicleList() {
    }

    @When("User click on export vehicle button")
    public void userClickOnExportVehicleButton() {
    }
}

package steps;

import com.redsea.base.Base;
import com.redsea.pages.VehiclePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

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
    public void userTypeVehicleNewInformation(DataTable data) throws InterruptedException {
        Thread.sleep(4000);
        vehiclePage.enterVehicleId(data.cell(0, 0));
        vehiclePage.clickonBrand();
        vehiclePage.clickonVehicleProfile();
        vehiclePage.enterPlateNumber(data.cell(0, 1));
        vehiclePage.clickonColor();
        vehiclePage.clickonDriveName();
        vehiclePage.clickonShift();
        Thread.sleep(4000);
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
    public void userSelectVehicleToUpdate(DataTable data) throws InterruptedException {
        Thread.sleep(1000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
        Thread.sleep(1000);
        vehiclePage.clickonsearchbutton(data.cell(0, 0));
        vehiclePage.clickOnEditButton();
        Thread.sleep(1000);
    }

    @When("User update vehicle information")
    public void userUpdateVehicleInformation(DataTable data) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(" load vehicle to update");
        vehiclePage.enternewupdateforvehicle(data.cell(0, 0));
        Thread.sleep(1000);
    }

    @Then("User click on save vehicle update button")
    public void userClickOnSaveVehicleUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        vehiclePage.saveUpdateButton();
        Thread.sleep(1000);
    }

    @Given("User select vehicle to delete")
    public void userSelectVehicleToDelete(DataTable data) throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
        Thread.sleep(3000);
        vehiclePage.clickonsearchbuttonDelete(data.cell(0, 0));
    }

    @When("User click the delete vehicle button")
    public void userClickTheDeleteVehicleButton() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage.clickOnDeleteButton();
    }

    @Given("User go to vehicle menu")
    public void userGoToVehicleMenu() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
    }

    @When("User click on import vehicle list")
    public void userClickOnImportVehicleList() throws InterruptedException {
        System.out.println(" load Vehicle to import");
        Thread.sleep(1000);
        vehiclePage.importnewVehicle();
    }

    @Then("User add the vehicle list")
    public void userAddTheVehicleList() throws InterruptedException {
        vehiclePage.clickondragbutton();
        vehiclePage.SaveImport();
        Thread.sleep(4000);
    }

    @When("User click on export vehicle button")
    public void userClickOnExportVehicleButton() throws InterruptedException {
        Thread.sleep(1000);
        vehiclePage.clickonexportbutton();
        Thread.sleep(4000);
    }

    @Given("User go to add new vehicle")
    public void userGoToAddNewVehicle() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
        Thread.sleep(2000);
        vehiclePage.gotoAddIconbutton();
        vehiclePage.gotoAddvehicle();

    }

    @When("User click directly on submit vehicle button")
    public void userClickDirectlyOnSubmitVehicleButton() throws InterruptedException {
        vehiclePage.submitNewVehicle();
        Thread.sleep(2000);
    }

    @Then("Error messages should be displayed vehicle")
    public void errorMessagesShouldBeDisplayedVehicle() {
        String VehicleIdError = vehiclePage.getVehicleIdErrorMessage();
        Assert.assertEquals((VehicleIdError), "Vehicle Id is required");

        String brandError = vehiclePage.getbrandErrorMessage();
        Assert.assertEquals((brandError), "brand is required");

        String ProfileError = vehiclePage.getProfileErrorMessage();
        Assert.assertEquals((ProfileError), "Profile is required");

        String PlateError = vehiclePage.getPlateErrorMessage();
        Assert.assertEquals((PlateError), "Plate Number is required");

        String ColorError = vehiclePage.getColorErrorMessage();
        Assert.assertEquals((ColorError), "Color is required");

        String ShiftError = vehiclePage.getShiftErrorMessage();
        Assert.assertEquals((ShiftError), "Shift is required");
    }

    @And("User quit the add page vehicle")
    public void userQuitTheAddPageVehicle() throws InterruptedException {
        vehiclePage.cancelButton();
        Thread.sleep(2000);
    }


    @When("Add multiple vehicles")
    public void addMultipleVehicles(DataTable vehicleData) throws InterruptedException {
        List<Map<String, String>> vhc = vehicleData.asMaps(String.class, String.class);
        for (Map<String, String> vehicle : vhc) {
            vehiclePage.gotoAddIconbutton();
            vehiclePage.gotoAddvehicle();
            Thread.sleep(4000);
            vehiclePage.enterVehicleId(vehicle.get("vehicleID"));
            vehiclePage.clickonBrand();
            vehiclePage.clickonVehicleProfile();
            vehiclePage.enterPlateNumber(vehicle.get("plateNumber"));
            vehiclePage.clickonColor();
          //  vehiclePage.clickonDriveName();
            vehiclePage.clickonShift();
            Thread.sleep(2000);
            vehiclePage.submitNewVehicle();
            Thread.sleep(3000);
        }
        
    }

    @Then("select the vehicles added")
    public void selectTheVehiclesAdded() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage.clickonSelectAll();
        String MessagePop = vehiclePage.getSelectMessage();
        Assert.assertEquals((MessagePop), "5 vehicles selected");
        Thread.sleep(9000);
        
    }

    @And("Click on delete vehicles button")
    public void clickOnDeleteVehiclesButton() throws InterruptedException {

        Thread.sleep(3000);
        vehiclePage.clickOndeleteAll();
        vehiclePage.confirmdelete();
        Thread.sleep(3000);
    }
}

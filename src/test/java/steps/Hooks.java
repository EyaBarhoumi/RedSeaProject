package steps;


import com.redsea.base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
    @Before
    public void runsBeforeAnyScenario() {
        System.out.println("runs Before All the Scenarios ");
    }

    @After
    public void runsAfterAnyscenario() {
        System.out.println("runs after All the Scenarios");
       // driver.quit();
    }
}

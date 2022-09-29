package co.speedup.qa.stepdefinition;

import co.speedup.qa.model.HomeModel;
import co.speedup.qa.task.HomeTask;
import co.speedup.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class HomeStepDefinition {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setupOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Miguel Hugo");
    }
    @Given("^Go to the official website of the hotel$")
    public void goToTheOfficialWebsiteOfTheHotel() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());

    }


    @When("^we fill in the data required to search for the hotel$")
    public void weFillInTheDataRequiredToSearchForTheHotel(List<HomeModel> models) {
         OnStage.theActorInTheSpotlight().attemptsTo(HomeTask.withData(models.get(0)));
    }

    @Then("^we click on the search button to return the result$")
    public void weClickOnTheSearchButtonToReturnTheResult() {

    }
}

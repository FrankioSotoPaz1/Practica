package practice.choucair.certification.automationpractice.stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//import net.serenitybdd.screenplay.actors.OnStage;
//import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
//import practice.choucair.certification.automationpractice.userinterfaces.HomePage;


public class LoginStepDefinitions {

	
    @Managed(driver = "chrome")
    private WebDriver hisDriver;
    private Actor he = Actor.named("He");
    @Before
    public void setUp() {
    	he.can(BrowseTheWeb.with(hisDriver));
       // OnStage.setTheStage(new OnlineCast());
    }

    @Given("^He wants perform login$")
    public void openTheBrowser() {
      //  theActorCalled(USER).wasAbleTo(Open.browserOn(homePage));
    }

    @When("^He perform login$")
    public void userPerformLogin() {
        //theActorCalled(USER).attemptsTo(LoginDashboard.LoginDashboard());
    }

    @Then("^He should see the platform$")
    public void userShouldSeeTheDashboard() {
       // theActorCalled(USER).should(seeThat(InDashboard.name())
              //  .orComplainWith(BadCredentialsException.class, "Not found element"));
    }

}

package co.com.choucair.certification.jhonescudero.stepdefinitions;

import co.com.choucair.certification.jhonescudero.tasks.OpenUp;
import co.com.choucair.certification.jhonescudero.tasks.Login;

import co.com.choucair.certification.jhonescudero.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandom wants to learn automation at the academy Choucair$")
    public void thanBrandomWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("brandom").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseFoundationExpressOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the("Foundation Express"));

    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesFoundationExpress() {

    }

}

package co.com.choucair.certification.jhonescudero.stepdefinitions;

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

    }

    @When("^he search for the course Recursos Atomatizacion Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAtomatizacionBancolombiaOnTheChoucairAcademyPlatform() {

    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {

    }

}

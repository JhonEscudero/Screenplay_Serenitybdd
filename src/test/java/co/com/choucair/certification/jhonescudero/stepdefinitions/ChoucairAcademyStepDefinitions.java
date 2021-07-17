package co.com.choucair.certification.jhonescudero.stepdefinitions;

import co.com.choucair.certification.jhonescudero.model.AcademyChoucairData;
import co.com.choucair.certification.jhonescudero.questions.Answer;
import co.com.choucair.certification.jhonescudero.tasks.OpenUp;
import co.com.choucair.certification.jhonescudero.tasks.Login;

import co.com.choucair.certification.jhonescudero.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandom wants to learn automation at the academy Choucair$")
    public void thanBrandomWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorCalled("brandom").wasAbleTo(OpenUp.thePage(),
                (Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseISTQBAgileTesterExtensionOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesISTQBAgileTesterExtension(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

}

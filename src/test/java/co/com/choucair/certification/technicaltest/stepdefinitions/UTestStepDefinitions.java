package co.com.choucair.certification.technicaltest.stepdefinitions;

import co.com.choucair.certification.technicaltest.model.UTestData;
import co.com.choucair.certification.technicaltest.questions.Answer;
import co.com.choucair.certification.technicaltest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage((new OnlineCast()));}

    @Given("^than Fernando wants to create a user profile on uTest$")
    public void thanFernandoWantsToCreateAUserProfileOnUTest() {
        OnStage.theActorCalled("Fernando").wasAbleTo(OpenUp.thePage());
    }

    @When("^he search a Join Today button to initiate register's form$")
    public void heSearchAJoinTodayButtonToInitiateRegisterSForm(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                UserInformation.withPersonalData(uTestData),
                AddressInformation.withLocationData(uTestData),
                DeviceInformation.withMovileData(uTestData),
                FinishInformation.withPassword(uTestData));
    }

    @Then("^he sing in on uTest with his user$")
    public void heSingInOnUTestWithHisUser(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData)));
    }
}

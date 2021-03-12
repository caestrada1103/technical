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
                CompleteOne.FormData(
                        uTestData.get(0).getStrName(),
                        uTestData.get(0).getStrLastName(),
                        uTestData.get(0).getStrEmail(),
                        uTestData.get(0).getStrLanguage()
                ),CompleteTwo.FormData(
                        uTestData.get(0).getStrCity(),
                        uTestData.get(0).getStrZipCode(),
                        uTestData.get(0).getStrCountry()
                ),CompleteThree.FormData(
                        uTestData.get(0).getStrMobile()
                        ,uTestData.get(0).getStrModel(),
                        uTestData.get(0).getStrOperatingSystem()
                ),CompleteFinal.FormData(
                        uTestData.get(0).getStrPassword()
                )
        );
    }

    @Then("^he sing in on uTest with his user$")
    public void heSingInOnUTestWithHisUser(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrFinalConfirm())));
    }
}

package co.com.choucair.certification.technicaltest.tasks;

import co.com.choucair.certification.technicaltest.model.UTestData;
import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpStep1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class UserInformation implements Task {
    private final List <UTestData> uTestDataUser;

    public UserInformation(List <UTestData> uTestDataUser) {
        this.uTestDataUser = uTestDataUser;
    }

    public static UserInformation withPersonalData(List <UTestData> uTestDataUser) {
        return Tasks.instrumented(UserInformation.class,uTestDataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestDataUser.get(0).getStrName())
                        .into(CompleteSingUpStep1.INPUT_NAME),
                Enter.theValue(uTestDataUser.get(0).getStrLastName())
                        .into(CompleteSingUpStep1.INPUT_LASTNAME),
                Enter.theValue(uTestDataUser.get(0).getStrEmail())
                        .into(CompleteSingUpStep1.INPUT_EMAIL),
                Click.on(CompleteSingUpStep1.SELECT_MONTH),
                Click.on(CompleteSingUpStep1.INPUT_MONTH),
                Click.on(CompleteSingUpStep1.SELECT_DAY),
                Click.on(CompleteSingUpStep1.INPUT_DAY),
                Click.on(CompleteSingUpStep1.SELECT_YEAR),
                Click.on(CompleteSingUpStep1.INPUT_YEAR),
                Enter.theValue(uTestDataUser.get(0).getStrLanguage())
                        .into(CompleteSingUpStep1.INPUT_LANGUAGE),
                Click.on(CompleteSingUpStep1.SELECT_LANGUAGE),
                Click.on(CompleteSingUpStep1.NEXT_LOCATION_BTN));
    }
}

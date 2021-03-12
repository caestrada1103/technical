package co.com.choucair.certification.technicaltest.tasks;

import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpStep1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteOne implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strLanguage;

    public CompleteOne(String strName,String strLastName,String strEmail,
                    String strLanguage) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strLanguage = strLanguage;
    }

    public static CompleteOne FormData(String strName, String strLastName,String strEmail
                                ,String strLanguage) {
        return Tasks.instrumented(CompleteOne.class, strName,strLastName,strEmail,strLanguage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strName).into(CompleteSingUpStep1.INPUT_NAME),
                Enter.theValue(strLastName).into(CompleteSingUpStep1.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(CompleteSingUpStep1.INPUT_EMAIL),
                Click.on(CompleteSingUpStep1.SELECT_MONTH),
                Click.on(CompleteSingUpStep1.INPUT_MONTH),
                Click.on(CompleteSingUpStep1.SELECT_DAY),
                Click.on(CompleteSingUpStep1.INPUT_DAY),
                Click.on(CompleteSingUpStep1.SELECT_YEAR),
                Click.on(CompleteSingUpStep1.INPUT_YEAR),
                Enter.theValue(strLanguage).into(CompleteSingUpStep1.INPUT_LANGUAGE),
                Click.on(CompleteSingUpStep1.SELECT_LANGUAGE),
                Click.on(CompleteSingUpStep1.NEXT_LOCATION_BTN));
    }
}

package co.com.choucair.certification.technicaltest.tasks;

import co.com.choucair.certification.technicaltest.model.UTestData;
import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpFinalStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class FinishInformation implements Task {
    private final List<UTestData> uTestDataPassword;

    public FinishInformation(List<UTestData> uTestDataPassword) {
        this.uTestDataPassword = uTestDataPassword;
    }

    public static FinishInformation withPassword(List<UTestData> uTestDataPassword) {
        return Tasks.instrumented(FinishInformation.class, uTestDataPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompleteSingUpFinalStep.INPUT_PASSWORD),
                Enter.theValue(uTestDataPassword.get(0).getStrPassword())
                        .into(CompleteSingUpFinalStep.INPUT_PASSWORD),
                Click.on(CompleteSingUpFinalStep.INPUT_CONFIRM),
                Enter.theValue(uTestDataPassword.get(0).getStrPassword())
                        .into(CompleteSingUpFinalStep.INPUT_CONFIRM),
                Click.on(CompleteSingUpFinalStep.SELECT_TERMS),
                Click.on(CompleteSingUpFinalStep.SELECT_PRIVACY));
    }
}

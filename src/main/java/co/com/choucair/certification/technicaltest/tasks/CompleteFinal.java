package co.com.choucair.certification.technicaltest.tasks;

import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpFinalStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteFinal implements Task {
    public String strPassword;

    public CompleteFinal(String strPassword) {
        this.strPassword = strPassword;
    }

    public static CompleteFinal FormData(String strPassword) {
        return Tasks.instrumented(CompleteFinal.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompleteSingUpFinalStep.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(CompleteSingUpFinalStep.INPUT_PASSWORD),
                Click.on(CompleteSingUpFinalStep.INPUT_CONFIRM),
                Enter.theValue(strPassword).into(CompleteSingUpFinalStep.INPUT_CONFIRM),
                Click.on(CompleteSingUpFinalStep.SELECT_TERMS),
                Click.on(CompleteSingUpFinalStep.SELECT_PRIVACY));
    }
}

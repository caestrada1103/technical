package co.com.choucair.certification.technicaltest.tasks;

import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpStep3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class CompleteThree implements Task {
    public String strMobile;
    public String strModel;
    public String strOperatingSystem;

    public CompleteThree(String strMobile, String strModel, String strOpSystem) {
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOperatingSystem = strOpSystem;
    }

    public static CompleteThree FormData(String strMobile, String strModel, String strOperatingSystem) {
        return Tasks.instrumented(CompleteThree.class,strMobile,strModel,strOperatingSystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CompleteSingUpStep3.BUTTON_MOBILE),
                Enter.theValue(strMobile).into(CompleteSingUpStep3.INPUT_MOBILE),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep3.INPUT_MOBILE),
                Click.on(CompleteSingUpStep3.BUTTON_MODEL),
                Enter.theValue(strModel).into(CompleteSingUpStep3.INPUT_MODEL),
                Hit.the(Keys.ARROW_DOWN).into(CompleteSingUpStep3.INPUT_MODEL),
                Hit.the(Keys.ARROW_DOWN).into(CompleteSingUpStep3.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep3.INPUT_MODEL),
                Click.on(CompleteSingUpStep3.BUTTON_OPERATING_SYSTEM),
                Enter.theValue(strOperatingSystem).into(CompleteSingUpStep3.INPUT_OPERATING_SYSTEM),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep3.INPUT_OPERATING_SYSTEM),
                Click.on(CompleteSingUpStep3.NEXT_DEVICES_BTN));
    }
}

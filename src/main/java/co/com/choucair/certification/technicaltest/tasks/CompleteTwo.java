package co.com.choucair.certification.technicaltest.tasks;


import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpStep2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class CompleteTwo implements Task {
    private String strCity;
    private String strZipCode;
    private String strCountry;

    public CompleteTwo(String strCity, String strZipCode, String strCountry) {
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        this.strCountry = strCountry;
    }

    public static CompleteTwo FormData(String strCity,String strZipCode,String strCountry) {
        return Tasks.instrumented(CompleteTwo.class,strCity,strZipCode,strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(CompleteSingUpStep2.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(CompleteSingUpStep2.INPUT_CITY),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep2.INPUT_CITY),
                Enter.theValue(strZipCode).into(CompleteSingUpStep2.INPUT_ZIP),
                Click.on(CompleteSingUpStep2.BUTTON_COUNTRY),
                Enter.theValue(strCountry).into(CompleteSingUpStep2.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep2.INPUT_COUNTRY),
                Click.on(CompleteSingUpStep2.NEXT_DEVICES_BTN));
    }
}

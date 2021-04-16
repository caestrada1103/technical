package co.com.choucair.certification.technicaltest.tasks;


import co.com.choucair.certification.technicaltest.model.UTestData;
import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpStep2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class AddressInformation implements Task {
    private final List<UTestData> uTestDataLocation;

    public AddressInformation(List<UTestData> uTestDataLocation) {
        this.uTestDataLocation = uTestDataLocation;
    }

    public static AddressInformation withLocationData(List<UTestData> uTestDataLocation) {
        return Tasks.instrumented(AddressInformation.class,uTestDataLocation);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestDataLocation.get(0).getStrCity())
                        .into(CompleteSingUpStep2.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(CompleteSingUpStep2.INPUT_CITY),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep2.INPUT_CITY),
                Enter.theValue(uTestDataLocation.get(0).getStrZipCode())
                        .into(CompleteSingUpStep2.INPUT_ZIP),
                Click.on(CompleteSingUpStep2.BUTTON_COUNTRY),
                Enter.theValue(uTestDataLocation.get(0).getStrCountry())
                        .into(CompleteSingUpStep2.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep2.INPUT_COUNTRY),
                Click.on(CompleteSingUpStep2.NEXT_DEVICES_BTN));
    }
}

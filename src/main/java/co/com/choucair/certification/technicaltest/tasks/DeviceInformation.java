package co.com.choucair.certification.technicaltest.tasks;

import co.com.choucair.certification.technicaltest.model.UTestData;
import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpStep3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class DeviceInformation implements Task {
    private final List<UTestData> uTestDataMovile;

    public DeviceInformation(List<UTestData> uTestDataMovile) {
        this.uTestDataMovile = uTestDataMovile;
    }

    public static DeviceInformation withMovileData(List<UTestData> uTestDataMovile) {
        return Tasks.instrumented(DeviceInformation.class,uTestDataMovile);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CompleteSingUpStep3.BUTTON_MOBILE),
                Enter.theValue(uTestDataMovile.get(0).getStrMobile())
                        .into(CompleteSingUpStep3.INPUT_MOBILE),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep3.INPUT_MOBILE),
                Click.on(CompleteSingUpStep3.BUTTON_MODEL),
                Enter.theValue(uTestDataMovile.get(0).getStrModel())
                        .into(CompleteSingUpStep3.INPUT_MODEL),
                Hit.the(Keys.ARROW_DOWN).into(CompleteSingUpStep3.INPUT_MODEL),
                Hit.the(Keys.ARROW_DOWN).into(CompleteSingUpStep3.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep3.INPUT_MODEL),
                Click.on(CompleteSingUpStep3.BUTTON_OPERATING_SYSTEM),
                Enter.theValue(uTestDataMovile.get(0).getStrOperatingSystem())
                        .into(CompleteSingUpStep3.INPUT_OPERATING_SYSTEM),
                Hit.the(Keys.ENTER).into(CompleteSingUpStep3.INPUT_OPERATING_SYSTEM),
                Click.on(CompleteSingUpStep3.NEXT_DEVICES_BTN));
    }
}

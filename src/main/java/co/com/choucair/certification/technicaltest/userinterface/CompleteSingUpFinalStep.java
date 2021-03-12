package co.com.choucair.certification.technicaltest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CompleteSingUpFinalStep {
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the name")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM = Target.the("Where do we write the name")
            .located(By.id("confirmPassword"));
    public static final Target SELECT_TERMS = Target.the("Where do we write the name")
            .located(By.id("termOfUse"));
    public static final Target SELECT_PRIVACY = Target.the("Where do we write the name")
            .located(By.id("privacySetting"));
    public static final Target CONFIRM_LAST_STEP = Target.the("Where do we write the name")
            .located(new By.ByButtonTextSelector("Complete Setup"));
}

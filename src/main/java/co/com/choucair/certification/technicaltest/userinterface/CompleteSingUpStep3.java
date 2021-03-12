package co.com.choucair.certification.technicaltest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CompleteSingUpStep3 {
    public static final Target BUTTON_MOBILE = Target.the("Button to open a search of mobile")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE = Target.the("Where do we write the mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target BUTTON_MODEL = Target.the("Button to open a search of model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("Where do we write the model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target BUTTON_OPERATING_SYSTEM = Target.the("Button to open a search of operating system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("Where do we write the operating system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target NEXT_DEVICES_BTN = Target.the("Button to continue to next step devices")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));
}

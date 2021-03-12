package co.com.choucair.certification.technicaltest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CompleteSingUpStep2 {
    public static final Target INPUT_CITY = Target.the("Where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Where do we write the zip code")
            .located(By.id("zip"));
    public static final Target BUTTON_COUNTRY = Target.the("Where select country button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_COUNTRY = Target.the("Where do we write the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES_BTN = Target.the("Button to continue to next step devices")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}

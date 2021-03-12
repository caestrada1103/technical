package co.com.choucair.certification.technicaltest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CompleteSingUpStep1{
    public static final Target INPUT_NAME = Target.the("Where do we write the name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Where do we write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Button to show up all month option")
            .located(By.id("birthMonth"));
    public static final Target INPUT_MONTH = Target.the("Where do we select the month")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select/option[8]"));
    public static final Target SELECT_DAY = Target.the("Button to show up all days option")
            .located(By.id("birthDay"));
    public static final Target INPUT_DAY = Target.the("Where do we select the day")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select/option[21]"));
    public static final Target SELECT_YEAR = Target.the("Button to show up all year option")
            .located(By.id("birthYear"));
    public static final Target INPUT_YEAR = Target.the("Where do we select the year")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select/option[24]"));
    public static final Target INPUT_LANGUAGE = Target.the("Where do we write the language")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));
    public static final Target SELECT_LANGUAGE = Target.the("Where do we select the language")
            .located(By.id("ui-select-choices-row-0-0"));
    public static final Target NEXT_LOCATION_BTN = Target.the("Button to continue to next step location")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
}

package co.com.choucair.certification.technicaltest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class UTestPage extends PageObject {
    public static final Target JOIN_TODAY_BTN = Target.the("Button to show up sing up form")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
}

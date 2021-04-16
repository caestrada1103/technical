package co.com.choucair.certification.technicaltest.questions;

import co.com.choucair.certification.technicaltest.model.UTestData;
import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpFinalStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {
    private final List<UTestData> uTestDataValidate;

    public Answer(List<UTestData> uTestDataValidate) {
        this.uTestDataValidate = uTestDataValidate;
    }

    public static Answer toThe(List<UTestData> uTestDataValidate) {
        return new Answer(uTestDataValidate);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String nameSingIn = Text.of(CompleteSingUpFinalStep.CONFIRM_LAST_STEP).viewedBy(actor).asString();
        return uTestDataValidate.get(0).getStrFinalConfirm().equals(nameSingIn);
    }
}

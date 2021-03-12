package co.com.choucair.certification.technicaltest.questions;

import co.com.choucair.certification.technicaltest.userinterface.CompleteSingUpFinalStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameSingIn = Text.of(CompleteSingUpFinalStep.CONFIRM_LAST_STEP).viewedBy(actor).asString();
        if (question.equals(nameSingIn)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}

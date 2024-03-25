package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.userintrfaces.EchoView;

public class EchoQuestion implements Question {

  @Override
  public Object answeredBy(Actor actor) {
    return EchoView.messageTextView.resolveFor(actor).getText();
  }

  public static Question<String> value(){
    return new EchoQuestion();
  }
}

package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.userintrfaces.EchoView;

public class EchoMessage implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SendKeys.of("Hello, world!").into(EchoView.saySomething),
        Click.on(EchoView.saveButton)
    );
  }
}

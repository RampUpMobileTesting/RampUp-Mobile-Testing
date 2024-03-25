package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.questions.EchoQuestion;
import starter.tasks.EchoMessage;
import starter.tasks.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class EchoStepDefinition {

  @Managed(driver = "Appium")
  public WebDriver hisMobileDevice;


  @Before
  public void set_the_stage(){
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("User wants to write a new message")
  public void userWantsToWriteANewMessage() {
    theActorCalled("Pedro").attemptsTo(new NavigateTo());
  }
  @When("he sends his message")
  public void heSendsHisMessage() {

    theActorInTheSpotlight().attemptsTo(new EchoMessage());
  }
  @Then("he should see the message on the screen")
  public void heShouldSeeTheMessageOnTheScreen() {

    String expectedMessage = "Hello, world!";

    theActorInTheSpotlight().should(
        seeThat("The Message", EchoQuestion.value(), equalTo(expectedMessage))
    );
  }

}

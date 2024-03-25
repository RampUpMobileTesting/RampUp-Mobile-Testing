package starter.userintrfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

  public static Target echolink = Target
      .the("Echo Link")
      .located(By.xpath("//android.widget.TextView[@text=\"Echo Box\"]"));
}

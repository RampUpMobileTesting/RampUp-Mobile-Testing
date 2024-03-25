package starter.userintrfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EchoView {

    public static Target saySomething = Target
        .the("Say something input")
        .located(AppiumBy.accessibilityId("messageInput"));

    public static Target saveButton = Target
        .the("Save button")
        .located(AppiumBy.className("android.widget.TextView"));


    public static Target messageTextView = Target
        .the("Message text view")
        .located(By.xpath("//android.widget.TextView[2]"));
}

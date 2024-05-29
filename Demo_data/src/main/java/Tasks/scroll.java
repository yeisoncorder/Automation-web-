package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.DemoInterface;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static org.springframework.util.ClassUtils.isVisible;

public class scroll implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoInterface.Bajar, isVisible()),
                Scroll.to(DemoInterface.Bajar),
                Delayxd.ofMilliseconds(1000)
        );
    }

    public static scroll in(){
        return new scroll ();
    }


}

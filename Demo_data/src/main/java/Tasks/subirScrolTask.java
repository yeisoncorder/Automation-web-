package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.DemoInterface;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class subirScrolTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(
                  WaitUntil.the(DemoInterface.SUBIR, isVisible()),
                  Scroll.to(DemoInterface.SUBIR),
                  Delayxd.ofMilliseconds(2000)
          );
    }
    public static subirScrolTask in(){
        return new subirScrolTask ();
    }

}

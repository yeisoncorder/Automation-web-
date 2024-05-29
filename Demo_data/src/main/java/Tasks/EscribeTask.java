package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;
import userinterfaces.DemoInterface;
import userinterfaces.firsOpcionDataFace;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static org.springframework.util.ClassUtils.isVisible;

public class EscribeTask implements Task {

    private String searh;



    public EscribeTask(String searh){

        this.searh = searh;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoInterface.CLICKSEARCH, isVisible()),
                Enter.theValue(searh).into(DemoInterface.CLICKSEARCH),
                Click.on(firsOpcionDataFace.CLICKDATA),
                Delayxd.ofMilliseconds(3000)

        );
    }
    public static EscribeTask in(String searh){
        return new EscribeTask(searh);
    }


}

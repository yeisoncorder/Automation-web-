package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.DemoInterface;
import userinterfaces.firsOpcionDataFace;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ingresoPageTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(firsOpcionDataFace.CLiCKLINK),
                Delayxd.ofMilliseconds(3000)
        );
    }

    public static ingresoPageTask on(){

        return instrumented(ingresoPageTask.class);
    }

}


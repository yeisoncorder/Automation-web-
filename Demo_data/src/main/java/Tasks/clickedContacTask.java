package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.DemoInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class clickedContacTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DemoInterface.CLICKEDSUBIR),
                Delayxd.ofMilliseconds(1000)
        );

    }
    public static clickedContacTask on(){
        return instrumented(clickedContacTask.class);
    }

}

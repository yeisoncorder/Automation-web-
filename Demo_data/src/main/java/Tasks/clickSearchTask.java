package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Step;
import userinterfaces.DemoInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import static net.serenitybdd.screenplay.Tasks.instrumented;

    public class clickSearchTask implements Task {

        @Override
        @Step("open google")
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Delayxd.ofMilliseconds(1000),
                    Open.browserOn(new DemoInterface())
            );
        }

        public static clickSearchTask on(){
            return instrumented(clickSearchTask.class);
        }
    }





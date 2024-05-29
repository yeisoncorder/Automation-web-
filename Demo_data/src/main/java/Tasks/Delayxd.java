package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Delayxd implements Task {

    private final long milliseconds;

    public Delayxd(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Delayxd ofMilliseconds(long milliseconds) {
        return instrumented(Delayxd.class, milliseconds);
    }
}

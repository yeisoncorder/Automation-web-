package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.google.com/?hl=es")
public class DemoInterface extends PageObject{
    public static Target CLICKSEARCH = Target.the("titulo de sungas").
            locatedBy("//textarea[@id='APjFqb']");


    public static Target Bajar = Target.the("Scroll hacia abajo").
            locatedBy("//strong[contains(text(), 'Contacto')]");

    public static Target direccionExacta = Target.the("Direccion de Data").
            locatedBy("//strong[contains(text(), 'Centro Empresarial Elemento')]");


    public static Target SUBIR = Target.the("Scroll hacia arriba").
            locatedBy("//span[contains(text(), 'Contacto')]");

    public static Target CLICKEDSUBIR = Target.the("Clicked en contacto").
            locatedBy("//span[contains(text(), 'Contacto')]");


}





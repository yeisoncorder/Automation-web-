package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class firsOpcionDataFace {
    public static Target CLICKDATA= Target.the("titulo de OTRASsungas").
            locatedBy("//span[contains(text() ,  'Datacenter Colombia Sas' )]");



    public static Target CLiCKLINK= Target.the("titulo DATACENTER").
            locatedBy("//h3[contains(text(), 'Datacenter Colombia')]");

}//strong[contains(text(), 'Centro Empresarial Elemento')]

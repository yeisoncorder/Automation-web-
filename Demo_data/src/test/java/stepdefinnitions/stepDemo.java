package stepdefinnitions;

import Questions.demoQuestion;
import Tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.Delayed;

import static io.vavr.Predicates.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class stepDemo {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }



    @Given("^El usuario abre google chrome$")
    public void elUsuarioAbreGoogleChrome() {
            user.attemptsTo(
                    clickSearchTask.on()
            );
    }

    @When("^El usuario busca la empresa datacenter en el deveganor de chrome \"([^\"]*)\"$")
    public void elUsuarioBuscaLaEmpresaDatacenterEnElDeveganorDeChrome(String searh) {

        user.attemptsTo(
                EscribeTask.in(searh)
        );

    }

    @When("^El usuario selecciona la pagina de datacenter colombia SAS$")
    public void elUsuarioSeleccionaLaPaginaDeDatacenterColombiaSAS() {
        user.attemptsTo(
                ingresoPageTask.on()
        );
    }

    @When("^El usuario busca donde esta ubicada la empresa en la pagina$")
    public void elUsuarioBuscaDondeEstaUbicadaLaEmpresaEnLaPagina() {
        user.attemptsTo(
                scroll.in()
        );
    }





    @When("^El usuario hace scroll hacia arriba$")
    public void elUsuarioHaceScrollHaciaArriba() {
       user.attemptsTo(
               subirScrolTask.in()
       );

    }

    @When("^El usuario da clicked sobre Contactanos$")
    public void elUsuarioDaClickedSobreContactanos() {
       user.attemptsTo(
               clickedContacTask.on()
       );

    }

    @Then("^El usuario deberia ver la ubicacion en un mapa$")
    public void elUsuarioDeberiaVerLaUbicacionEnUnMapa() {
        user.should(
                seeThat("La ubicacion esta visible",
                        demoQuestion.ubi(),
                        is(true))
        );

    }


}

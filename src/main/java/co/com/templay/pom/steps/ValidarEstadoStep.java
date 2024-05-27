package co.com.templay.pom.steps;

import co.com.templay.pom.pages.MenuPrincipalPage;
import co.com.templay.pom.pages.ValidarEstadoCandidatoPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertTrue;


public class ValidarEstadoStep {
    ValidarEstadoCandidatoPage validarEstadoCandidatoPage = new ValidarEstadoCandidatoPage();
    MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();

    @Step
    public void validarEstadoCandidato(String estado){
        validarEstadoCandidatoPage.getDriver().findElement(MenuPrincipalPage.getLblRecruitment()).click();
        String nombre = Serenity.sessionVariableCalled("nombre");
        String apellido = Serenity.sessionVariableCalled("apellido");
        ValidarEstadoCandidatoPage.setEstadoCandidato(nombre + "  " + apellido);
        try {
            Thread.sleep(4 * 1_000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        boolean estadoCandidato = validarEstadoCandidatoPage.getDriver().findElement(ValidarEstadoCandidatoPage.getEstadoCandidato()).isEnabled();
        assertTrue("El estado es ", estadoCandidato);
    }
}

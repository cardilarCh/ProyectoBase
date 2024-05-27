package co.com.templay.pom.stepdefinitions;

import co.com.templay.pom.steps.FormularioRecruitmentStep;
import co.com.templay.pom.steps.LoginSteps;
import co.com.templay.pom.steps.MenuPrincipalStep;
import co.com.templay.pom.steps.ValidarEstadoStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private MenuPrincipalStep menuPrincipalStep;
    @Steps
    private FormularioRecruitmentStep formularioRecruitment;
    @Steps
    private ValidarEstadoStep validarEstadoStep;
    @Dado("El usuario ingresa a la pagina Web e ingresa sus credenciales")
    public void ingresaSusCredenciales(DataTable dataTable) {
        loginSteps.inicioDeSesion(dataTable.row(0).get(0), dataTable.row(0).get(1));


    }
    @Cuando("^ingresar al menu de (.+)$")
    public void ingresarAlMenuDeRecruitment(String opcion) {
        menuPrincipalStep.ingresarAOpcionDeMenuPrincipal(opcion);
    }
    @Cuando("agrega la informacion de la persona")
    public void agregaNuevoReclutado() {
        formularioRecruitment.diligenciarFormulario();
    }
    @Entonces("^valido su estado (.+)$")
    public void validoSuEstadoEstado(String estado) {
        validarEstadoStep.validarEstadoCandidato(estado);
    }

}

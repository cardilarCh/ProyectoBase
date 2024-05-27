package co.com.templay.pom.steps;

import co.com.templay.pom.pages.FormularioRecruitmentPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class FormularioRecruitmentStep {

    FormularioRecruitmentPage formularioRecruitmentPage = new FormularioRecruitmentPage();

    @Step
    public void diligenciarFormulario() {
        formularioRecruitmentPage.getDriver().findElement(FormularioRecruitmentPage.getBtnAgregarCandidato()).click();
        formularioRecruitmentPage.getDriver().findElement(FormularioRecruitmentPage.getInputNombreCandidato()).isEnabled();
        formularioRecruitmentPage.getDriver().findElement(FormularioRecruitmentPage.getInputNombreCandidato()).sendKeys("Cesar");
        Serenity.setSessionVariable("nombre").to("Cesar");
        formularioRecruitmentPage.getDriver().findElement(FormularioRecruitmentPage.getInputApellidoCandidato()).sendKeys("Ardila");
        Serenity.setSessionVariable("apellido").to("Ardila");
        formularioRecruitmentPage.getDriver().findElement(FormularioRecruitmentPage.getSelectOcupacion()).sendKeys("Junior Account Assistant");
        formularioRecruitmentPage.getDriver().findElement(FormularioRecruitmentPage.getInputCorreo()).sendKeys("cardilar@choucairtesting.com");
        formularioRecruitmentPage.getDriver().findElement(FormularioRecruitmentPage.getInputNumeroDeContacto()).sendKeys("3129872421");
        formularioRecruitmentPage.getDriver().findElement(FormularioRecruitmentPage.getBtnGuardar()).click();
    }
}

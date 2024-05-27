package co.com.templay.pom.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormularioRecruitmentPage extends PageObject {

    @Getter
    private static final By btnAgregarCandidato = By.xpath("//button[@type='button' and contains(@class,'oxd-button')]");
    @Getter
    private static final By inputNombreCandidato = By.name("firstName");
    @Getter
    private static final By inputSegundoNombreCandidato = By.name("middleName");
    @Getter
    private static final By inputApellidoCandidato = By.name("lastName");
    @Getter
    private static final By selectOcupacion = By.xpath("//div[@class ='oxd-select-text-input']");
    @Getter
    private static final By inputCorreo = By.xpath("//label[contains(text(),'Email')]//following::input[1]");
    @Getter
    private static final By inputNumeroDeContacto = By.xpath("//label[contains(text(),'Contact Number')]//following::input[1]");
    @Getter
    private static final By btnGuardar = By.xpath("//button[contains(@type,'submit')]");


}

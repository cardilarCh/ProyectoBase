package co.com.templay.pom.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarEstadoCandidatoPage extends PageObject {

    private static By estadoCandidato = By.xpath("//div[contains(text(),'REEMPLAZAR')]//following::div[6]");


    public static By getEstadoCandidato() {
        return estadoCandidato;
    }

    public static void setEstadoCandidato(String estadoCandidato) {
        ValidarEstadoCandidatoPage.estadoCandidato = By.xpath("//div[contains(text(),'REEMPLAZAR')]".
                replace("REEMPLAZAR",estadoCandidato));
    }
}

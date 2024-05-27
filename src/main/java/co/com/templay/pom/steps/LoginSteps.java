package co.com.templay.pom.steps;

import co.com.templay.pom.pages.LoginPage;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
@Slf4j
public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Step
    public void abrirPaginaWeb(String url) throws InterruptedException {
        loginPage.abrirPaginaConURL(url);
    }

    @Step
    public void  inicioDeSesion (String usuario, String clave){

        log.info("Escribir usuario: {}", usuario);
        loginPage.getDriver().findElement(LoginPage.getInputUsurio()).sendKeys(usuario);
        Serenity.setSessionVariable("usuario").to(usuario);

        loginPage.getDriver().findElement(LoginPage.getInputClave()).sendKeys(clave);
        log.info("Escribir clave: {}", clave);

        loginPage.getDriver().findElement(LoginPage.getBtnLogin()).click();

    }
    

}

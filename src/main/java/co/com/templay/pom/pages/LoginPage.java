package co.com.templay.pom.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    @Getter  private static By inputUsurio = By.name("username");
    @Getter private static By inputClave =By.name("password");
    @Getter private static By btnLogin = By.xpath("//button[@type='submit']");


    public void abrirPaginaConURL(String url) {
        getDriver().get(url);
    }

}

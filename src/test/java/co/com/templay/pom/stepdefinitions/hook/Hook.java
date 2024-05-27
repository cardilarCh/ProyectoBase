package co.com.templay.pom.stepdefinitions.hook;

import co.com.templay.pom.pages.LoginPage;
import co.com.templay.pom.steps.LoginSteps;
import io.cucumber.java.Before;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;

public class Hook {
     LoginSteps loginSteps = new LoginSteps();
    private EnvironmentVariables environmentVariables;
    @Before
    public void configureBaseUrl() throws InterruptedException {
        String baseUrl = environmentVariables.optionalProperty("environments.qa.base.url").get();
        loginSteps.abrirPaginaWeb(baseUrl);

    }
}

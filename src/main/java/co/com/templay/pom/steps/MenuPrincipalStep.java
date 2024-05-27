package co.com.templay.pom.steps;

import co.com.templay.pom.pages.MenuPrincipalPage;
import net.thucydides.core.annotations.Step;

public class MenuPrincipalStep {
    MenuPrincipalPage menuPrincipalPage = new MenuPrincipalPage();

    @Step
    public void  ingresarAOpcionDeMenuPrincipal (String opcion){
        MenuPrincipalPage.setLblRecruitment(opcion);
        menuPrincipalPage.getDriver().findElement(MenuPrincipalPage.getLblRecruitment()).click();

    }
}

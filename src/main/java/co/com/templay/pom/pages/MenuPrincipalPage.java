package co.com.templay.pom.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MenuPrincipalPage extends PageObject {



    private static By lblRecruitment = By.xpath("//a[contains(@href,'REEMPLAZAR')]");

    public static By getLblRecruitment() {
        return lblRecruitment;
    }

    public static void setLblRecruitment(String opcion) {
        MenuPrincipalPage.lblRecruitment = By.xpath("//a[contains(@href,'REEMPLAZAR')]".replace("REEMPLAZAR",opcion));
    }

}

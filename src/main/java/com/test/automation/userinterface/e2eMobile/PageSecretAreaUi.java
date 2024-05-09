package com.test.automation.userinterface.e2eMobile;

import net.serenitybdd.screenplay.targets.Target;

public class PageSecretAreaUi {
    private PageSecretAreaUi() {
    }
    public static final Target LABEL_SECRET_AREA = Target.the("TITULO PAGINA SECRET AREA").locatedBy("//*[@text='Secret Area']");
    public static final Target BUTTON_LOGOUT = Target.the("BOTON DE LOGOUT").locatedBy("//*[@text='Logout']");

}


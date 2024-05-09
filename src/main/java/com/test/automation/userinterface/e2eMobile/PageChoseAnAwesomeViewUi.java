package com.test.automation.userinterface.e2eMobile;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class PageChoseAnAwesomeViewUi {
    private PageChoseAnAwesomeViewUi() {
    }

    public static final Target LABEL_TEXT_THEAPP = Target.the("TITULO DE LA APLICACION").locatedBy("//*[@text='The App']");
    public static final Target LABEL_TEXT_CHOOSE = Target.the("SUBTITULO DE LA APP").locatedBy("//*[@text='Choose An Awesome View']");
    public static final Target BUTTON_LOGIN_SCREEN = Target.the("BOTON LOGIN SCREEN").locatedBy("//android.view.ViewGroup[@content-desc='Login Screen']");

}

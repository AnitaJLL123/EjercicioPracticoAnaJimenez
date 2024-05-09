package com.test.automation.userinterface.e2eMobile;

import net.serenitybdd.screenplay.targets.Target;

public class PageLoginUi {
    private PageLoginUi() {
    }
    public static final Target LABEL_LOGIN = Target.the("TITULO PAGINA LOGIN").locatedBy("(//*[@text='Login'])[1]");
    public static final Target INPUT_TEXT_USERNAME = Target.the("CAMPO DE USERNAME").locatedBy("//android.widget.EditText[@content-desc='username']");
    public static final Target INPUT_TEXT_PASSSWORD = Target.the("CAMPO DE PASSWORD").locatedBy("//android.widget.EditText[@content-desc='password']");
    public static final Target BUTTON_LOGIN = Target.the("BOTON DE LOGIN").locatedBy("//android.view.ViewGroup[@content-desc='loginBtn']/android.widget.TextView");

}

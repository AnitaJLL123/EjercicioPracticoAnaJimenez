package com.test.automation.userinterface.e2eMobile;

import net.serenitybdd.screenplay.targets.Target;

public class PageClipBoardTextoUi {
    private PageClipBoardTextoUi() {
    }
    public static final Target INPUT_TEXT_CLIPBOARD = Target.the("CAMPO DE TEXTO").locatedBy("//android.widget.EditText[@content-desc='messageInput']");
    public static final Target BUTTON_SET_CLIPBOARD = Target.the("BOTON SET CLIPBOARD").locatedBy("//android.view.ViewGroup[@content-desc='setClipboardText']/android.widget.TextView");
    public static final Target BUTTON_REFRESH_CLIPBOARD = Target.the("BOTON REFRESH CLIPBOARD").locatedBy("//android.view.ViewGroup[@content-desc='refreshClipboardText']/android.widget.TextView");

}

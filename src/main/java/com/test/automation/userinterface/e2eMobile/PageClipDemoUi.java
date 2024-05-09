package com.test.automation.userinterface.e2eMobile;

import net.serenitybdd.screenplay.targets.Target;

public class PageClipDemoUi {
    private PageClipDemoUi() {
    }
    public static final Target BUTTON_CLIPBOARD_DEMO = Target.the("BOTON CLIPBOARD_DEMO").locatedBy("//android.view.ViewGroup[@content-desc='Clipboard Demo']");

}

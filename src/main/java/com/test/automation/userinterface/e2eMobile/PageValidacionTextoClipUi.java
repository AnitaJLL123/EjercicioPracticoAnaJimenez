package com.test.automation.userinterface.e2eMobile;

import net.serenitybdd.screenplay.targets.Target;

public class PageValidacionTextoClipUi {
    private PageValidacionTextoClipUi() {
    }
    public static final Target LABEL_NOMBRE = Target.the("LABEL NOMBRE").locatedBy("//android.widget.TextView[@content-desc='Consubanco']");

}

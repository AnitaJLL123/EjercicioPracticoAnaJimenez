package com.test.automation.userinterface.e2eMobile;

import net.serenitybdd.screenplay.targets.Target;

public class PageListDemoUi {
    private PageListDemoUi() {
    }
    public static final Target BUTTON_LIST_DEMO = Target.the("BOTON LIST DEMO").locatedBy("//android.view.ViewGroup[@content-desc='List Demo']");
    public static final Target BUTTON_FOG = Target.the("BOTON FOG").locatedBy("//android.view.ViewGroup[@content-desc='Fog']");
    public static final Target BUTTON_LEARN_MORE_ABOUT_FOG = Target.the("BOTON LEARN MORE ABOUT FOG").locatedBy("//*[@text='LEARN MORE ABOUT FOG']");

}

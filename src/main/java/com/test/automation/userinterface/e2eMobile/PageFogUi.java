package com.test.automation.userinterface.e2eMobile;

import net.serenitybdd.screenplay.targets.Target;

public class PageFogUi {
    private PageFogUi() {
    }
    public static final Target LABEL_FOG = Target.the("LABEL FOG").locatedBy("//*[@text='Fog']");

    public static final Target BUTTON_OK = Target.the("LABEL FOG").locatedBy("//*[@text='OK']");


}

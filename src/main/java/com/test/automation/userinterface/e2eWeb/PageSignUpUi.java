package com.test.automation.userinterface.e2eWeb;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("page:webdriver.base.url.demoblaze1")
public class PageSignUpUi extends PageObject {
    public static final Target LABEL_SINGUP = Target.the("Label Sing up").locatedBy("#signin2");
    public static final Target INPUT_USERNAME = Target.the("Campo username").locatedBy("#sign-username");
    public static final Target INPUT_PASSWORD = Target.the("Campo password").locatedBy("#sign-password");
    public static final Target BUTTON_SINGUP = Target.the("Boton sing up").locatedBy("//button[contains(.,'Sign up')]");
    public static final Target BUTTON_CLOSE = Target.the("Boton close").locatedBy("(//button[contains(.,'Close')])[2]");
    public static final Target LABEL_MENSAJE = Target.the("Mensaje").locatedBy("//a[contains(.,'PRODUCT STORE')]");
}

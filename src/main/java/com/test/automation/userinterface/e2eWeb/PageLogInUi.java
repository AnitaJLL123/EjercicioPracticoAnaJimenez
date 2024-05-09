package com.test.automation.userinterface.e2eWeb;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageLogInUi extends PageObject {
    public static final Target LABEL_LOGIN = Target.the("Label Log in").locatedBy("#login2");
    public static final Target INPUT_LOGINUSERNAME = Target.the("Campo username").locatedBy("#loginusername");
    public static final Target INPUT_LOGINPASSWORD = Target.the("Campo password").locatedBy("#loginpassword");
    public static final Target BUTTON_LOGIN = Target.the("Boton Log in").locatedBy("//button[contains(.,'Log in')]");
    public static final Target LABEL_MENSAJEWELCOME = Target.the("Mensaje de Bienvenida").locatedBy("//a[contains(.,'Welcome anitaj1234')]");

}

package com.test.automation.userinterface.e2eWeb;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageProductoUi extends PageObject {
    public static final Target LABEL_CATEGORIA = Target.the("Campo de categoria de producto").locatedBy("//a[contains(.,'{0}')]");
    public static final Target LABEL_PRODUCTO = Target.the("Campo de producto").locatedBy("//a[contains(.,'{0}')]");
    public static final Target LABEL_PRODUCTO_PROD = Target.the("Campo de producto").locatedBy("//h2[contains(.,'{0}')]");
    public static final Target LABEL_PRODUCTODESCRIPCION = Target.the("Campo de producto descripcion").locatedBy("//strong[contains(.,'Product description')]");
    public static final Target BUTTON_ADDTOCART = Target.the("Botón add to cart").locatedBy("//a[contains(.,'Add to cart')]");
    public static final Target LABEL_CART = Target.the("Menu Cart").locatedBy("//a[contains(.,'Cart')]");
    public static final Target LABEL_PRODUCTOCART = Target.the("Menu Cart").locatedBy("//td[contains(.,'{0}')]");
    public static final Target LABEL_DELETE = Target.the("Label delete").locatedBy("//a[contains(.,'Delete')]");
    public static final Target BUTTON_LOGOUT = Target.the("Boton Logout").locatedBy("#logout2");

}

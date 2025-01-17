package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static Target MENSAJE_ORDEN = Target.the("mensaje con la orden confirmada")
            .located(By.xpath("//b[normalize-space()='Order Placed!']"));
}

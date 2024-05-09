package com.test.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.core.Serenity.getDriver;

public class QuesGetCurrentUrl implements Question<String> {

    public static QuesGetCurrentUrl fromBrowser() {
        return new QuesGetCurrentUrl();
    }

    @Override
    public String answeredBy(Actor actor) {
        return getDriver().getCurrentUrl();
    }
}
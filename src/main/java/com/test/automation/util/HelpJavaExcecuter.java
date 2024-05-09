package com.test.automation.util;

import org.openqa.selenium.JavascriptExecutor;

public class HelpJavaExcecuter {
    JavascriptExecutor javascriptExecutor;
    public HelpJavaExcecuter() {
        throw new UnsupportedOperationException();
    }

    public static void sleepSeconds (int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

package com.mocion.web.factory;

import com.microsoft.playwright.*;

import java.util.List;

public class PlaywrightFactory {
    private Playwright playwright;
    private Browser browser;

    public void initBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setArgs(List.of("--start-maximized"))
                .setSlowMo(2000)
        );
    }

    public Page newPage() {
        BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                .setViewportSize(null)
        );
        return context.newPage();
    }

    public void tearDown() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}

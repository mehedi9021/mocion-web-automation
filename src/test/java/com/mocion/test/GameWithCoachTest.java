package com.mocion.test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import com.mocion.web.pages.GameWithCoachPage;
import com.mocion.web.pages.LocationPage;
import com.mocion.web.pages.LoginPage;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class GameWithCoachTest extends BaseTest {
    public LoginPage loginPage;
    public LocationPage locationPage;
    public GameWithCoachPage gameWithCoachPage;

    private static final String CLUB_NAME = "Farah123";

    public void initPages() {
        loginPage = new LoginPage(page);
        locationPage = new LocationPage(page);
        gameWithCoachPage = new GameWithCoachPage(page);
    }

    @Test(description = "Cancel booking with refund should successful")
    public void verify_cancel_booking_with_refund_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        gameWithCoachPage
                .clickCoachingFromNavigationBar()
                .clickGameWithCoachFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickCancelBooking()
                .clickCancelWithRefundButton();

        gameWithCoachPage
                .bookingCancelSuccessMessageLocator()
                .waitFor(new Locator.WaitForOptions()
                        .setState(WaitForSelectorState.VISIBLE));
        assertThat(gameWithCoachPage.bookingCancelSuccessMessageLocator()).isVisible();
    }
}

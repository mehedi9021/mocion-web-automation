package com.mocion.test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import com.mocion.web.pages.CoachingPage;
import com.mocion.web.pages.LocationPage;
import com.mocion.web.pages.LoginPage;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CoachingTest extends BaseTest {
    public LoginPage loginPage;
    public LocationPage locationPage;
    public CoachingPage coachingPage;

    private static final String CLUB_NAME = "Farah123";
    private static final String TOTAL_MATCH_PRICE = "10";
    private static final String MIN_PLAYER_LEVEL = "0";
    private static final String MAX_PLAYER_LEVEL = "5";
    private static final String NOTES = "test_notes";

    public void initPages() {
        loginPage = new LoginPage(page);
        locationPage = new LocationPage(page);
        coachingPage = new CoachingPage(page);
    }

    @Test(description = "Game with the coach create with player payment cash should successful")
    public void verify_game_with_the_coach_create_with_player_payment_cash_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        coachingPage
                .clickCoachingFromNavigationBar()
                .clickGameWithCoachFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .selectCoachName()
                .fillTotalMatchPrice(TOTAL_MATCH_PRICE)
                .clickCheckScheduleButton()
                .selectSchedule()
                .clickSaveButton()
                .selectCourtName()
                .selectLevellingSessionOn()
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .selectGenderBoth()
                .fillNotes(NOTES)
                .selectPlayerOneName()
                .selectPaymentMethodCash()
                .clickBookNowButton();
    }

    @Test(description = "Cancel booking with refund should successful")
    public void verify_cancel_booking_with_refund_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        coachingPage
                .clickCoachingFromNavigationBar()
                .clickGameWithCoachFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickCancelBooking()
                .clickCancelWithRefundButton();

        coachingPage
                .bookingCancelSuccessMessageLocator()
                .waitFor(new Locator.WaitForOptions()
                        .setState(WaitForSelectorState.VISIBLE));
        assertThat(coachingPage.bookingCancelSuccessMessageLocator()).isVisible();
    }
}

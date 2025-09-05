package com.mocion.test;

import com.mocion.web.pages.LocationPage;
import com.mocion.web.pages.LoginPage;
import com.mocion.web.pages.PrivateCoachingPage;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class PrivateCoachingTest extends BaseTest {
    public LoginPage loginPage;
    public LocationPage locationPage;
    public PrivateCoachingPage privateCoachingPage;

    private static final String CLUB_NAME = "Farah123";
    private static final String TOTAL_MATCH_PRICE = "10";
    private static final String NOTES = "test_notes";

    public void initPages() {
        loginPage = new LoginPage(page);
        locationPage = new LocationPage(page);
        privateCoachingPage = new PrivateCoachingPage(page);
    }

    @Test(description = "Private coaching create with player payment cash should successful")
    public void verify_private_coaching_create_with_player_payment_cash_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        privateCoachingPage
                .clickCoachingFromNavigationBar()
                .clickPrivateCoachingFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .selectCoachName()
                .selectCourtName()
                .selectDate()
                .selectStartTime()
                .selectNumberOfPlayers()
                .selectTimeSlots()
                .fillTotalPrice(TOTAL_MATCH_PRICE)
                .fillNotes(NOTES)
                .selectPlayerOneName()
                .selectPaymentMethodCash()
                .clickBookNowButton();

        assertThat(privateCoachingPage.privateCoachingCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Private coaching create with player payment in app should successful")
    public void verify_private_coaching_create_with_player_payment_in_app_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        privateCoachingPage
                .clickCoachingFromNavigationBar()
                .clickPrivateCoachingFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .selectCoachName()
                .selectCourtName()
                .selectDate()
                .selectStartTime()
                .selectNumberOfPlayers()
                .selectTimeSlots()
                .fillTotalPrice(TOTAL_MATCH_PRICE)
                .fillNotes(NOTES)
                .selectPlayerOneName()
                .selectPaymentMethodCash()
                .clickBookNowButton();

        assertThat(privateCoachingPage.privateCoachingCreateSuccessMessageLocator()).isVisible();
    }
}

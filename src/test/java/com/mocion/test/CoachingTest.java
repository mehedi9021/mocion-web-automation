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

        assertThat(coachingPage.gameWithCoachCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Game with the coach create with player payment in app should successful")
    public void verify_game_with_the_coach_create_with_player_payment_in_app_should_succeed() {
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
                .selectPaymentMethodInApp()
                .clickBookNowButton();

        assertThat(coachingPage.gameWithCoachCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Game with the coach create with player payment credit debit card should successful")
    public void verify_game_with_the_coach_create_with_player_payment_credit_debit_card_should_succeed() {
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
                .selectPaymentMethodCreditDebitCard()
                .clickBookNowButton();

        assertThat(coachingPage.gameWithCoachCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Game with the coach create with player payment payment link should successful")
    public void verify_game_with_the_coach_create_with_player_payment_payment_link_should_succeed() {
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
                .selectPaymentMethodPaymentLink()
                .clickBookNowButton();

        assertThat(coachingPage.gameWithCoachCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Game with the coach create with player payment bank transfer should successful")
    public void verify_game_with_the_coach_create_with_player_payment_bank_transfer_should_succeed() {
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
                .selectPaymentMethodBankTransfer()
                .clickBookNowButton();

        assertThat(coachingPage.gameWithCoachCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Cancel booking without refund should successful")
    public void verify_cancel_booking_without_refund_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        coachingPage
                .clickCoachingFromNavigationBar()
                .clickGameWithCoachFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickCancelBooking()
                .clickCancelWithoutRefundButton();

        coachingPage
                .bookingCancelSuccessMessageLocator()
                .waitFor(new Locator.WaitForOptions()
                        .setState(WaitForSelectorState.VISIBLE));
        assertThat(coachingPage.bookingCancelSuccessMessageLocator()).isVisible();
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

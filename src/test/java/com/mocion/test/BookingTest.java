package com.mocion.test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import com.mocion.web.pages.BookingPage;
import com.mocion.web.pages.LocationPage;
import com.mocion.web.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class BookingTest extends BaseTest {
    public LoginPage loginPage;
    public BookingPage bookingPage;
    public LocationPage locationPage;

    private static final String CLUB_NAME = "Farah123";
    private static final String MIN_PLAYER_LEVEL = "0";
    private static final String MAX_PLAYER_LEVEL = "5";
    private static final String NOTES = "test_note";

    public void initPages() {
        locationPage = new LocationPage(page);
        loginPage = new LoginPage(page);
        bookingPage = new BookingPage(page);
    }

    @Test(description = "Public match booking create should successful")
    public void verify_public_match_booking_create_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .clickPublicMatch()
                .clickCheckScheduleButton()
                .selectSchedule(2)
                .clickSaveButton()
                .selectCourtName()
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .selectGenderMixed()
                .fillNotes(NOTES)
                .selectOwnerName(2)
                .selectOwnerPaymentMethod(3)
                .selectPlayerOneName(4)
                .selectPlayerOnePaymentMethod(5)
                .selectPlayerTwoName(6)
                .selectPlayerTwoPaymentMethod(7)
                .selectPlayerThreeName(8)
                .selectPlayerThreePaymentMethod(9)
                .clickSavePublicMatchButton();

        assertThat(bookingPage.bookingCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Cancel public match booking with refund should successful")
    public void verify_cancel_public_match_booking_with_refund_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickCancelBooking()
                .clickCancelWithRefundButton();

        bookingPage
                .bookingCancelSuccessMessageLocator()
                .waitFor(new Locator.WaitForOptions()
                        .setState(WaitForSelectorState.VISIBLE));
        assertThat(bookingPage.bookingCancelSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Cancel public match booking without refund should successful")
    public void verify_cancel_public_match_booking_without_refund_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickCancelBooking()
                .clickCancelWithoutRefundButton();

        bookingPage
                .bookingCancelSuccessMessageLocator()
                .waitFor(new Locator.WaitForOptions()
                        .setState(WaitForSelectorState.VISIBLE));
        assertThat(bookingPage.bookingCancelSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Cancel private match booking with refund should successful")
    public void verify_cancel_private_match_booking_with_refund_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickCancelBooking()
                .clickCancelWithRefundButton();

        bookingPage
                .bookingCancelSuccessMessageLocator()
                .waitFor(new Locator.WaitForOptions()
                        .setState(WaitForSelectorState.VISIBLE));
        assertThat(bookingPage.bookingCancelSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Cancel private match booking without refund should successful")
    public void verify_cancel_private_match_booking_without_refund_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickCancelBooking()
                .clickCancelWithoutRefundButton();

        bookingPage
                .bookingCancelSuccessMessageLocator()
                .waitFor(new Locator.WaitForOptions()
                        .setState(WaitForSelectorState.VISIBLE));
        assertThat(bookingPage.bookingCancelSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public match booking payment status should be paid when all player payments are paid should successful")
    public void verify_public_match_booking_payment_status_should_be_paid_when_all_player_payments_are_paid_should_succeed() {
        String clubName = "Farah123";
        String notes = "test_note";
        String minLevel = "0";
        String maxLevel = "1";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(clubName)
                .clickCreateButton()
                .clickPublicMatch()
                .clickCheckScheduleButton()
                .selectSchedule(2)
                .clickSaveButton()
                .selectCourtName()
                .fillMinPlayerLevel(minLevel)
                .fillMaxPlayerLevel(maxLevel)
                .selectGenderMixed()
                .fillNotes(notes)
                .selectOwnerName(2)
                .selectOwnerPaymentMethod(3)
                .selectPlayerOneName(4)
                .selectPlayerOnePaymentMethod(5)
                .selectPlayerTwoName(6)
                .selectPlayerTwoPaymentMethod(7)
                .selectPlayerThreeName(8)
                .selectPlayerThreePaymentMethodAsCash()
                .clickSavePublicMatchButton()
                .clickCloseIcon();

        Assert.assertTrue(bookingPage.getPaymentStatus().contains("Paid"));
    }

    @Test(description = "Friendly private match booking create with full price should succeed")
    public void verify_friendly_private_match_booking_create_with_full_price_should_succeed() {
        String clubName = "Farah123";
        String notes = "test_note";
        String ownerPrice = "10";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(clubName)
                .clickCreateButton()
                .clickPrivateMatch()
                .clickCheckScheduleButton()
                .selectSchedule(2)
                .clickSaveButton()
                .selectCourtName()
                .selectGameTypeFriendly()
                .fillNotes(notes)
                .selectPriceFull()
                .selectOwnerName(2)
                .fillOwnerPrice(ownerPrice)
                .selectOwnerPaymentMethod(3)
                .selectPlayerOneName(4)
                .selectPlayerTwoName(5)
                .selectPlayerThreeName(6)
                .clickSavePrivateMatchButton();

        assertThat(bookingPage.bookingCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Friendly private match booking create with split price should successful")
    public void verify_friendly_private_match_booking_create_with_split_price_should_succeed() {
        String clubName = "Farah123";
        String notes = "test_note";
        String ownerPrice = "10";
        String playerOnePrice = "10";
        String playerTwoPrice = "10";
        String playerThreePrice = "10";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(clubName)
                .clickCreateButton()
                .clickPrivateMatch()
                .clickCheckScheduleButton()
                .selectSchedule(2)
                .clickSaveButton()
                .selectCourtName()
                .selectGameTypeFriendly()
                .fillNotes(notes)
                .selectPriceSplit()
                .selectOwnerName(2)
                .fillOwnerPrice(ownerPrice)
                .selectOwnerPaymentMethod(3)
                .selectPlayerOneName(4)
                .fillPlayerOnePrice(playerOnePrice)
                .selectPlayerOnePaymentMethod(5)
                .selectPlayerTwoName(6)
                .fillPlayerTwoPrice(playerTwoPrice)
                .selectPlayerTwoPaymentMethod(7)
                .selectPlayerThreeName(8)
                .fillPlayerThreePrice(playerThreePrice)
                .selectPlayerThreePaymentMethod(9)
                .clickSavePrivateMatchButton();

        assertThat(bookingPage.bookingCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Competitive private match booking create with full price should successful")
    public void verify_competitive_private_match_booking_create_with_full_price_should_succeed() {
        String clubName = "Farah123";
        String notes = "test_note";
        String ownerPrice = "10";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(clubName)
                .clickCreateButton()
                .clickPrivateMatch()
                .clickCheckScheduleButton()
                .selectSchedule(2)
                .clickSaveButton()
                .selectCourtName()
                .selectGameTypeCompetitive()
                .fillNotes(notes)
                .selectPriceFull()
                .selectOwnerName(2)
                .fillOwnerPrice(ownerPrice)
                .selectOwnerPaymentMethod(3)
                .selectPlayerOneName(4)
                .selectPlayerTwoName(5)
                .selectPlayerThreeName(6)
                .clickSavePrivateMatchButton();

        assertThat(bookingPage.bookingCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Competitive private match booking create with split price should successful")
    public void verify_competitive_private_match_booking_create_with_split_price_should_succeed() {
        String clubName = "Farah123";
        String notes = "test_note";
        String ownerPrice = "10";
        String playerOnePrice = "10";
        String playerTwoPrice = "10";
        String playerThreePrice = "10";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        bookingPage
                .clickBookingFromNavigationBar()
                .selectClubName(clubName)
                .clickCreateButton()
                .clickPrivateMatch()
                .clickCheckScheduleButton()
                .selectSchedule(2)
                .clickSaveButton()
                .selectCourtName()
                .selectGameTypeCompetitive()
                .fillNotes(notes)
                .selectPriceSplit()
                .selectOwnerName(2)
                .fillOwnerPrice(ownerPrice)
                .selectOwnerPaymentMethod(3)
                .selectPlayerOneName(4)
                .fillPlayerOnePrice(playerOnePrice)
                .selectPlayerOnePaymentMethod(5)
                .selectPlayerTwoName(6)
                .fillPlayerTwoPrice(playerTwoPrice)
                .selectPlayerTwoPaymentMethod(7)
                .selectPlayerThreeName(8)
                .fillPlayerThreePrice(playerThreePrice)
                .selectPlayerThreePaymentMethod(9)
                .clickSavePrivateMatchButton();

        assertThat(bookingPage.bookingCreateSuccessMessageLocator()).isVisible();
    }
}

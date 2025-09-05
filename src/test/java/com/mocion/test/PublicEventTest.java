package com.mocion.test;

import com.mocion.web.pages.LocationPage;
import com.mocion.web.pages.LoginPage;
import com.mocion.web.pages.PublicEventPage;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class PublicEventTest extends BaseTest {
    public LoginPage loginPage;
    public PublicEventPage publicEventPage;
    public Random random;
    public LocationPage locationPage;

    private static final String CLUB_NAME = "Farah123";
    private static final String MIN_PLAYER_LEVEL = "0";
    private static final String MAX_PLAYER_LEVEL = "5";
    private static final String MIN_NUMBER_OF_PLAYERS = "8";
    private static final String MAX_NUMBER_OF_PLAYERS = "10";
    private static final String PRICE_PER_PLAYER = "10";

    public void initPages() {
        random = new Random();
        loginPage = new LoginPage(page);
        publicEventPage = new PublicEventPage(page);
        locationPage = new LocationPage(page);
    }

    @Test(description = "Public competitive americano event create with joining type single court indoor and payment app should successful")
    public void verify_public_competitive_americano_event_create_with_joining_type_single_court_indoor_and_payment_app_should_succeed() {
        List<String> data = generateEventData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillEventName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillEventDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadEventImage()
                .fillMinNumberOfPlayers(MIN_NUMBER_OF_PLAYERS)
                .fillMaxNumberOfPlayers(MAX_NUMBER_OF_PLAYERS)
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectEventStyleAmericano()
                .selectEventTypeCompetitive()
                .selectPlayerJoiningTypeSingle()
                .selectGenderMixed()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectRegistrationDeadline()
                .selectCourtTypeIndoor()
                .selectStartTime()
                .selectEndTime()
                .clickSaveEventButton();

        assertThat(publicEventPage.eventCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public friendly americano event create with joining type single court outdoor and payment club should successful")
    public void verify_public_friendly_americano_event_create_with_joining_type_single_court_outdoor_and_payment_club_should_succeed() {
        List<String> data = generateEventData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillEventName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillEventDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadEventImage()
                .fillMinNumberOfPlayers(MIN_NUMBER_OF_PLAYERS)
                .fillMaxNumberOfPlayers(MAX_NUMBER_OF_PLAYERS)
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsClub()
                .selectEventStyleAmericano()
                .selectEventTypeFriendly()
                .selectPlayerJoiningTypeSingle()
                .selectGenderMixed()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectRegistrationDeadline()
                .selectCourtTypeIndoor()
                .selectStartTime()
                .selectEndTime()
                .clickSaveEventButton();

        assertThat(publicEventPage.eventCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public competitive mexicano event create with joining type single court roofed and payment app should successful")
    public void verify_public_competitive_mexicano_event_create_with_joining_type_single_court_roofed_and_payment_app_should_succeed() {
        List<String> data = generateEventData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillEventName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillEventDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadEventImage()
                .fillMinNumberOfPlayers(MIN_NUMBER_OF_PLAYERS)
                .fillMaxNumberOfPlayers(MAX_NUMBER_OF_PLAYERS)
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectEventStyleMexicano()
                .selectEventTypeCompetitive()
                .selectPlayerJoiningTypeSingle()
                .selectGenderMixed()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectRegistrationDeadline()
                .selectCourtTypeRoffed()
                .selectStartTime()
                .selectEndTime()
                .clickSaveEventButton();

        assertThat(publicEventPage.eventCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public friendly mexicano event create with joining type single court indoor and payment club should successful")
    public void verify_public_friendly_mexicano_event_create_with_joining_type_single_court_indoor_and_payment_club_should_succeed() {
        List<String> data = generateEventData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillEventName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillEventDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadEventImage()
                .fillMinNumberOfPlayers(MIN_NUMBER_OF_PLAYERS)
                .fillMaxNumberOfPlayers(MAX_NUMBER_OF_PLAYERS)
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsClub()
                .selectEventStyleMexicano()
                .selectEventTypeFriendly()
                .selectPlayerJoiningTypeSingle()
                .selectGenderMixed()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectRegistrationDeadline()
                .selectCourtTypeIndoor()
                .selectStartTime()
                .selectEndTime()
                .clickSaveEventButton();

        assertThat(publicEventPage.eventCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public competitive mexicano event create with joining type single / double (team) court outdoor and payment app should successful")
    public void verify_public_competitive_mexicano_event_create_with_joining_type_single_double_team_court_outdoor_and_payment_app_should_succeed() {
        List<String> data = generateEventData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillEventName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillEventDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadEventImage()
                .fillMinNumberOfPlayers(MIN_NUMBER_OF_PLAYERS)
                .fillMaxNumberOfPlayers(MAX_NUMBER_OF_PLAYERS)
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectEventStyleMexicano()
                .selectEventTypeCompetitive()
                .selectPlayerJoiningTypeBoth()
                .selectGenderMixed()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectRegistrationDeadline()
                .selectCourtTypeOutdoor()
                .selectStartTime()
                .selectEndTime()
                .clickSaveEventButton();

        assertThat(publicEventPage.eventCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public friendly mexicano event create with joining type single / double (team) court roofed and payment club should successful")
    public void verify_public_friendly_mexicano_event_create_with_joining_type_single_double_team_court_roofed_and_payment_club_should_succeed() {
        List<String> data = generateEventData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillEventName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillEventDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadEventImage()
                .fillMinNumberOfPlayers(MIN_NUMBER_OF_PLAYERS)
                .fillMaxNumberOfPlayers(MAX_NUMBER_OF_PLAYERS)
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsClub()
                .selectEventStyleMexicano()
                .selectEventTypeFriendly()
                .selectPlayerJoiningTypeBoth()
                .selectGenderMixed()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectRegistrationDeadline()
                .selectCourtTypeRoffed()
                .selectStartTime()
                .selectEndTime()
                .clickSaveEventButton();

        assertThat(publicEventPage.eventCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public competitive king of the courts event create with joining type single court indoor and payment club should successful")
    public void verify_public_competitive_king_of_the_courts_event_create_with_joining_type_single_court_indoor_and_payment_club_should_succeed() {
        List<String> data = generateEventData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillEventName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillEventDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadEventImage()
                .fillMinNumberOfPlayers(MIN_NUMBER_OF_PLAYERS)
                .fillMaxNumberOfPlayers(MAX_NUMBER_OF_PLAYERS)
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsClub()
                .selectEventStyleKingOfTheCourts()
                .selectEventTypeCompetitive()
                .selectPlayerJoiningTypeSingle()
                .selectGenderMixed()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectRegistrationDeadline()
                .selectCourtTypeIndoor()
                .selectStartTime()
                .selectEndTime()
                .clickSaveEventButton();

        assertThat(publicEventPage.eventCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public friendly king of the courts event create with joining type single court outdoor and payment app should successful")
    public void verify_public_friendly_king_of_the_courts_event_create_with_joining_type_single_court_outdoor_and_payment_app_should_succeed() {
        List<String> data = generateEventData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillEventName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillEventDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadEventImage()
                .fillMinNumberOfPlayers(MIN_NUMBER_OF_PLAYERS)
                .fillMaxNumberOfPlayers(MAX_NUMBER_OF_PLAYERS)
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectEventStyleKingOfTheCourts()
                .selectEventTypeFriendly()
                .selectPlayerJoiningTypeSingle()
                .selectGenderMixed()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectRegistrationDeadline()
                .selectCourtTypeOutdoor()
                .selectStartTime()
                .selectEndTime()
                .clickSaveEventButton();

        assertThat(publicEventPage.eventCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public competitive king of the courts event create with joining type single / double (team) court roofed and payment club should successful")
    public void verify_public_competitive_king_of_the_courts_event_create_with_joining_type_single_double_team_court_roofed_and_payment_club_should_succeed() {
        List<String> data = generateEventData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillEventName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillEventDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadEventImage()
                .fillMinNumberOfPlayers(MIN_NUMBER_OF_PLAYERS)
                .fillMaxNumberOfPlayers(MAX_NUMBER_OF_PLAYERS)
                .fillMinPlayerLevel(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsClub()
                .selectEventStyleKingOfTheCourts()
                .selectEventTypeCompetitive()
                .selectPlayerJoiningTypeBoth()
                .selectGenderMixed()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectRegistrationDeadline()
                .selectCourtTypeRoffed()
                .selectStartTime()
                .selectEndTime()
                .clickSaveEventButton();

        assertThat(publicEventPage.eventCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Add players to public event with join type single and payment cash should successful")
    public void verify_add_players_to_public_event_with_join_type_single_and_payment_cash_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickAddPlayers()
                .clickAddPlayersButton()
                .selectPlayerNameToAdd()
                .selectJoinTypeSingle()
                .selectPaymentMethodCash()
                .clickAddPlayerSaveButton();

        assertThat(publicEventPage.addPlayersToEventSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Add players to public event with join type single and payment credit debit card should successful")
    public void verify_add_players_to_public_event_with_join_type_single_and_payment_credit_debit_card_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickAddPlayers()
                .clickAddPlayersButton()
                .selectPlayerNameToAdd()
                .selectJoinTypeSingle()
                .selectPaymentMethodCreditDebitCard()
                .clickAddPlayerSaveButton();

        assertThat(publicEventPage.addPlayersToEventSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Add players to public event with join type single and payment in app should successful")
    public void verify_add_players_to_public_event_with_join_type_single_and_payment_in_app_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickAddPlayers()
                .clickAddPlayersButton()
                .selectPlayerNameToAdd()
                .selectJoinTypeSingle()
                .selectPaymentMethodInApp()
                .clickAddPlayerSaveButton();

        assertThat(publicEventPage.addPlayersToEventSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Add players to public event with join type single and payment payment link should successful")
    public void verify_add_players_to_public_event_with_join_type_single_and_payment_payment_link_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickAddPlayers()
                .clickAddPlayersButton()
                .selectPlayerNameToAdd()
                .selectJoinTypeSingle()
                .selectPaymentMethodPaymentLink()
                .clickAddPlayerSaveButton();

        assertThat(publicEventPage.addPlayersToEventSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Add players to public event with join type single and payment bank transfer should successful")
    public void verify_add_players_to_public_event_with_join_type_single_and_payment_bank_transfer_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickAddPlayers()
                .clickAddPlayersButton()
                .selectPlayerNameToAdd()
                .selectJoinTypeSingle()
                .selectPaymentMethodBankTransfer()
                .clickAddPlayerSaveButton();

        assertThat(publicEventPage.addPlayersToEventSuccessMessageLocator()).isVisible();
    }

    // Number of players 8 - 8
    @Test(description = "Schedule courts for public event should successful")
    public void verify_schedule_courts_for_public_event_should_succeed() {
        String numberOfServes = "10";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        publicEventPage
                .clickEventsFromNavigationBar()
                .clickPublicEventFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickScheduleCourts()
                .selectPauseTime()
                .selectMaximumDurationOfRound()
                .fillNumberOfServes(numberOfServes)
                .clickCheckAvailabilityButton()
                .selectAvailableCourts()
                .clickSaveAndPublishButton();

        assertThat(publicEventPage.scheduleCourtsSuccessMessageLocator()).isVisible();
    }

    private List<String> generateEventData() {
        random = new Random();
        String id = String.format("%03d", random.nextInt(999) + 1);
        return Arrays.asList(
                "test_event_" + id,
                "test_organization_" + id,
                "test_sponsor_" + id,
                "test_prize_" + id,
                "test_description",
                "test_terms_and_conditions"
        );
    }
}

package com.mocion.test;

import com.mocion.web.pages.LocationPage;
import com.mocion.web.pages.LoginPage;
import com.mocion.web.pages.TournamentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TournamentsTest extends BaseTest {
    public LoginPage loginPage;
    public TournamentsPage tournamentsPage;
    public Random random;
    public LocationPage locationPage;

    private static final String CLUB_NAME = "Farah123";
    private static final String MIN_PLAYER_LEVEL = "0";
    private static final String MAX_PLAYER_LEVEL = "5";
    private static final String PRICE_PER_PLAYER = "10";
    private static final int MAX_NUMBER_OF_DATE_INCREMENT = 5;
    private static final int NUMBER_OF_COURTS_TO_SELECT = 2;
    private static final List<String> ALLOWED_DAYS = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
    private static final List<String> EDIT_ALLOWED_DAYS = Arrays.asList("Saturday", "Sunday");

    public void initPages() {
        random = new Random();
        loginPage = new LoginPage(page);
        tournamentsPage = new TournamentsPage(page);
        locationPage = new LocationPage(page);
    }

    @Test(description = "Private competitive knockout tournament create should successful")
    public void verify_private_competitive_knockout_tournament_create_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public competitive knockout tournament create should successful")
    public void verify_public_competitive_knockout_tournament_create_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Private competitive round robin tournament create should successful")
    public void verify_private_competitive_round_robin_tournament_create_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleRoundRobin()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public competitive round robin tournament create should successful")
    public void verify_public_competitive_round_tournament_create_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleRoundRobin()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Private friendly knockout tournament create should successful")
    public void verify_private_friendly_knockout_tournament_create_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleKnockouts()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public friendly knockout tournament create should successful")
    public void verify_public_friendly_knockout_tournament_create_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleKnockouts()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Private friendly round tournament create should successful")
    public void verify_private_friendly_round_tournament_create_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleRoundRobin()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public friendly round robin tournament create should successful")
    public void verify_public_friendly_round_robin_tournament_create_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(data.get(4))
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .selectPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleRoundRobin()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .selectAssignOrganizer()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Add players to tournament should successful")
    public void verify_add_players_to_tournament_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickAddPlayers()
                .clickAddPlayersButton()
                .selectPlayerName()
                .selectJoinTypeSingle()
                .selectPaymentMethod()
                .clickAddPlayerSaveButton();

        assertThat(tournamentsPage.addPlayersToTournamentSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Schedule courts for tournament should successful")
    public void verify_schedule_courts_for_tournament_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickScheduleCourts()
                .selectAllowedCourts(NUMBER_OF_COURTS_TO_SELECT)
                .selectMatchDuration()
                .setPerMatchOne()
                .selectCourtsWithDateIncrement(MAX_NUMBER_OF_DATE_INCREMENT)
                .clickSaveAndPublishButton();

        assertThat(tournamentsPage.scheduleCourtsSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Chat with tournament players should successful")
    public void verify_chat_with_tournament_players_should_succeed() {
        String conversationText = "Hello, this is a test message";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickChatWithPlayers()
                .clickFirstConversation()
                .fillConversationText(conversationText)
                .clickSendIcon();

        Assert.assertTrue(tournamentsPage.sentMessageTextContent().contains(conversationText));
    }

    @Test(description = "Setting up schedule for knockout tournament should successful")
    public void verify_setting_up_schedule_for_knockout_tournament_should_succeed() {
        String scoreOne = "4";
        String scoreTwo = "2";
        String clubName = "RE2";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(clubName)
                .clickMenuIcon()
                .clickSchedule()
                .selectNumberOfTopSeatsTwo()
                .clickGenerateGroupsButton()
                .clickSaveAndNextButton()
                .clickSaveAndNextButton()
                .setKnockoutMatchScores(scoreOne, scoreTwo);

        assertThat(tournamentsPage.scoresUpdateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Setting up schedule for round robin tournament should successful")
    public void verify_setting_up_schedule_for_round_robin_tournament_should_succeed() {
        String scoreOne = "4";
        String scoreTwo = "2";
        String clubName = "RE2";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(clubName)
                .clickMenuIcon()
                .clickSchedule()
                .selectNumberOfTopSeatsTwo()
                .clickGenerateGroupsButton()
                .clickSaveAndNextButton()
                .clickPhaseOneNextButton()
                .clickPhaseOneSaveAndNextButton()
                .setRoundRobinPhaseOneMatchScores(scoreOne, scoreTwo)
                .clickPhaseOneGenerateResultsButton()
                .clickPhaseOneNextButton()
                .setRoundRobinSemiFinalMatchScores(scoreOne, scoreTwo)
                .clickSemiFinalGenerateResultsButton()
                .setRoundRobinFinalMatchScores(scoreOne, scoreTwo)
                .clickFinalGenerateResultsButton();

        assertThat(tournamentsPage.scoresUpdateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Edit tournament with required fields should successful")
    public void verify_tournament_edit_with_required_fields_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickEditTournaments()
                .clearTournamentNameField()
                .fillTournamentName(data.get(0))
                .clearTournamentDescriptionField()
                .fillTournamentDescription(data.get(4))
                .clearMinPlayerLevelField()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .clearMaxPlayerLevelField()
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .clearPricePerPlayerField()
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .editPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleKnockouts()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .editAssignOrganizer()
                .clearTermsAndConditionsField()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(EDIT_ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentEditSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Edit tournament with optional fields should successful")
    public void verify_tournament_edit_with_optional_fields_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickEditTournaments()
                .clearOrganizationNameField()
                .fillOrganizationName(data.get(1))
                .clearSponsorField()
                .fillSponsor(data.get(2))
                .clearPrizeField()
                .fillPrize(data.get(3))
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentEditSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Edit tournament with all fields should successful")
    public void verify_edit_tournament_with_all_fields_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickEditTournaments()
                .clearTournamentNameField()
                .fillTournamentName(data.get(0))
                .clearOrganizationNameField()
                .fillOrganizationName(data.get(1))
                .clearTournamentDescriptionField()
                .fillTournamentDescription(data.get(4))
                .clearSponsorField()
                .fillSponsor(data.get(2))
                .clearPrizeField()
                .fillPrize(data.get(3))
                .clearMinPlayerLevelField()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .clearMaxPlayerLevelField()
                .fillMaxPlayerLevel(MAX_PLAYER_LEVEL)
                .clearPricePerPlayerField()
                .fillPricePerPlayer(PRICE_PER_PLAYER)
                .editPaymentDetailsApp()
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleKnockouts()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .editAssignOrganizer()
                .clearTermsAndConditionsField()
                .fillTermsAndConditions(data.get(5))
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedDays(EDIT_ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentEditSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Duplicate tournament should successful")
    public void verify_duplicate_tournament_should_succeed() {
        List<String> data = generateTournamentData();

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickDuplicate()
                .clearTournamentNameField()
                .fillTournamentName(data.getFirst())
                .clickSaveTournamentButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Cancel tournament should successful")
    public void verify_cancel_tournament_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickMenuIcon()
                .clickCancelTournament()
                .clickYesToCancelTournament();

        assertThat(tournamentsPage.cancelTournamentSuccessMessageLocator()).isVisible();
    }

    private List<String> generateTournamentData() {
        random = new Random();
        String id = String.format("%03d", random.nextInt(999) + 1);
        return Arrays.asList(
                "test_tournament_" + id,
                "test_organization_" + id,
                "test_sponsor_" + id,
                "test_prize_" + id,
                "test_description",
                "test_terms_and_conditions"
        );
    }
}

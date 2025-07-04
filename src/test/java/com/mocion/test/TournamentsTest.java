package com.mocion.test;

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

    private static final String CLUB_NAME = "Farah123";
    private static final String TOURNAMENT_DESCRIPTION = "test_description";
    private static final String MIN_PLAYER_LEVEL = "0";
    private static final String MAX_PLAYER_LEVEL = "5";
    private static final String TERMS_AND_CONDITIONS = "test_terms_and_conditions";
    private static final String PRICE_PER_PLAYER = "10";
    private static final List<String> ALLOWED_DAYS = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

    @Test(description = "Private competitive knockout tournament create with single player should successful")
    public void verify_private_competitive_knockout_tournament_create_with_single_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public competitive knockout tournament create with double player should successful")
    public void verify_public_competitive_knockout_tournament_create_with_double_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeDouble()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Private competitive round tournament create with both player should successful")
    public void verify_private_competitive_round_tournament_create_with_both_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleRound()
                .selectPlayerJoiningTypeBoth()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 9)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public competitive round tournament create with single player should successful")
    public void verify_public_competitive_round_tournament_create_with_single_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleRound()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 9)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Private friendly knockout tournament create with double player should successful")
    public void verify_private_friendly_knockout_tournament_create_with_double_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeDouble()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public friendly knockout tournament create with both player should successful")
    public void verify_public_friendly_knockout_tournament_create_with_both_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeBoth()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Private friendly round tournament create with single player should successful")
    public void verify_private_friendly_round_tournament_create_with_single_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleRound()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 9)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public friendly round tournament create with double player should successful")
    public void verify_public_friendly_round_tournament_create_with_double_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleRound()
                .selectPlayerJoiningTypeBoth()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 9)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Private friendly round tournament create with both player should successful")
    public void verify_private_friendly_round_tournament_create_with_both_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleRound()
                .selectPlayerJoiningTypeBoth()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 9)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public competitive knockout tournament create with both player should successful")
    public void verify_public_competitive_knockout_tournament_create_with_both_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeBoth()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Private competitive round tournament create with double player should successful")
    public void verify_private_competitive_round_tournament_create_with_double_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleRound()
                .selectPlayerJoiningTypeDouble()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 9)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Public friendly knockout tournament create with single player should successful")
    public void verify_public_friendly_knockout_tournament_create_with_single_player_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeFriendly()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePublic()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Tournament edit with all required editable fields should successful")
    public void verify_tournament_edit_with_all_required_editable_fields_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        List<String> editData = generateTournamentData();

        tournamentsPage
                .clickMenuIcon()
                .clickEditTournaments()
                .clearTournamentNameField()
                .fillTournamentName(editData.getFirst())
                .TournamentDescriptionField()
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .clickNextButton();

        assertThat(tournamentsPage.tournamentEditSuccessMessageLocator()).isVisible();

        tournamentsPage
                .clickSaveAndPublishButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Tournament edit with all optional editable fields should successful")
    public void verify_tournament_edit_with_all_optional_editable_fields_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        List<String> editData = generateTournamentData();

        tournamentsPage
                .clickMenuIcon()
                .clickEditTournaments()
                .clearOrganizationNameField()
                .fillOrganizationName(editData.get(1))
                .clearSponsorField()
                .fillSponsor(editData.get(2))
                .clearPrizeField()
                .fillPrize(editData.get(3))
                .clickNextButton();

        assertThat(tournamentsPage.tournamentEditSuccessMessageLocator()).isVisible();

        tournamentsPage
                .clickSaveAndPublishButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Tournament edit with all editable fields should successful")
    public void verify_tournament_edit_with_all_editable_fields_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        List<String> editData = generateTournamentData();

        tournamentsPage
                .clickMenuIcon()
                .clickEditTournaments()
                .clearTournamentNameField()
                .fillTournamentName(editData.get(0))
                .clearOrganizationNameField()
                .fillOrganizationName(editData.get(1))
                .TournamentDescriptionField()
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .clearSponsorField()
                .fillSponsor(editData.get(2))
                .clearPrizeField()
                .fillPrize(editData.get(3))
                .clickNextButton();

        assertThat(tournamentsPage.tournamentEditSuccessMessageLocator()).isVisible();

        tournamentsPage
                .clickSaveAndPublishButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Chat with players should successful")
    public void verify_chat_with_players_should_succeed() {
        String conversationText = "Hello, this is a test message";
        tournamentsPage = new TournamentsPage(page);

        setLocationPermissionAllowed();
        userLogin();
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

    @Test(description = "Tournament duplicate should successful")
    public void verify_tournament_duplicate_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();
        tournamentsPage
                .clickMenuIcon()
                .clickDuplicate()
                .clickNextButton();
        tournamentsPage
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();

        assertThat(tournamentsPage.tournamentCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Tournament cancel should successful")
    public void verify_tournament_cancel_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();
        tournamentsPage
                .clickMenuIcon()
                .clickCancelTournament()
                .clickYesToCancelTournament();

        assertThat(tournamentsPage.tournamentCancelSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Adding player to tournament should be successful")
    public void verify_adding_player_to_tournament_should_succeed() {
        tournamentsPage = new TournamentsPage(page);
        List<String> data = generateTournamentData();

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(CLUB_NAME)
                .clickCreateButton()
                .fillTournamentName(data.get(0))
                .fillOrganizationName(data.get(1))
                .fillTournamentDescription(TOURNAMENT_DESCRIPTION)
                .fillSponsor(data.get(2))
                .uploadSponsorLogo()
                .fillPrize(data.get(3))
                .uploadTournamentImage()
                .fillMinPlayerLevelField(MIN_PLAYER_LEVEL)
                .fillMaxPlayerLevelField(MAX_PLAYER_LEVEL)
                .fillPricePerPlayerField(PRICE_PER_PLAYER)
                .selectGenderMixed()
                .selectEventTypeCompetitive()
                .selectTournamentStyleKnockouts()
                .selectPlayerJoiningTypeSingle()
                .selectEventTypePrivate()
                .selectNumberOfPlayer()
                .fillTermsAndConditionsField(TERMS_AND_CONDITIONS)
                .clickNextButton();
        tournamentsPage
                .selectStartDate()
                .selectEndDate()
                .selectRegistrationDeadline()
                .selectAllowedCourts()
                .selectAllowedDays(ALLOWED_DAYS)
                .selectStartTime()
                .selectEndTime()
                .selectMatchDuration()
                .setPerMatchOne()
                .clickCourtAvailabilityButton()
                .selectMultipleCourts(0, 3)
                .clickSaveAndPublishButton()
                .clickOkButton();
        tournamentsPage
                .clickMenuIcon()
                .clickAddPlayers()
                .clickAddPlayersButton()
                .selectPlayerName()
                .selectJoinTypeSingle()
                .selectPaymentMethod()
                .clickAddPlayerSaveButton();

        assertThat(tournamentsPage.addTournamentPlayerSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Setting the schedule for the knockout tournament should be successful")
    public void verify_setting_the_schedule_for_the_knockout_tournament_should_succeed() {
        String scoreOne = "4";
        String scoreTwo = "2";
        String clubName = "RE2";
        tournamentsPage = new TournamentsPage(page);

        setLocationPermissionAllowed();
        userLogin();
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

    @Test(description = "Setting the schedule for the round robin tournament should be successful")
    public void verify_setting_the_schedule_for_the_round_robin_tournament_should_succeed() {
        String scoreOne = "4";
        String scoreTwo = "2";
        String clubName = "RE2";
        tournamentsPage = new TournamentsPage(page);

        setLocationPermissionAllowed();
        userLogin();
        tournamentsPage
                .clickEventsFromNavigationBar()
                .clickTournamentsFromNavigationBar()
                .selectClubName(clubName)
                .clickMenuIcon()
                .clickSchedule()
                .selectNumberOfTopSeatsTwo()
                .clickGenerateGroupsButton()
                .clickSaveAndNextButton()
                .clickNextButtonPhaseOne()
                .clickSaveAndNextButtonPhaseOne()
                .setRoundRobinPhaseOneMatchScores(scoreOne, scoreTwo)
                .clickPhaseOneGenerateResultsButton()
                .clickNextButtonPhaseOne()
                .setRoundRobinSemiFinalMatchScores(scoreOne, scoreTwo)
                .clickFinalGenerateResultsButton()
                .setRoundRobinFinalMatchScores(scoreOne, scoreTwo)
                .clickFinalGenerateResultsButton();

        assertThat(tournamentsPage.scoresUpdateSuccessMessageLocator()).isVisible();
    }

    private List<String> generateTournamentData() {
        random = new Random();
        String id = String.format("%03d", random.nextInt(999) + 1);
        return Arrays.asList(
                "test_tournament_" + id,
                "test_organization_" + id,
                "test_sponsor_" + id,
                "test_prize_" + id
        );
    }

    private void setLocationPermissionAllowed() {
        page.context().grantPermissions(List.of("geolocation"));
    }

    private void userLogin() {
        loginPage = new LoginPage(page);
        page.navigate(prop.getProperty("baseUrl"));
        loginPage
                .fillUserEmail(prop.getProperty("userEmail_2"))
                .fillUserPassword(prop.getProperty("userPassword_2"))
                .clickLoginBtn();
    }
}

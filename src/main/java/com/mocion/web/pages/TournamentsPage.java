package com.mocion.web.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TournamentsPage {
    private final Page page;

    public String eventsText = "text='Events'";
    public String clubNameDropdown = "select[title='Club name here']";
    public String menuIcon = "button[class*='flex']:has(svg)";
    public String createButton = "role=button[name='Create']";
    public String tournamentsText = "text='Tournaments'";
    public String editTournamentsText = "text='Edit tournaments'";
    public String addPlayerText = "text='Add Players'";
    public String addPlayerButton = "text='Add Players'";
    public String nameInputField = "input[name='name']";
    public String organizationNameField = "input[name='organizer_name']";
    public String tournamentDescriptionField = "input[name='description']";
    public String sponsorField = "input[name='sponsor_ids.0.name']";
    public String sponsorLogoField = "label[for='clubLogo']";
    public String prizeField = "input[name='prize_ids.0.name']";
    public String tournamentImageField = "input#trn_image_upload";
    public String tournamentCreateDropdowns = ".react-select__dropdown-indicator";
    public String addPlayerNameDropdown = "div.react-select.__dropdown-indicator";
    public String paymentMethodDropdown = "div.react-select.w-full__dropdown-indicator";
    public String minPlayerLevelField = "input[name='min_players_level']";
    public String maxPlayerLevelField = "input[name='max_players_level']";
    public String tournamentStyleKnockout = "input[type='radio'][value='Knockouts']";
    public String tournamentStyleRoundRobin = "input[type='radio'][value='Round Robin']";
    public String termsAndConditionsField = "input[name='terms_and_conditions']";
    public String saveTournamentButton = "button.bg-primary.text-white";
    public String pricePerPlayerField = "input[name='price_per_player']";
    public String genderMixed = "input[type='radio'][value='Mixed']";
    public String eventTypeCompetitive = "input[type='radio'][value='competitive']";
    public String eventTypeFriendly = "input[type='radio'][value='friendly']";
    public String eventTypePrivate = "input[type='radio'][value='private']";
    public String eventTypePublic = "input[type='radio'][value='public']";
    public String dateFields = "div.absolute.right-1.top-2 svg";
    public String scheduleCourtsDropdowns = "div.react-select__indicator.react-select__dropdown-indicator";
    public String startTime = "input[name='start_time']";
    public String endTime = "input[name='end_time']";
    public String setPerMatchOne = "input[type='radio'][value='1']";
    public String saveAndPublishButton = "text='Save and publish'";
    public String checkAvailabilityButton = "button:text('Check court availibility')";
    public String tournamentCreateSuccessMessage = "text='Successful.'";
    public String tournamentEditSuccessMessage = "text='tournament has been updated successfully'";
    public String chatWithPlayersText = "li:has-text('chat with players')";
    public String firstConversation = ".w-full.flex.px-8";
    public String conversationTextInputField = ".editable.w-full.pt-2";
    public String sendMessageIcon = ".lucide.lucide-send";
    public String sentMessageText = ".flex.flex-col.gap-2.py-2.pr-2";
    public String duplicateText = "li:has-text('Duplicate')";
    public String cancelTournamentText = "text=Cancel tournament";
    public String yesButtonToCancelTournament = "button:has-text('Yes')";
    public String cancelTournamentSuccessMessage = "text='tournament has been canceled successfully'";
    public String paymentMethod = "text='Cash'";
    public String joinTypeSingle = "input[type='radio'][value='Single']";
    public String addPlayersToTournamentSuccessMessageLocator = "text='Players were added successfully as League Players'";
    public String playerName = "text='Zeinab khalil'";
    public String addPlayerSaveButton = "button[type='submit']";
    public String scheduleText = "text='Schedule'";
    public String numberOfTopSeatsDropdown = ".react-select__indicator.react-select__dropdown-indicator";
    public String generateGroupsButton = "button:has-text(\"Generate groups\")";
    public String saveAndNextButton = "button:has-text(\"save And Next\")";
    public String numberOfTopSeatsTwo = "text='2'";
    public String scoreOneInputField = "input[name='score_1']";
    public String scoreTwoInputField = "input[name='score_2']";
    public String saveMatchScoreButton = "button:has-text(\"Save\")";
    public String confirmResultIcon = "button:has(img[alt='check icon'])";
    public String editMatchScoreIcon = "button:has(img[alt='edit icon'])";
    public String yesToConfirmMatchResultButton = "button:has-text(\"Yes\")";
    public String scoresUpdateSuccessMessageLocator = "text='scores have been updated successfully'";
    public String phaseOneNextButton = "button:has-text(\"Next\")";
    public String phaseOneSaveAndNextButton = "button:has-text(\"save and next\")";
    public String generateResultsButton = "button:has-text(\"Generate results\")";
    public String courtOptions = ".react-select__option";
    public String selectedSlotsCount = "h3.text-primary";
    public String allAvailableCourts = "span.bg-\\[\\#f3f3f3\\].text-primary";
    public String paymentDetailsApp = "text='App'";
    public String scheduleCourtsText = "li.flex.cursor-pointer:has-text('Schedule courts')";

    public TournamentsPage(Page page) {
        this.page = page;
    }

    public TournamentsPage clickEventsFromNavigationBar() {
        page.locator(eventsText).click();
        return this;
    }

    public TournamentsPage clickTournamentsFromNavigationBar() {
        page.locator(tournamentsText).click();
        return this;
    }

    public TournamentsPage clickCancelTournament() {
        page.locator(cancelTournamentText).click();
        return this;
    }

    public TournamentsPage clickDuplicate() {
        page.locator(duplicateText).click();
        return this;
    }

    public TournamentsPage selectClubName(String clubName) {
        page.selectOption(clubNameDropdown, clubName);
        return this;
    }

    public TournamentsPage clickChatWithPlayers() {
        page.locator(chatWithPlayersText).click();
        return this;
    }

    public TournamentsPage clickMenuIcon() {
        page.locator(menuIcon).nth(4).click();
        return this;
    }

    public TournamentsPage clickCreateButton() {
        page.locator(createButton).click();
        return this;
    }

    public TournamentsPage clickEditTournaments() {
        page.locator(editTournamentsText).click();
        return this;
    }

    public TournamentsPage clearTournamentNameField() {
        page.locator(nameInputField).clear();
        return this;
    }

    public TournamentsPage fillTournamentName(String tournamentName) {
        page.locator(nameInputField).fill(tournamentName);
        return this;
    }

    public TournamentsPage clearOrganizationNameField() {
        page.locator(organizationNameField).clear();
        return this;
    }

    public TournamentsPage fillOrganizationName(String organizationName) {
        page.locator(organizationNameField).fill(organizationName);
        return this;
    }

    public TournamentsPage clearTournamentDescriptionField() {
        page.locator(tournamentDescriptionField).clear();
        return this;
    }

    public TournamentsPage fillTournamentDescription(String tournamentDescription) {
        page.locator(tournamentDescriptionField).fill(tournamentDescription);
        return this;
    }

    public TournamentsPage clearSponsorField() {
        page.locator(sponsorField).clear();
        return this;
    }

    public TournamentsPage fillSponsor(String sponsor) {
        page.locator(sponsorField).fill(sponsor);
        return this;
    }

    public TournamentsPage uploadSponsorLogo() {
        Locator sponsorLogo = page.locator(sponsorLogoField);
        sponsorLogo.setInputFiles(Paths.get("src/main/resources/club_image.png"));
        return this;
    }

    public TournamentsPage clearPrizeField() {
        page.locator(prizeField).clear();
        return this;
    }

    public TournamentsPage fillPrize(String prize) {
        page.locator(prizeField).fill(prize);
        return this;
    }

    public TournamentsPage uploadTournamentImage() {
        Locator tournamentImage = page.locator(tournamentImageField);
        tournamentImage.setInputFiles(Paths.get("src/main/resources/club_image.png"));
        return this;
    }

    public TournamentsPage selectNumberOfPlayer() {
        page.locator(tournamentCreateDropdowns).nth(0).click();
        page.keyboard().press("Enter");
        return this;
    }

    public TournamentsPage clearMinPlayerLevelField() {
        page.locator(minPlayerLevelField).clear();
        return this;
    }

    public TournamentsPage fillMinPlayerLevelField(String minPlayerLevel) {
        page.locator(minPlayerLevelField).fill(minPlayerLevel);
        return this;
    }

    public TournamentsPage clearMaxPlayerLevelField() {
        page.locator(maxPlayerLevelField).clear();
        return this;
    }

    public TournamentsPage fillMaxPlayerLevel(String maxPlayerLevel) {
        page.locator(maxPlayerLevelField).fill(maxPlayerLevel);
        return this;
    }

    public TournamentsPage selectTournamentStyleKnockouts() {
        page.locator(tournamentStyleKnockout).click();
        return this;
    }

    public TournamentsPage selectTournamentStyleRoundRobin() {
        page.locator(tournamentStyleRoundRobin).click();
        return this;
    }

    public TournamentsPage clearTermsAndConditionsField() {
        page.locator(termsAndConditionsField).clear();
        return this;
    }

    public TournamentsPage fillTermsAndConditions(String termsAndConditions) {
        page.locator(termsAndConditionsField).fill(termsAndConditions);
        return this;
    }

    public TournamentsPage clearPricePerPlayerField() {
        page.locator(pricePerPlayerField).clear();
        return this;
    }

    public TournamentsPage fillPricePerPlayer(String pricePerPlayer) {
        page.locator(pricePerPlayerField).fill(pricePerPlayer);
        return this;
    }

    public TournamentsPage selectGenderMixed() {
        page.locator(genderMixed).click();
        return this;
    }

    public TournamentsPage selectEventTypeCompetitive() {
        page.locator(eventTypeCompetitive).click();
        return this;
    }

    public TournamentsPage selectEventTypeFriendly() {
        page.locator(eventTypeFriendly).click();
        return this;
    }

    public TournamentsPage selectEventTypePrivate() {
        page.locator(eventTypePrivate).click();
        return this;
    }

    public TournamentsPage selectEventTypePublic() {
        page.locator(eventTypePublic).click();
        return this;
    }

    public TournamentsPage selectStartDate() {
        page.locator(dateFields).nth(0).click();
        page.keyboard().press("Enter");
        return this;
    }

    public TournamentsPage selectEndDate() {
        page.locator(dateFields).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public TournamentsPage selectRegistrationDeadline() {
        page.locator(dateFields).nth(2).click();
        page.keyboard().press("Enter");
        return this;
    }

    public TournamentsPage selectAllowedCourts(int courtsToSelect) {
        page.locator(scheduleCourtsDropdowns).nth(0).click();
        Locator options = page.locator(courtOptions);
        int count = options.count();

        int toSelect = Math.min(count, courtsToSelect);

        for (int i = 0; i < toSelect; i++) {
            options.nth(i).click();
        }

        return this;
    }

    public TournamentsPage selectAllowedDays(List<String> daysToSelect) {
        List<String> allDays = Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"
        );

        page.locator(tournamentCreateDropdowns).nth(3).click();

        for (String day : daysToSelect) {
            int index = allDays.indexOf(day);
            if (index == -1) {
                throw new IllegalArgumentException("Invalid day: " + day);
            }

            for (int i = 0; i < index; i++) {
                page.keyboard().press("ArrowDown");
            }
            page.keyboard().press("Enter");
        }

        return this;
    }

    public TournamentsPage selectStartTime() {
        page.locator(startTime).fill("06:00");
        return this;
    }

    public TournamentsPage selectEndTime() {
        page.locator(endTime).fill("23:00");
        return this;
    }

    public TournamentsPage selectMatchDuration() {
        page.locator(scheduleCourtsDropdowns).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public TournamentsPage setPerMatchOne() {
        page.locator(setPerMatchOne).click();
        return this;
    }

    public TournamentsPage selectCourtsWithDateIncrement(int maxIncrementDays) {
        for (int day = 0; day <= maxIncrementDays; day++) {
            clickCourtAvailabilityButton();
            page.waitForTimeout(2000);

            String slotsText = page.locator(selectedSlotsCount).nth(2).textContent().trim();
            int toSelect = Integer.parseInt(slotsText.split("/")[1].trim());

            Locator availableCourts = page.locator(allAvailableCourts);
            int totalAvailable = availableCourts.count();
            System.out.println("Available courts: " + totalAvailable);

            if (totalAvailable < toSelect) {
                incrementStartDate();
                incrementEndDate();
                incrementRegistrationDeadline();
                continue;
            }

            int selected = 0;
            while (selected < toSelect) {
                Locator court = page.locator(allAvailableCourts);
                if (court.count() == 0) break;

                court.nth(0).click(new Locator.ClickOptions().setForce(true));
                page.waitForTimeout(1000);
                selected++;
            }
            break;
        }
        return this;
    }

    public TournamentsPage clickAddPlayers() {
        page.locator(addPlayerText).click();
        return this;
    }

    public TournamentsPage clickAddPlayersButton() {
        page.locator(addPlayerButton).click();
        return this;
    }

    public TournamentsPage selectPlayerName() {
        page.locator(addPlayerNameDropdown).click();
        page.locator(playerName).click();
        return this;
    }

    public TournamentsPage selectPaymentMethod() {
        page.locator(paymentMethodDropdown).click();
        page.locator(paymentMethod).click();
        return this;
    }

    public TournamentsPage clickFirstConversation() {
        page.locator(firstConversation).nth(0).click();
        return this;
    }

    public TournamentsPage fillConversationText(String conversationText) {
        page.locator(conversationTextInputField).fill(conversationText);
        return this;
    }

    public TournamentsPage selectJoinTypeSingle() {
        page.locator(joinTypeSingle).click();
        return this;
    }

    public TournamentsPage clickSchedule() {
        page.locator(scheduleText).click();
        return this;
    }

    public TournamentsPage selectNumberOfTopSeatsTwo() {
        page.locator(numberOfTopSeatsDropdown).click();
        page.locator(numberOfTopSeatsTwo).click();
        return this;
    }

    public TournamentsPage clickGenerateGroupsButton() {
        page.locator(generateGroupsButton).click();
        return this;
    }

    public TournamentsPage clickSaveAndNextButton() {
        page.locator(saveAndNextButton).click();
        return this;
    }

    public TournamentsPage setRoundRobinPhaseOneMatchScores(String scoreOne, String scoreTwo) {
        int count = page.locator(editMatchScoreIcon).count();

        for (int i = 0; i < count; i++) {
            page.locator(editMatchScoreIcon).nth(i).click();
            fillMatchScoreOne(scoreOne);
            fillMatchScoreTwo(scoreTwo);
            clickSaveMatchScoreButton();
        }
        return this;
    }

    public TournamentsPage setRoundRobinSemiFinalMatchScores(String scoreOne, String scoreTwo) {
        int count = page.locator(editMatchScoreIcon).count();

        for (int i = 0; i < count; i++) {
            page.locator(editMatchScoreIcon).nth(0).click();
            fillMatchScoreOne(scoreOne);
            fillMatchScoreTwo(scoreTwo);
            clickSaveMatchScoreButton();
        }
        return this;
    }

    public TournamentsPage setRoundRobinFinalMatchScores(String scoreOne, String scoreTwo) {
        setRoundRobinSemiFinalMatchScores(scoreOne, scoreTwo);
        return this;
    }

    public TournamentsPage clickPhaseOneGenerateResultsButton() {
        int count = page.locator(generateResultsButton).count();

        for (int i = 0; i < count; i++) {
            page.locator(generateResultsButton).nth(0).click();
        }
        return this;
    }

    public TournamentsPage clickSemiFinalGenerateResultsButton() {
        page.locator(generateResultsButton).nth(0).click();
        return this;
    }

    public TournamentsPage clickPhaseOneNextButton() {
        page.locator(phaseOneNextButton).click();
        return this;
    }

    public TournamentsPage clickPhaseOneSaveAndNextButton() {
        page.locator(phaseOneSaveAndNextButton).click();
        return this;
    }

    public TournamentsPage selectPaymentDetailsApp() {
        page.locator(tournamentCreateDropdowns).nth(1).click();
        page.locator(paymentDetailsApp).click();
        return this;
    }

    public TournamentsPage editPaymentDetailsApp() {
        page.locator(tournamentCreateDropdowns).nth(1).click();
        page.locator(paymentDetailsApp).nth(1).click();
        return this;
    }

    public TournamentsPage selectAssignOrganizer() {
        page.locator(tournamentCreateDropdowns).nth(2).click();
        page.keyboard().press("Enter");
        return this;
    }

    public TournamentsPage editAssignOrganizer() {
        page.locator(tournamentCreateDropdowns).nth(2).click();
        page.keyboard().press("Enter");
        page.keyboard().press("Enter");
        return this;
    }

    public TournamentsPage clickScheduleCourts() {
        page.locator(scheduleCourtsText).click();
        return this;
    }

    public void setKnockoutMatchScores(String scoreOne, String scoreTwo) {
        List<String> order = List.of("L1", "R1", "F1", "F2");
        Locator rows = page.locator("tbody tr");
        int count = rows.count();

        for (String label : order) {
            for (int i = 0; i < count; i++) {
                String text = rows.nth(i).locator("td").first().locator("p").first().innerText().trim();
                if (text.equals(label)) {
                    Locator editIcon = rows.nth(i).locator(editMatchScoreIcon);
                    if (editIcon.count() == 0) continue;

                    editIcon.click();
                    fillMatchScoreOne(scoreOne);
                    fillMatchScoreTwo(scoreTwo);
                    clickSaveMatchScoreButton();

                    Locator confirmIcon = rows.nth(i).locator(confirmResultIcon);
                    if (confirmIcon.count() > 0) {
                        confirmIcon.click();
                        clickYesToConfirmMatchResult();
                    }
                    break;
                }
            }
        }
    }

    private void incrementStartDate() {
        page.locator(dateFields).nth(0).click();
        page.keyboard().press("ArrowRight");
        page.keyboard().press("Enter");
    }

    private void incrementEndDate() {
        page.locator(dateFields).nth(1).click();
        page.keyboard().press("ArrowRight");
        page.keyboard().press("Enter");
    }

    private void incrementRegistrationDeadline() {
        page.locator(dateFields).nth(2).click();
        page.keyboard().press("ArrowRight");
        page.keyboard().press("Enter");
    }

    public void clickFinalGenerateResultsButton() {
        page.locator(generateResultsButton).nth(0).click();
    }

    public void clickYesToCancelTournament() {
        page.locator(yesButtonToCancelTournament).click();
    }

    public void clickAddPlayerSaveButton() {
        page.locator(addPlayerSaveButton).click();
    }

    public void clickSaveAndPublishButton() {
        page.locator(saveAndPublishButton).click();
    }

    public void clickSaveTournamentButton() {
        page.locator(saveTournamentButton).click();
    }

    public void clickCourtAvailabilityButton() {
        page.locator(checkAvailabilityButton).click();
    }

    public void fillMatchScoreOne(String scoreOne) {
        page.locator(scoreOneInputField).fill(scoreOne);
    }

    public void fillMatchScoreTwo(String scoreTwo) {
        page.locator(scoreTwoInputField).fill(scoreTwo);
    }

    public void clickSaveMatchScoreButton() {
        page.locator(saveMatchScoreButton).click();
    }

    public void clickYesToConfirmMatchResult() {
        page.locator(yesToConfirmMatchResultButton).click();
    }

    public void clickSendIcon() {
        page.locator(sendMessageIcon).click();
    }

    public String sentMessageTextContent() {
        return page.locator(sentMessageText).last().textContent();
    }

    public Locator tournamentCreateSuccessMessageLocator() {
        return page.locator(tournamentCreateSuccessMessage);
    }

    public Locator tournamentEditSuccessMessageLocator() {
        return page.locator(tournamentEditSuccessMessage);
    }

    public Locator cancelTournamentSuccessMessageLocator() {
        return page.locator(cancelTournamentSuccessMessage);
    }

    public Locator addPlayersToTournamentSuccessMessageLocator() {
        return page.locator(addPlayersToTournamentSuccessMessageLocator);
    }

    public Locator scoresUpdateSuccessMessageLocator() {
        return page.locator(scoresUpdateSuccessMessageLocator);
    }
}

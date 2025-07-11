package com.mocion.web.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class LeaguesPage {
    private final Page page;

    public String eventsText = "text='Events'";
    public String leaguesText = "text='Leagues'";
    public String createButton = "role=button[name='Create']";
    public String clubNameDropdown = "select[title='Club name here']";
    public String nameInputField = "input[name='name']";
    public String organizationNameField = "input[name='organizer_name']";
    public String leagueDescriptionField = "input[name='description']";
    public String sponsorField = "input[name='sponsor_ids.0.name']";
    public String sponsorLogoField = "label[for='clubLogo']";
    public String prizeField = "input[name='prize_ids.0.name']";
    public String leagueImageField = "input#trn_image_upload";
    public String numberOfPlayerDropdown = ".react-select__dropdown-indicator";
    public String minPlayerLevelField = "input[name='min_players_level']";
    public String maxPlayerLevelField = "input[name='max_players_level']";
    public String genderMixed = "input[type='radio'][value='Mixed']";
    public String eventTypePublic = "input[type='radio'][value='public']";
    public String eventTypePrivate = "input[type='radio'][value='private']";
    public String termsAndConditionsField = "input[name='terms_and_conditions']";
    public String nextButton = "button.bg-primary.text-white.rounded-full";
    public String pricePerPlayerField = "input[name='price_per_player']";
    public String dateFields = "div.absolute.right-1.top-2 svg";
    public String allowedCourtsDropdown = "div.react-select__indicator.react-select__dropdown-indicator";
    public String courtOptions = ".react-select__option";
    public String allowedDaysDropdown = "div.react-select__indicator.react-select__dropdown-indicator";
    public String startTime = "input[name='start_time']";
    public String endTime = "input[name='end_time']";
    public String setPerMatchOne = "input[type='radio'][value='1']";
    public String matchDuration = "div.react-select__indicator.react-select__dropdown-indicator";
    public String checkAvailabilityButton = "button:text('Check court availibility')";
    public String saveAndPublishButton = "text='Save and publish'";
    public String allAvailableCourts = "span.bg-\\[\\#f3f3f3\\].text-primary";
    public String selectedSlotsCount = "h3.text-primary";
    public String leagueCreateSuccessMessage = "text='Successful.'";
    public String menuIcon = "button[class*='flex']:has(svg)";
    public String addPlayerText = "text='Add Players'";
    public String addPlayerButton = "text='Add Players'";
    public String playerNameDropdownToAdd = "div.react-select.__dropdown-indicator";
    public String joinTypeSingle = "input[type='radio'][value='Single']";
    public String paymentMethodDropdown = "div.react-select.w-full__dropdown-indicator";
    public String paymentMethod = "text='Cash'";
    public String addPlayerSaveButton = "button[type='submit']";
    public String addPlayersToLeagueSuccessMessageLocator = "text='Players were added successfully as League Players'";
    public String chatWithPlayersText = "li:has-text('chat with players')";
    public String firstConversation = ".w-full.flex.px-8";
    public String conversationTextInputField = ".editable.w-full.pt-2";
    public String sendMessageIcon = ".lucide.lucide-send";
    public String sentMessageText = ".flex.flex-col.gap-2.py-2.pr-2";
    public String editLeaguesText = "text='Edit leagues'";
    public String duplicateText = "li:has-text('Duplicate')";
    public String cancelLeagueText = "text=Cancel league";
    public String yesButtonToCancelLeague = "button:has-text('Yes')";
    public String cancelLeagueSuccessMessage = "text='league has been canceled successfully'";
    public String shareWithPlayersText = "text='Share with players'";
    public String mocionIcon = "img.cursor-pointer[src*='logoIcon']";
    public String playerNameDropdownTOShare = "div.__dropdown-indicator";
    public String okButtonToShare = "button.border-primary";

    public LeaguesPage(Page page) {
        this.page = page;
    }

    public LeaguesPage clickEventsFromNavigationBar() {
        page.locator(eventsText).click();
        return this;
    }

    public LeaguesPage clickLeaguesFromNavigationBar() {
        page.locator(leaguesText).click();
        return this;
    }

    public LeaguesPage clickCreateButton() {
        page.locator(createButton).click();
        return this;
    }

    public LeaguesPage selectClubName(String clubName) {
        page.selectOption(clubNameDropdown, clubName);
        return this;
    }

    public LeaguesPage clearLeagueName() {
        page.locator(nameInputField).clear();
        return this;
    }

    public LeaguesPage fillLeagueName(String leagueName) {
        page.locator(nameInputField).fill(leagueName);
        return this;
    }

    public LeaguesPage clearOrganizationName() {
        page.locator(organizationNameField).clear();
        return this;
    }

    public LeaguesPage fillOrganizationName(String organizationName) {
        page.locator(organizationNameField).fill(organizationName);
        return this;
    }

    public LeaguesPage clearLeagueDescription() {
        page.locator(leagueDescriptionField).clear();
        return this;
    }

    public LeaguesPage fillLeagueDescription(String leagueDescription) {
        page.locator(leagueDescriptionField).fill(leagueDescription);
        return this;
    }

    public LeaguesPage clearSponsor() {
        page.locator(sponsorField).clear();
        return this;
    }

    public LeaguesPage fillSponsor(String sponsor) {
        page.locator(sponsorField).fill(sponsor);
        return this;
    }

    public LeaguesPage uploadSponsorLogo() {
        Locator sponsorLogo = page.locator(sponsorLogoField);
        sponsorLogo.setInputFiles(Paths.get("src/main/resources/club_image.png"));
        return this;
    }

    public LeaguesPage clearPrize() {
        page.locator(prizeField).clear();
        return this;
    }

    public LeaguesPage fillPrize(String prize) {
        page.locator(prizeField).fill(prize);
        return this;
    }

    public LeaguesPage uploadLeagueImage() {
        Locator leagueImage = page.locator(leagueImageField);
        leagueImage.setInputFiles(Paths.get("src/main/resources/club_image.png"));
        return this;
    }

    public LeaguesPage selectNumberOfPlayer() {
        page.locator(numberOfPlayerDropdown).click();
        page.keyboard().press("Enter");
        return this;
    }

    public LeaguesPage fillMinPlayerLevelField(String minPlayerLevel) {
        page.locator(minPlayerLevelField).fill(minPlayerLevel);
        return this;
    }

    public LeaguesPage fillMaxPlayerLevelField(String maxPlayerLevel) {
        page.locator(maxPlayerLevelField).fill(maxPlayerLevel);
        return this;
    }

    public LeaguesPage fillPricePerPlayerField(String pricePerPlayer) {
        page.locator(pricePerPlayerField).fill(pricePerPlayer);
        return this;
    }

    public LeaguesPage selectGenderMixed() {
        page.locator(genderMixed).click();
        return this;
    }

    public LeaguesPage selectEventTypePublic() {
        page.locator(eventTypePublic).click();
        return this;
    }

    public LeaguesPage selectEventTypePrivate() {
        page.locator(eventTypePrivate).click();
        return this;
    }

    public LeaguesPage fillTermsAndConditionsField(String termsAndConditions) {
        page.locator(termsAndConditionsField).fill(termsAndConditions);
        return this;
    }

    public LeaguesPage clickNextButton() {
        page.locator(nextButton).click();
        return this;
    }

    public LeaguesPage selectStartDate() {
        page.locator(dateFields).nth(0).click();
        page.keyboard().press("Enter");
        return this;
    }

    public LeaguesPage selectEndDate() {
        page.locator(dateFields).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public LeaguesPage selectRegistrationDeadline() {
        page.locator(dateFields).nth(2).click();
        page.keyboard().press("Enter");
        return this;
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

    public LeaguesPage selectAllowedCourts(int courtsToSelect) {
        page.locator(allowedCourtsDropdown).nth(0).click();
        Locator options = page.locator(courtOptions);
        int count = options.count();

        int toSelect = Math.min(count, courtsToSelect);

        for (int i = 0; i < toSelect; i++) {
            options.nth(i).click();
        }

        return this;
    }

    public LeaguesPage selectAllowedDays(List<String> daysToSelect) {
        List<String> allDays = Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"
        );

        page.locator(allowedDaysDropdown).nth(1).click();

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

    public LeaguesPage selectStartTime() {
        page.locator(startTime).fill("06:00");
        return this;
    }

    public LeaguesPage selectEndTime() {
        page.locator(endTime).fill("22:00");
        return this;
    }

    public LeaguesPage selectMatchDuration() {
        page.locator(matchDuration).nth(2).click();
        page.keyboard().press("Enter");
        return this;
    }

    public LeaguesPage setPerMatchOne() {
        page.locator(setPerMatchOne).click();
        return this;
    }

    public void clickCourtAvailabilityButton() {
        page.locator(checkAvailabilityButton).click();
    }

    public void clickSaveAndPublishButton() {
        page.locator(saveAndPublishButton).click();
    }

    public LeaguesPage selectCourtsWithDateIncrement(int maxIncrementDays) {
        for (int day = 0; day <= maxIncrementDays; day++) {
            clickCourtAvailabilityButton();
            page.waitForTimeout(2000);

            String slotsText = page.locator(selectedSlotsCount).nth(3).textContent().trim();
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

    public LeaguesPage clickMenuIcon() {
        page.locator(menuIcon).nth(4).click();
        return this;
    }

    public LeaguesPage clickAddPlayers() {
        page.locator(addPlayerText).click();
        return this;
    }

    public LeaguesPage clickAddPlayersButton() {
        page.locator(addPlayerButton).click();
        return this;
    }

    public LeaguesPage selectPlayerNameToAdd() {
        page.locator(playerNameDropdownToAdd).click();
        page.keyboard().press("Enter");
        return this;
    }

    public LeaguesPage selectJoinTypeSingle() {
        page.locator(joinTypeSingle).click();
        return this;
    }

    public LeaguesPage selectPaymentMethod() {
        page.locator(paymentMethodDropdown).click();
        page.locator(paymentMethod).click();
        return this;
    }

    public void clickAddPlayerSaveButton() {
        page.locator(addPlayerSaveButton).click();
    }

    public LeaguesPage clickChatWithPlayers() {
        page.locator(chatWithPlayersText).click();
        return this;
    }

    public LeaguesPage clickFirstConversation() {
        page.locator(firstConversation).nth(0).click();
        return this;
    }

    public LeaguesPage fillConversationText(String conversationText) {
        page.locator(conversationTextInputField).fill(conversationText);
        return this;
    }

    public void clickSendIcon() {
        page.locator(sendMessageIcon).click();
    }

    public LeaguesPage clickEditLeagues() {
        page.locator(editLeaguesText).click();
        return this;
    }

    public LeaguesPage clickDuplicate() {
        page.locator(duplicateText).click();
        return this;
    }

    public LeaguesPage clickCancelLeague() {
        page.locator(cancelLeagueText).click();
        return this;
    }

    public LeaguesPage clickShareWithPlayers() {
        page.locator(shareWithPlayersText).click();
        return this;
    }

    public LeaguesPage clickMocionIcon() {
        page.locator(mocionIcon).click();
        return this;
    }

    public LeaguesPage selectPlayerNameToShare() {
        page.locator(playerNameDropdownTOShare).click();
        page.keyboard().press("Enter");
        return this;
    }

    public LeaguesPage clickOkButtonToShare() {
        page.locator(okButtonToShare).click();
        return this;
    }

    public void clickYesToCancelLeague() {
        page.locator(yesButtonToCancelLeague).click();
    }

    public Locator cancelLeagueSuccessMessageLocator() {
        return page.locator(cancelLeagueSuccessMessage);
    }

    public String sentMessageTextContent() {
        return page.locator(sentMessageText).last().textContent();
    }

    public Locator leagueCreateSuccessMessageLocator() {
        return page.locator(leagueCreateSuccessMessage);
    }

    public Locator addPlayersToLeagueSuccessMessageLocator() {
        return page.locator(addPlayersToLeagueSuccessMessageLocator);
    }

    public Locator leagueEditSuccessMessageLocator() {
        return page.locator(leagueCreateSuccessMessage);
    }
}

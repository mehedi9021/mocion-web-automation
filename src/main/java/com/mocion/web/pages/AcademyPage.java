package com.mocion.web.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.Arrays;
import java.util.List;

public class AcademyPage {
    private final Page page;

    public String coachingText = "text='Coaching'";
    public String academyText = "text='Academy'";
    public String createButton = "role=button[name='Create']";
    public String clubNameDropdown = "select[title='Club name here']";
    public String academyCreateDropdowns = ".react-select__dropdown-indicator";
    public String academyNameField = "input[name='name']";
    public String courtTypeIndoor = "text='Indoor'";
    public String courtTypeOutdoor = "text='Outdoor'";
    public String courtTypeRoffed = "text='Roffed'";
    public String courtPrivacyPublic = "text='Public'";
    public String courtPrivacyPrivate = "text='Private'";
    public String registrationPricePerPlayerField = "input[name='registration_price_per_player']";
    public String genderBoth = "input[type='radio'][value='both']";
    public String maximumNumberOfPlayersField = "input[name='max_number_of_players']";
    public String bookingInAppOn = "input[type='radio'][value='true']";
    public String bookingInAppOff = "input[type='radio'][value='false']";
    public String dateFields = "div.absolute.right-1.top-2 svg";
    public String startTimeField = "#react-select-6-input";
    public String endTimeField = ".react-select__value-container";
    public String checkAvailableButton = "button:has-text('check available')";
    public String availableCourt = ".p-2.ml-2.px-4.rounded-lg";
    public String saveAndPublishButton = "button:has-text('save and publish')";
    public String academyCreateSuccessMessage = "text='Successful.'";
    public String coachFieldDropdown = "div.react-select.__indicator";
    public String startTime = "text='12:00 PM'";
    public String endTime = "text='1:00 PM'";
    public String menuIcon = "button:has(svg.w-full.h-auto)";
    public String addPlayerText = "text='Add Players'";
    public String addPlayersDropdown = "div.react-select.__indicator.__dropdown-indicator";
    public String PaymentMethodDropdown = "div.react-select__indicators div.react-select__indicator";
    public String paymentMethodInApp = "text='In app'";
    public String saveButton = "button:has-text('Save')";
    public String addPlayersToAcademySuccessMessage = "text='players were added successfully'";
    public String cancelBookingText = "button:has-text('Cancel Booking')";
    public String yesButtonToCancelBooking = "button:has-text('Yes')";
    public String cancelBookingSuccessMessage = "text='academy was cancelled'";
    public String paymentMethodCreditDebitCard = "text='Credit/Debit card'";
    public String paymentMethodInCash = "text='Cash'";
    public String paymentMethodPaymentLink = "text='Payment Link'";
    public String paymentMethodBankTransfer = "text='Bank transfer'";
    public String duplicateText = "li:has-text('Duplicate')";

    public AcademyPage(Page page) {
        this.page = page;
    }

    public AcademyPage clickCoachingFromNavigationBar() {
        page.locator(coachingText).click();
        return this;
    }

    public AcademyPage clickAcademyEventFromNavigationBar() {
        page.locator(academyText).click();
        return this;
    }

    public AcademyPage selectClubName(String clubName) {
        page.selectOption(clubNameDropdown, clubName);
        return this;
    }

    public AcademyPage clickCreateButton() {
        page.locator(createButton).click();
        return this;
    }

    public AcademyPage fillAcademyName(String academyName) {
        page.locator(academyNameField).fill(academyName);
        return this;
    }

    public AcademyPage selectCourtTypeIndoor() {
        page.locator(academyCreateDropdowns).nth(0).click();
        page.locator(courtTypeIndoor).nth(1).click();
        return this;
    }

    public AcademyPage selectCourtTypeOutdoor() {
        page.locator(academyCreateDropdowns).nth(0).click();
        page.locator(courtTypeOutdoor).click();
        return this;
    }

    public AcademyPage selectCourtTypeRoffed() {
        page.locator(academyCreateDropdowns).nth(0).click();
        page.locator(courtTypeRoffed).click();
        return this;
    }

    public AcademyPage selectCourtPrivacyPublic() {
        page.locator(academyCreateDropdowns).nth(1).click();
        page.locator(courtPrivacyPublic).click();
        return this;
    }

    public AcademyPage selectCourtPrivacyPrivate() {
        page.locator(academyCreateDropdowns).nth(1).click();
        page.locator(courtPrivacyPrivate).click();
        return this;
    }

    public AcademyPage selectCoach() {
        page.locator(coachFieldDropdown).click();
        page.keyboard().press("Enter");
        return this;
    }

    public AcademyPage fillRegistrationPricePerPlayer(String registrationPricePerPlayer) {
        page.locator(registrationPricePerPlayerField).fill(registrationPricePerPlayer);
        return this;
    }

    public AcademyPage fillMaximumNumberOfPlayers(String maximumNumberOfPlayers) {
        page.locator(maximumNumberOfPlayersField).fill(maximumNumberOfPlayers);
        return this;
    }

    public AcademyPage selectGenderBoth() {
        page.locator(genderBoth).click();
        return this;
    }

    public AcademyPage selectBookingInAppOn() {
        page.locator(bookingInAppOn).click();
        return this;
    }

    public AcademyPage selectBookingInAppOff() {
        page.locator(bookingInAppOff).click();
        return this;
    }

    public AcademyPage selectStartDate() {
        page.locator(dateFields).nth(0).click();
        page.keyboard().press("Enter");
        return this;
    }

    public AcademyPage selectEndDate() {
        page.locator(dateFields).nth(1).click();
        page.keyboard().press("ArrowRight");
        page.keyboard().press("ArrowRight");
        page.keyboard().press("ArrowRight");
        page.keyboard().press("Enter");
        return this;
    }

    public AcademyPage selectAllowedDays(List<String> daysToSelect) {
        List<String> allDays = Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"
        );

        page.locator(academyCreateDropdowns).nth(2).click();

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

    public AcademyPage selectStartTime() {
        page.locator(startTimeField).click();
        page.locator(startTime).last().click();
        return this;
    }

    public AcademyPage selectEndTime() throws InterruptedException {
        Thread.sleep(2000);
        page.locator(endTimeField).last().click();
        page.locator(endTime).click();
        return this;
    }

    public AcademyPage clickCheckAvailableButton() {
        page.locator(checkAvailableButton).click();
        return this;
    }

    public AcademyPage selectAvailableCourt() {
        page.locator(availableCourt).nth(3).click();
        return this;
    }

    public AcademyPage clickMenuIcon() {
        page.locator(menuIcon).nth(3).click();
        return this;
    }

    public AcademyPage clickDuplicate() {
        page.locator(duplicateText).click();
        return this;
    }

    public AcademyPage clickAddPlayers() {
        page.locator(addPlayerText).click();
        return this;
    }

    public AcademyPage selectPlayerOneNameToAdd() {
        page.locator(addPlayersDropdown).nth(0).click();
        page.keyboard().press("Enter");
        return this;
    }

    public AcademyPage selectPlayerTwoNameToAdd() {
        page.locator(addPlayersDropdown).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public AcademyPage selectPlayerThreeNameToAdd() {
        page.locator(addPlayersDropdown).nth(2).click();
        page.keyboard().press("Enter");
        return this;
    }

    public AcademyPage selectPlayerFourNameToAdd() {
        page.locator(addPlayersDropdown).nth(3).click();
        page.keyboard().press("Enter");
        return this;
    }

    public AcademyPage selectPlayerFiveNameToAdd() {
        page.locator(addPlayersDropdown).nth(4).click();
        page.keyboard().press("Enter");
        return this;
    }

    public AcademyPage selectPaymentMethodInApp() {
        page.locator(PaymentMethodDropdown).nth(0).click();
        page.locator(paymentMethodInApp).click();
        return this;
    }

    public AcademyPage selectPaymentMethodPaymentLink() {
        page.locator(PaymentMethodDropdown).nth(4).click();
        page.locator(paymentMethodPaymentLink).click();
        return this;
    }

    public AcademyPage selectPaymentMethodCreditDebitCard() {
        page.locator(PaymentMethodDropdown).nth(3).click();
        page.locator(paymentMethodCreditDebitCard).click();
        return this;
    }

    public AcademyPage selectPaymentMethodCash() {
        page.locator(PaymentMethodDropdown).nth(1).click();
        page.locator(paymentMethodInCash).click();
        return this;
    }

    public AcademyPage selectPaymentMethodBankTransfer() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodBankTransfer).click();
        return this;
    }

    public AcademyPage clickCancelBooking() {
        page.locator(cancelBookingText).click();
        return this;
    }

    public void clickYesToCancelBooking() {
        page.locator(yesButtonToCancelBooking).click();
    }

    public void clickSaveButton() {
        page.locator(saveButton).click();
    }

    public void clickSaveAndPublishButton() {
        page.locator(saveAndPublishButton).click();
    }

    public Locator cancelBookingSuccessMessageLocator() {
        return page.locator(cancelBookingSuccessMessage);
    }

    public Locator academyCreateSuccessMessageLocator() {
        return page.locator(academyCreateSuccessMessage);
    }

    public Locator addPlayerToAcademySuccessMessageLocator() {
        return page.locator(addPlayersToAcademySuccessMessage);
    }
}

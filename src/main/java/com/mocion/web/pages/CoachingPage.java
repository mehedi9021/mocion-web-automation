package com.mocion.web.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CoachingPage {
    private final Page page;

    public String coachingText = "text='Coaching'";
    public String clubNameDropdown = "select[title='Club name here']";
    public String menuIcon = "button:has(svg.w-full.h-auto)";
    public String gameWithCoachText = "text='game with the coach'";
    public String cancelBookingText = "text='Cancel Booking'";
    public String cancelWithRefundButton = "text='Cancel with refund'";
    public String cancelWithoutRefundButton = "text='Cancel without refund'";
    public String bookingCancelSuccessMessage = "text='Bookings canceled successfully'";
    public String createButton = "role=button[name='Create']";
    public String coachingCreateDropdowns = "div.react-select.__dropdown-indicator";
    public String totalMatchPriceField = "input[name='owner_price']";
    public String checkScheduleButton = ".bg-primary.p-3.px-2";
    public String levellingSessionOn = "input[type='radio'][value='true']";
    public String minPlayerLevelField = "input[name='min_level']";
    public String maxPlayerLevelField = "input[name='max_level']";
    public String genderBoth = "input[type='radio'][value='Mixed']";
    public String notesField = "textarea[name='notes']";
    public String scheduleField = "div.bg-transparen";
    public String saveButton = "button[type='submit'].bg-primary";
    public String PaymentMethodDropdown = ".react-select__dropdown-indicator";
    public String paymentMethodCreditDebitCard = "text='Credit/Debit card'";
    public String paymentMethodCash = "text='Cash'";
    public String paymentMethodPaymentLink = "text='Payment Link'";
    public String paymentMethodBankTransfer = "text='Bank transfer'";
    public String paymentMethodInApp = "text='In app'";
    public String bookNowButton = "button[type='submit'].bg-primary";
    public String gameWithCoachCreateSuccessMessage = "text='Successful.'";
    public String courtNameDropdown = ".react-select__dropdown-indicator";
    public String coachName = "text='Coach Farah'";

    public CoachingPage(Page page) {
        this.page = page;
    }

    public CoachingPage clickCoachingFromNavigationBar() {
        page.locator(coachingText).click();
        return this;
    }

    public CoachingPage clickGameWithCoachFromNavigationBar() {
        page.locator(gameWithCoachText).click();
        return this;
    }

    public CoachingPage selectClubName(String clubName) {
        page.selectOption(clubNameDropdown, clubName);
        return this;
    }

    public CoachingPage clickMenuIcon() {
        page.locator(menuIcon).nth(3).click();
        return this;
    }

    public CoachingPage clickCancelBooking() {
        page.locator(cancelBookingText).click();
        return this;
    }

    public CoachingPage clickCreateButton() {
        page.locator(createButton).click();
        return this;
    }

    public CoachingPage selectCoachName() {
        page.locator(coachingCreateDropdowns).nth(0).click();
        page.locator(coachName).nth(0).click();
        return this;
    }

    public CoachingPage fillTotalMatchPrice(String totalMatchPrice) {
        page.locator(totalMatchPriceField).fill(totalMatchPrice);
        return this;
    }

    public CoachingPage clickCheckScheduleButton() {
        page.locator(checkScheduleButton).nth(0).click();
        return this;
    }

    public CoachingPage selectCourtName() {
        page.locator(courtNameDropdown).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public CoachingPage selectLevellingSessionOn() {
        page.locator(levellingSessionOn).click();
        return this;
    }

    public CoachingPage fillMinPlayerLevel(String minPlayerLevel) {
        page.locator(minPlayerLevelField).fill(minPlayerLevel);
        return this;
    }

    public CoachingPage fillMaxPlayerLevel(String maxPlayerLevel) {
        page.locator(maxPlayerLevelField).fill(maxPlayerLevel);
        return this;
    }

    public CoachingPage selectGenderBoth() {
        page.locator(genderBoth).click();
        return this;
    }

    public CoachingPage fillNotes(String notes) {
        page.locator(notesField).fill(notes);
        return this;
    }

    public CoachingPage selectSchedule() {
        page.locator(scheduleField).nth(8).click();
        page.locator(scheduleField).nth(8).click();
        return this;
    }

    public CoachingPage clickSaveButton() {
        page.locator(saveButton).nth(1).click();
        return this;
    }

    public CoachingPage selectPlayerOneName() {
        page.locator(coachingCreateDropdowns).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public CoachingPage selectPaymentMethodInApp() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodInApp).click();
        return this;
    }

    public CoachingPage selectPaymentMethodPaymentLink() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodPaymentLink).click();
        return this;
    }

    public CoachingPage selectPaymentMethodCreditDebitCard() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodCreditDebitCard).click();
        return this;
    }

    public CoachingPage selectPaymentMethodCash() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodCash).click();
        return this;
    }

    public CoachingPage selectPaymentMethodBankTransfer() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodBankTransfer).click();
        return this;
    }

    public void clickBookNowButton() {
        page.locator(bookNowButton).click();
    }

    public void clickCancelWithRefundButton() {
        page.locator(cancelWithRefundButton).click();
    }

    public void clickCancelWithoutRefundButton() {
        page.locator(cancelWithoutRefundButton).click();
    }

    public Locator bookingCancelSuccessMessageLocator() {
        return page.locator(bookingCancelSuccessMessage);
    }

    public Locator gameWithCoachCreateSuccessMessageLocator() {
        return page.locator(gameWithCoachCreateSuccessMessage);
    }
}

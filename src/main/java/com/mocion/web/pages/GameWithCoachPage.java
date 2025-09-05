package com.mocion.web.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class GameWithCoachPage {
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
    public String duplicateText = "li:has-text('Duplicate')";
    public String chatWithPlayersText = "li:has-text('chat with players')";
    public String firstConversation = ".w-full.flex.px-8";
    public String conversationTextInputField = ".editable.w-full.pt-2";
    public String sendMessageIcon = ".lucide.lucide-send";
    public String sentMessageText = ".flex.flex-col.gap-2.py-2.pr-2";
    public String editGameWithCoachText = "li.flex:has-text('Edit')";
    public String gameWithCoachEditSuccessMessage = "text='Booking updated successfully'";

    public GameWithCoachPage(Page page) {
        this.page = page;
    }

    public GameWithCoachPage clickCoachingFromNavigationBar() {
        page.locator(coachingText).click();
        return this;
    }

    public GameWithCoachPage clickGameWithCoachFromNavigationBar() {
        page.locator(gameWithCoachText).click();
        return this;
    }

    public GameWithCoachPage selectClubName(String clubName) {
        page.selectOption(clubNameDropdown, clubName);
        return this;
    }

    public GameWithCoachPage clickMenuIcon() {
        page.locator(menuIcon).nth(3).click();
        return this;
    }

    public GameWithCoachPage clickDuplicate() {
        page.locator(duplicateText).click();
        return this;
    }

    public GameWithCoachPage clickCancelBooking() {
        page.locator(cancelBookingText).click();
        return this;
    }

    public GameWithCoachPage clickCreateButton() {
        page.locator(createButton).click();
        return this;
    }

    public GameWithCoachPage selectCoachName() {
        page.locator(coachingCreateDropdowns).nth(0).click();
        page.locator(coachName).nth(0).click();
        return this;
    }

    public GameWithCoachPage editCoachName() {
        page.locator(coachingCreateDropdowns).nth(0).click();
        page.locator(coachName).nth(1).click();
        return this;
    }

    public GameWithCoachPage fillTotalMatchPrice(String totalMatchPrice) {
        page.locator(totalMatchPriceField).fill(totalMatchPrice);
        return this;
    }

    public GameWithCoachPage clickCheckScheduleButton() {
        page.locator(checkScheduleButton).nth(0).click();
        return this;
    }

    public GameWithCoachPage selectCourtName() {
        page.locator(courtNameDropdown).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public GameWithCoachPage selectLevellingSessionOn() {
        page.locator(levellingSessionOn).click();
        return this;
    }

    public GameWithCoachPage fillMinPlayerLevel(String minPlayerLevel) {
        page.locator(minPlayerLevelField).fill(minPlayerLevel);
        return this;
    }

    public GameWithCoachPage fillMaxPlayerLevel(String maxPlayerLevel) {
        page.locator(maxPlayerLevelField).fill(maxPlayerLevel);
        return this;
    }

    public GameWithCoachPage selectGenderBoth() {
        page.locator(genderBoth).click();
        return this;
    }

    public GameWithCoachPage fillNotes(String notes) {
        page.locator(notesField).fill(notes);
        return this;
    }

    public GameWithCoachPage selectSchedule() {
        page.locator(scheduleField).nth(12).click();
        page.locator(scheduleField).nth(12).click();
        return this;
    }

    public GameWithCoachPage clickSaveButton() {
        page.locator(saveButton).nth(1).click();
        return this;
    }

    public GameWithCoachPage selectPlayerOneName() {
        page.locator(coachingCreateDropdowns).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public GameWithCoachPage selectPaymentMethodInApp() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodInApp).click();
        return this;
    }

    public GameWithCoachPage selectPaymentMethodPaymentLink() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodPaymentLink).click();
        return this;
    }

    public GameWithCoachPage selectPaymentMethodCreditDebitCard() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodCreditDebitCard).click();
        return this;
    }

    public GameWithCoachPage selectPaymentMethodCash() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodCash).click();
        return this;
    }

    public GameWithCoachPage selectPaymentMethodBankTransfer() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodBankTransfer).click();
        return this;
    }

    public GameWithCoachPage clickChatWithPlayers() {
        page.locator(chatWithPlayersText).click();
        return this;
    }

    public GameWithCoachPage clickFirstConversation() {
        page.locator(firstConversation).nth(0).click();
        return this;
    }

    public GameWithCoachPage fillConversationText(String conversationText) {
        page.locator(conversationTextInputField).fill(conversationText);
        return this;
    }

    public GameWithCoachPage clickEditGameWithCoach() {
        page.locator(editGameWithCoachText).click();
        return this;
    }

    public void clickSendIcon() {
        page.locator(sendMessageIcon).click();
    }

    public void clickSaveGameWithCoachButton() {
        page.locator(saveButton).click();
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

    public String sentMessageTextContent() {
        return page.locator(sentMessageText).last().textContent();
    }

    public Locator gameWithCoachEditSuccessMessageLocator() {
        return page.locator(gameWithCoachEditSuccessMessage);
    }

    public Locator bookingCancelSuccessMessageLocator() {
        return page.locator(bookingCancelSuccessMessage);
    }

    public Locator gameWithCoachCreateSuccessMessageLocator() {
        return page.locator(gameWithCoachCreateSuccessMessage);
    }
}

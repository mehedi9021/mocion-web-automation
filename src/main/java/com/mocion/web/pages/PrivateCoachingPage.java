package com.mocion.web.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PrivateCoachingPage {
    private final Page page;

    public String coachingText = "text='Coaching'";
    public String clubNameDropdown = "select[title='Club name here']";
    public String menuIcon = "button:has(svg.w-full.h-auto)";
    public String privateCoachingText = "text='Private coaching'";
    public String cancelBookingText = "text='Cancel Booking'";
    public String cancelWithRefundButton = "text='Cancel with refund'";
    public String cancelWithoutRefundButton = "text='Cancel without refund'";
    public String bookingCancelSuccessMessage = "text='Bookings canceled successfully'";
    public String createButton = "role=button[name='Create']";
    public String coachingCreateDropdowns = "div.react-select.__dropdown-indicator";
    public String totalPriceField = "input[name='owner_price']";
    public String notesField = "textarea[name='notes']";
    public String paymentMethodCreditDebitCard = "text='Credit/Debit card'";
    public String paymentMethodCash = "text='Cash'";
    public String paymentMethodPaymentLink = "text='Payment Link'";
    public String paymentMethodBankTransfer = "text='Bank transfer'";
    public String paymentMethodInApp = "text='In app'";
    public String bookNowButton = "button[type='submit'].bg-primary";
    public String privateCoachingCreateSuccessMessage = "text='Successful.'";
    public String courtNameDropdown = ".react-select__dropdown-indicator";
    public String PaymentMethodDropdown = ".react-select__dropdown-indicator";
    public String numberOfPlayersDropdown = ".react-select__dropdown-indicator";
    public String timeSlotsDropdowns = ".react-select__dropdown-indicator";
    public String coachName = "text='new ch'";
    public String duplicateText = "li:has-text('Duplicate')";
    public String chatWithPlayersText = "li:has-text('chat with players')";
    public String firstConversation = ".w-full.flex.px-8";
    public String conversationTextInputField = ".editable.w-full.pt-2";
    public String sendMessageIcon = ".lucide.lucide-send";
    public String sentMessageText = ".flex.flex-col.gap-2.py-2.pr-2";
    public String dateField = "div.absolute.right-1.top-2 svg";
    public String startTimeField = "div.react-select__indicators";
    public String startTime = "text='7:00 PM'";
    public String addGuestPlayerText = "text='Add Guest Player'";

    public PrivateCoachingPage(Page page) {
        this.page = page;
    }

    public PrivateCoachingPage clickCoachingFromNavigationBar() {
        page.locator(coachingText).click();
        return this;
    }

    public PrivateCoachingPage clickPrivateCoachingFromNavigationBar() {
        page.locator(privateCoachingText).click();
        return this;
    }

    public PrivateCoachingPage clickCreateButton() {
        page.locator(createButton).click();
        return this;
    }

    public PrivateCoachingPage selectDate() {
        page.locator(dateField).click();
        page.keyboard().press("ArrowRight");
        page.keyboard().press("Enter");
        return this;
    }

    public PrivateCoachingPage selectStartTime() {
        page.locator(startTimeField).nth(1).click();
        page.locator(startTime).last().click();
        return this;
    }

    public PrivateCoachingPage selectCoachName() {
        page.locator(coachingCreateDropdowns).nth(0).click();
        page.locator(coachName).nth(0).click();
        return this;
    }

    public PrivateCoachingPage selectClubName(String clubName) {
        page.selectOption(clubNameDropdown, clubName);
        return this;
    }

    public PrivateCoachingPage selectCourtName() {
        page.locator(courtNameDropdown).nth(0).click();
        page.keyboard().press("Enter");
        return this;
    }

    public PrivateCoachingPage selectNumberOfPlayers() {
        page.locator(numberOfPlayersDropdown).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public PrivateCoachingPage selectTimeSlots() {
        page.locator(timeSlotsDropdowns).nth(2).click();
        page.keyboard().press("Enter");
        return this;
    }

    public PrivateCoachingPage fillTotalPrice(String totalMatchPrice) {
        page.locator(totalPriceField).fill(totalMatchPrice);
        return this;
    }

    public PrivateCoachingPage fillNotes(String notes) {
        page.locator(notesField).fill(notes);
        return this;
    }

    public PrivateCoachingPage selectPlayerOneName() {
        page.locator(coachingCreateDropdowns).nth(1).click();
        page.keyboard().press("Enter");
        return this;
    }

    public PrivateCoachingPage selectPaymentMethodInApp() {
        page.locator(PaymentMethodDropdown).nth(2).click();
        page.locator(paymentMethodInApp).click();
        return this;
    }

    public PrivateCoachingPage selectPaymentMethodCash() {
        page.locator(PaymentMethodDropdown).nth(3).click();
        page.locator(paymentMethodCash).click();
        return this;
    }

    public void clickBookNowButton() {
        page.locator(bookNowButton).click();
    }

    public Locator privateCoachingCreateSuccessMessageLocator() {
        return page.locator(privateCoachingCreateSuccessMessage);
    }
}

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
    public String bookingCancelSuccessMessage = "text='Bookings canceled successfully'";

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

    public void clickCancelWithRefundButton() {
        page.locator(cancelWithRefundButton).click();
    }

    public Locator bookingCancelSuccessMessageLocator() {
        return page.locator(bookingCancelSuccessMessage);
    }
}

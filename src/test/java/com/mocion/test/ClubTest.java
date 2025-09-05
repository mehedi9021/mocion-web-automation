package com.mocion.test;

import com.mocion.web.pages.ClubPage;
import com.mocion.web.pages.LocationPage;
import com.mocion.web.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.Random;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class ClubTest extends BaseTest {
    public LoginPage loginPage;
    public ClubPage clubPage;
    public Random random;
    public LocationPage locationPage;

    public void initPages() {
        locationPage = new LocationPage(page);
        loginPage = new LoginPage(page);
        clubPage = new ClubPage(page);
        random = new Random();
    }

    @Test(description = "Club create should successful")
    public void verify_club_create_should_succeed() {
        String landline = "+971 111 111 111";
        String aboutClub = "test_club";
        String accountHolderName = "test_account_holder";
        String bankName = "test_bank";
        String accountNumber = "2541524785";
        String iban = "1111 1111 1111 1111";
        String swiftCode = "46654869652";

        initPages();
        int randomNumber = random.nextInt(999) + 1;
        String formattedNumber = String.format("%03d", randomNumber);
        String clubName = "test_club_" + formattedNumber;

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        clubPage
                .clickOrganizationFromLeftNavigation()
                .clickCreateClubButton()
                .fillClubName(clubName)
                .fillMobileNumber(landline)
                .fillAddress()
                .fillAboutClub(aboutClub)
                .selectAmenitiesEquipmentRental()
                .uploadClubLogo()
                .uploadClubImage()
                .clickWorkingDaysDropdown()
                .selectWorkingDays()
                .selectHourFrom()
                .selectHourTo()
                .fillAccountHolderName(accountHolderName)
                .fillBankName(bankName)
                .fillAccountNumber(accountNumber)
                .fillIban(iban)
                .fillSwiftCode(swiftCode)
                .clickSaveButton();

        assertThat(clubPage.getClubCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Club edit should successful")
    public void verify_club_edit_should_succeed() {
        String landline = "+971 111 111 111";
        String aboutClub = "test_club";
        String accountHolderName = "test_account_holder";
        String bankName = "test_bank";
        String accountNumber = "2541524785";
        String iban = "1111 1111 1111 1111";
        String swiftCode = "46654869652";
        String policyHours = "1";
        String aheadLimitDays = "1";
        String maximumBookingsDay = "1";
        String numberOfActiveBookings = "1";

        initPages();
        int randomNumber = random.nextInt(999) + 1;
        String formattedNumber = String.format("%03d", randomNumber);
        String clubName = "test_club_" + formattedNumber;

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        clubPage
                .clickOrganizationFromLeftNavigation()
                .clickMenuIcon()
                .clickEditClubFromMenu()
                .clearClubNameField()
                .clearAddressField()
                .clearAboutClubField()
                .clearClubImage()
                .clearClubLogo()
                .clearCancellationPolicyHoursField()
                .clearBookAheadLimitDaysField()
                .clearNumberOfActiveBookingsField()
                .clearMaximumBookingsDayField()
                .clearAccountHolderNameField()
                .clearBankNameField()
                .clearAccountNumberField()
                .clearIbanField()
                .clearSwiftCodeField()
                .editClubName(clubName)
                .fillMobileNumber(landline)
                .editAddress()
                .fillAboutClub(aboutClub)
                .uploadClubLogo()
                .uploadClubImage()
                .fillCancellationPolicyHours(policyHours)
                .fillBookAheadLimitDays(aheadLimitDays)
                .fillNumberOfActiveBookings(numberOfActiveBookings)
                .fillMaximumBookingsDayField(maximumBookingsDay)
                .editAmenitiesEquipmentRental()
                .fillAccountHolderName(accountHolderName)
                .fillBankName(bankName)
                .fillAccountNumber(accountNumber)
                .fillIban(iban)
                .fillSwiftCode(swiftCode)
                .clickClubSchedule()
                .editWorkingDaysDropdown()
                .editWorkingDays()
                .editHourFrom()
                .editHourTo()
                .clickSaveButton();

        assertThat(clubPage.getClubEditSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Club duplicate should successful")
    public void verify_club_duplicate_should_succeed() {
        initPages();
        int randomNumber = random.nextInt(999) + 1;
        String formattedNumber = String.format("%03d", randomNumber);
        String clubName = "test_club_" + formattedNumber;

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        clubPage
                .clickOrganizationFromLeftNavigation()
                .clickMenuIcon()
                .clickDuplicateClub()
                .clearDuplicateClubNameField()
                .fillClubName(clubName)
                .selectAmenitiesEquipmentRental()
                .clickSaveButton();

        assertThat(clubPage.getClubDuplicateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Club deactivate should successful")
    public void verify_club_deactivate_should_succeed() {
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        clubPage
                .clickOrganizationFromLeftNavigation()
                .clickMenuIcon()
                .clickToDeactivateClub()
                .clickYesToConfirmationTab();

        assertThat(clubPage.getClubDeactivateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Club activate should successful")
    public void verify_club_activate_should_succeed() {
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        clubPage
                .clickOrganizationFromLeftNavigation()
                .clickMenuIcon()
                .clickToActivateClub()
                .clickYesToConfirmationTab();

        assertThat(clubPage.getClubActivateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Club search should successful")
    public void verify_club_search_should_succeed() {
        String searchKeyword = "test_club";

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        clubPage
                .clickOrganizationFromLeftNavigation()
                .clearSearchField()
                .fillSearchKeyword(searchKeyword);

        if (clubPage.getSearchFirstRowResultLocator().isVisible()) {
            assertTrue(clubPage.getSearchFirstRowResult().contains(searchKeyword));
        } else {
            System.out.println("Club search result not found");
        }
    }
}

package com.mocion.test;

import com.mocion.web.pages.CourtsPage;
import com.mocion.web.pages.LocationPage;
import com.mocion.web.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.Random;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class CourtsTest extends BaseTest {
    public LoginPage loginPage;
    public CourtsPage courtsPage;
    public Random random;
    public LocationPage locationPage;

    public void initPages() {
        random = new Random();
        courtsPage = new CourtsPage(page);
        loginPage = new LoginPage(page);
        locationPage = new LocationPage(page);
    }

    @Test(description = "Courts create should successful")
    public void verify_courts_create_should_succeed() {
        initPages();
        int randomNumber = random.nextInt(999) + 1;
        String formattedNumber = String.format("%03d", randomNumber);
        String courtsName = "test_courts_" + formattedNumber;
        String courtsDescription = "test_courts_description";

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        courtsPage
                .clickCourtsFromNavigationBar()
                .clickCreateCourtsButton()
                .fillCourtsName(courtsName)
                .clickCourtTypeDropdown()
                .selectCourtsType()
                .clickCourtSizeDropdown()
                .selectCourtSize()
                .clickPrivacyDropdown()
                .selectPrivacy()
                .fillCourtDescription(courtsDescription)
                .selectWorkingType()
                .clickSaveButton();

        assertThat(courtsPage.getCourtsCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Courts edit should successful")
    public void verify_courts_edit_should_succeed() {
        initPages();
        int randomNumber = random.nextInt(999) + 1;
        String formattedNumber = String.format("%03d", randomNumber);
        String courtsName = "test_courts_" + formattedNumber;
        String courtsDescription = "test_courts_description";

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        courtsPage
                .clickCourtsFromNavigationBar()
                .clickMenuIcon()
                .clickEditCourtButton()
                .clearCourtsNameField()
                .clearCourtsDescriptionField()
                .fillCourtsName(courtsName)
                .clickCourtTypeDropdown()
                .editCourtsType()
                .clickCourtSizeDropdown()
                .editCourtSize()
                .clickPrivacyDropdown()
                .editPrivacy()
                .editCourtsDescriptionField(courtsDescription)
                .clickSaveButton();

        assertThat(courtsPage.getCourtsEditSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Courts duplicate should successful")
    public void verify_courts_duplicate_should_succeed() {
        initPages();
        int randomNumber = random.nextInt(999) + 1;
        String formattedNumber = String.format("%03d", randomNumber);
        String courtsName = "test_courts_" + formattedNumber;

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        courtsPage
                .clickCourtsFromNavigationBar()
                .clickMenuIcon()
                .clickDuplicateCourtButton()
                .clearCourtsNameField()
                .fillCourtsName(courtsName)
                .clickSaveButton();

        assertThat(courtsPage.getCourtsDuplicateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Courts deactivate should successful")
    public void verify_courts_deactivate_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        courtsPage
                .clickCourtsFromNavigationBar()
                .clickMenuIcon()
                .clickDeactivateCourtButton()
                .clickYestToConfirmationTab();

        assertThat(courtsPage.getCourtsDeactivateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Courts activate should successful")
    public void verify_courts_activate_should_succeed() {
        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        courtsPage
                .clickCourtsFromNavigationBar()
                .clickMenuIcon()
                .clickActivateCourtButton()
                .clickYestToConfirmationTab();

        assertThat(courtsPage.getCourtsActivateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Courts search should successful")
    public void verify_courts_search_should_succeed() throws InterruptedException {
        String searchKeyword = "test_courts";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        courtsPage
                .clickCourtsFromNavigationBar()
                .clearSearchField()
                .fillSearchKeyword(searchKeyword);

        Thread.sleep(5000);
        if (courtsPage.getFirstRowSearchResultLocator().isVisible()) {
            assertTrue(courtsPage.getFirstRowSearchResult().contains(searchKeyword));
        } else {
            System.out.println("Courts search result not found");
        }
    }

    @Test(description = "Courts filter should successful")
    public void verify_courts_filter_should_succeed() {
        String searchKeyword = "test_courts";
        String dateFrom = "2025-05-31";
        String dateTo = "2026-05-31";
        String courtDescription = "test_courts_description";

        initPages();
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        courtsPage
                .clickCourtsFromNavigationBar()
                .clickFilterIcon()
                .clickCourtTypeFilterDropdown()
                .selectFilterOptionIndoor()
                .fillDateAddedFrom(dateFrom)
                .fillDateAddedTo(dateTo)
                .clickCourtPrivacyDropdown()
                .selectCourtPrivacy()
                .fillCourtDescriptionFilter(courtDescription)
                .selectAvailability();

        if (courtsPage.getFirstRowSearchResultLocator().isVisible()) {
            assertTrue(courtsPage.getFirstRowSearchResult().contains(searchKeyword));
        } else {
            System.out.println("Courts filter result not found");
        }
    }
}

package com.mocion.test;

import com.mocion.web.pages.LocationPage;
import com.mocion.web.pages.LoginPage;
import com.mocion.web.pages.PricingPage;
import org.testng.annotations.Test;

import java.util.Random;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class PricingTest extends BaseTest {
    public LoginPage loginPage;
    public Random random;
    public PricingPage pricingPage;
    public LocationPage locationPage;

    public void initPages() {
        random = new Random();
        pricingPage = new PricingPage(page);
        loginPage = new LoginPage(page);
        locationPage = new LocationPage(page);
    }

    @Test(description = "Price create should successful")
    public void Price_create_should_succeed() {
        initPages();
        int randomNumber = random.nextInt(999) + 1;
        String formattedNumber = String.format("%03d", randomNumber);
        String priceListName = "test_price_" + formattedNumber;
        String hourlyRate = "50";

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        pricingPage
                .clickGeneralFromNavigationBar()
                .clickPricingFromNavigationBar()
                .clickCreateButton()
                .fillPricingListName(priceListName)
                .clickCourtsDropdown()
                .selectCourt()
                .fillHourlyRateField(hourlyRate)
                .fillStartDateField()
                .fillEndDateField()
                .clickSaveButton();

        assertThat(pricingPage.getPriceListCreateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Configure price should successful")
    public void verify_configure_price_should_succeed() {
        initPages();
        int randomNumber = random.nextInt(999) + 1;
        String formattedNumber = String.format("%03d", randomNumber);
        String priceListName = "test_price_" + formattedNumber;
        String hourlyRate = "50";

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        pricingPage
                .clickGeneralFromNavigationBar()
                .clickPricingFromNavigationBar()
                .clickMenuIcon()
                .clickConfigureButton()
                .clearPricingListName()
                .clearHourlyRateField()
                .fillPricingListName(priceListName)
                .fillHourlyRateField(hourlyRate)
                .fillStartDateField()
                .fillEndDateField()
                .clickSaveButton();

        assertThat(pricingPage.getPriceListEditSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Price duplicate should successful")
    public void verify_price_duplicate_should_succeed() {
        initPages();
        int randomNumber = random.nextInt(999) + 1;
        String formattedNumber = String.format("%03d", randomNumber);
        String priceListName = "test_price_" + formattedNumber;

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        pricingPage
                .clickGeneralFromNavigationBar()
                .clickPricingFromNavigationBar()
                .clickMenuIcon()
                .clickDuplicateButton()
                .clearPricingListName()
                .fillPricingListName(priceListName)
                .clickSaveButton();

        assertThat(pricingPage.getPriceListDuplicateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Price deactivate should successful")
    public void verify_price_deactivate_should_succeed() {
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        pricingPage
                .clickGeneralFromNavigationBar()
                .clickPricingFromNavigationBar()
                .clickMenuIcon()
                .clickDeactivateButton()
                .clickYesToConfirmationTab();

        assertThat(pricingPage.getPriceListDeactivateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Price activate should successful")
    public void verify_price_activate_should_succeed() {
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        pricingPage
                .clickGeneralFromNavigationBar()
                .clickPricingFromNavigationBar()
                .clickMenuIcon()
                .clickActivateButton()
                .clickYesToConfirmationTab();

        assertThat(pricingPage.getPriceListActivateSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Price delete should successful")
    public void verify_price_delete_should_succeed() {
        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        pricingPage
                .clickGeneralFromNavigationBar()
                .clickPricingFromNavigationBar()
                .clickMenuIcon()
                .clickDeleteButton()
                .clickYesToConfirmationTab();

        assertThat(pricingPage.getPriceListDeleteSuccessMessageLocator()).isVisible();
    }

    @Test(description = "Price filter should successful")
    public void verify_price_filter_should_succeed() {
        String searchKeyword = "test_price";
        String dateFrom = "2025-06-01";

        locationPage.setLocationPermissionAllowed();
        loginPage.userLogin();
        pricingPage
                .clickGeneralFromNavigationBar()
                .clickPricingFromNavigationBar()
                .clickFilterIcon()
                .clickStatusDropdown()
                .selectStatusAsActive()
                .selectDateFrom(dateFrom)
                .selectDateTo(dateFrom);

        if (pricingPage.getFirstRowSearchResultLocator().isVisible()) {
            assertTrue(pricingPage.getFirstRowSearchResult().contains(searchKeyword));
        } else {
            System.out.println("Price filter result not found");
        }
    }
}

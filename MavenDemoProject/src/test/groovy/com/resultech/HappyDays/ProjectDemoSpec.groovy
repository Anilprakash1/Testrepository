package com.resultech.HappyDays
import com.resultech.support.Date_Time_settings
import com.resultech.support.ReadEnvironment
import geb.spock.GebReportingSpec
import groovy.util.logging.Log
import pages.CaseSearchPage.CaseSearchResultPage
import pages.CaseSearchPage.ViewHistoryPage
import pages.CensusPage.CensusPage
import pages.CensusPage.FirstLastNameCheckBoxPage
import pages.HomePage.HomePage
import pages.HomePage.RecentActivityPage
import pages.HomePage.SearchCaseNamePage
import pages.LaunchURL.LaunchBaseURL
import pages.LoginPage.LoginPage
import pages.PreLoginPage.PreLogin
import pages.QuoteProfileSingleBenefitPage.AddPrimaryContactPage
import pages.QuoteProfileSingleBenefitPage.QuoteProfileOwnerAssignPage
import pages.QuoteProfileSingleBenefitPage.QuoteProfileSingleBenefitPage
import pages.QuoteSummaryPage.SummaryPreliminaryQuotePage
import pages.QuoteSummaryPage.ViewMemberDetailsPage
import pages.SingleQuoteGenerateProposalPage.SingleQuoteGenerateProposalPage
import pages.SingleQuotePlanSelectionPage.SingleQuotePlanSelectionPage
import pages.SingleQuotePopUpMessagePage.SingleQuotePopUpMessagePage
import pages.SingleQuoteRatesPage.RecipientsPage
import pages.SingleQuoteRatesPage.SingleQuoteRatesPage
import pages.WorkQueuePage.WorkQueuePage

import java.util.logging.Logger
/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 6/28/13
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */

@Log
class ProjectDemoSpec extends GebReportingSpec {
    static Logger log4j = Logger
            .getLogger("com.resultech.connecture");

    Date_Time_settings dts = new Date_Time_settings()
    Properties propEnvDetails


    def setupSpec() {
        clearCookies()
    }

    def setup() {
        ReadEnvironment objReadEnvironment = new ReadEnvironment();
        propEnvDetails = objReadEnvironment.ReadEnvironment();


    }

    def cleanup() {

    }

    def "Defined Benefit quote for small group"() {

        given: "You have broker username and password"
        def LoginUsername = propEnvDetails.getProperty("username")
        def LoginPassword =  propEnvDetails.getProperty("password")
        String pStrCaseName = "Case1st" + System.currentTimeMillis()
        String pStrFutureDate = "07/30/2013"
        String pStrFirstName1 = "Cruz"
        String pStrLastName1 = "Roudabush"
        String pStrGender1 = "2-Male"
        String pStrMonth1 = "12"
        String pStrDate1 = "25"
        String pStrYear1 = "1983"
        String pStrSmoker1 = "Y"
        String pStrSmokingCessation1 = "Y"
        String pStrStatus1 = "1-Active"
        String pStrZipCode1 = "90210"

        String pStrFirstName2 = "Billie"
        String pStrLastName2 = "Tinnes"
        String pStrGender2 = "1-Female"
        String pStrMonth2 = "12"
        String pStrDate2 = "27"
        String pStrYear2 = "1986"
        String pStrSmoker2 = "N"
        String pStrSmokingCessation2 = ""
        String pStrStatus2 = "1-Active"
        String pStrZipCode2 = "90210"

        String pStrFirstName = "Essie"
        String pStrLastName = "Vaill"
        String pStrMiddleName = "A"
        String pStrSuffix = "Jr."
        String pStrTitle = "Grand"
        String pStrContactEmail = "essie@vaill.com"
        String pStrPhoneNo = "907-345-0962"
        when: "Broker logs in"
        to LaunchBaseURL

        then:"Pre login page is displayed"
        at PreLogin
//        String TitleName= propEnvDetails.getProperty("ProductQATitle")
//        verifyPreLoginTitle(TitleName)

        when:"Navigate to login page"
        navLoginPage()
        at LoginPage
//        verifyloginPageTitle(propEnvDetails.getProperty("LoginPageTitle"))
        login(LoginUsername, LoginPassword)

        then: "Verify Home page is displayed"
        at HomePage
//        verifyHomeTitle(propEnvDetails.getProperty("HomePageTitle"))
        verfyWelcomeMessage()
        log4j.info("Logged in  broker name is displayed with welcome message is displayed")

        when:"Navigate to Defined Benefit Quote"
        navToDefinedBenefitQuote()

        then:"Verify Defined Benefit option is displayed"
        verifyQuoteTypePage()
        log4j.info("Defined Benefit option is displayed")

        when:"Select Defined Benefit"
        selectDefinedBenefitQuote()

        then:"Verify Quote Profile page is displayed"
        at QuoteProfileOwnerAssignPage
//        verifyQuoteProfileTitle(propEnvDetails.getProperty("QuoteProfilePageTitle"))
        verifyDetailsInQuoteProfilePage()
        log4j.info("Owner details are displayed")
        at QuoteProfileSingleBenefitPage
        verifyMedicalIsChecked()
        log4j.info("By default Medical option is selected for Product Selection")

        when:
        String pStrZipCode = "90210"
        String pStrState= "CA"
        provideDemographicsDetails(pStrCaseName, "", "", "", "Los Angles", pStrState, pStrZipCode, pStrFutureDate)
        provideEmployeeSummary("2", "2", "2", "0", "0", "0", "0")

        at AddPrimaryContactPage
        AddPrimaryContact(pStrFirstName, pStrMiddleName, pStrLastName, pStrSuffix, pStrTitle, pStrContactEmail, pStrPhoneNo)
        at QuoteProfileSingleBenefitPage
        ContinueButton()
        Thread.sleep(2000)

        then:
        at FirstLastNameCheckBoxPage
//        verifyCensusPageTitle(propEnvDetails.getProperty("CensusPageTitle"))
        VerifyCaseName(pStrCaseName)
        log4j.info(pStrCaseName + " is displayed")

        when:
        selectFirstAndLastName()
        at CensusPage
        provideEmployeeDetails1(pStrFirstName1, pStrLastName1, pStrGender1, pStrMonth1, pStrDate1, pStrYear1, pStrSmoker1, pStrSmokingCessation1, pStrStatus1, pStrZipCode1)
        provideEmployeeDetails2(pStrFirstName2, pStrLastName2, pStrGender2, pStrMonth2, pStrDate2, pStrYear2, pStrSmoker2, pStrSmokingCessation2, pStrStatus2, pStrZipCode2)
        clickContinueButton()

        then:
        at SingleQuotePlanSelectionPage
//        verifyPlansPageTitle(propEnvDetails.getProperty("PlansPage"))
        VerifyCaseName(pStrCaseName)
        log4j.info(pStrCaseName + " is displayed in plans page")

        when:
        at SingleQuotePlanSelectionPage
        String[] pStrValues = verifySingleQuotePage()
        println pStrValues
        clickContinueButton()
        String pStrInsName = pStrValues[0]
        String  pStrDeductable= pStrValues[1]
        String pStrCoinsurance = pStrValues[2]
        String pStrOfficeVisitCopay = pStrValues[3]
        String pStrPharmacy  = pStrValues[4]
        then:
        at SingleQuoteRatesPage
//        verifyRatesPageTitle(propEnvDetails.getProperty("RatesPage"))
        verifyInsuranceName(pStrCaseName, pStrInsName)

        when:
        clickViewMemberRates()

        String Gender1="M"
        String Gender2="F"
        String pStrAge1="29"
        String pStrRelationship1= "Employee"
        String pStrAge2="26"
        String pStrRelationship2= "Employee"
        pStrStatus1
        then:
        String pStrRate1 = verifyEmployee1Detail(pStrFirstName1, pStrLastName1, Gender1, pStrAge1, pStrRelationship1, pStrStatus1)
        String pStrRate2 = verifyEmployee2Detail(pStrFirstName2, pStrLastName2, Gender2, pStrAge2, pStrRelationship2, pStrStatus2)
        log4j.info("Employee details are displayed")

        when:
        clickCloseButton()
        clickContinueButton()
        at RecipientsPage
//        verifyGenerateProposalPageTitle(propEnvDetails.getProperty("GenerateProposalPage"))
        selectEmailOtherAndEnterId("essie@vaill.com")
        at SingleQuoteGenerateProposalPage
        clickSendProposalButton()
        Thread.sleep(2000)
        at SingleQuotePopUpMessagePage

        then:
        verifyPopUp()
        log4j.info("Pop up with text Proposal generation and delivery completed is displayed")

        when:
        ClickOkOnPopUp()
        Thread.sleep(2000)

        then:
        at SummaryPreliminaryQuotePage
//        verifyEffectiveDate(pStrFutureDate,"Bob Broker","2",pStrInsName)
        verifyInsuranceDetails(pStrInsName, pStrDeductable, pStrCoinsurance,pStrOfficeVisitCopay, pStrPharmacy)
        log4j.info("Created by and Select plans are displayed")

        when:
        at ViewMemberDetailsPage
        clickViewMemberRates()

        then:
        verifyEmployee1DetailInSummary(pStrFirstName1,pStrLastName1,Gender1,pStrAge1,pStrRelationship1,pStrStatus1,pStrRate1)
        verifyEmployee2DetailInSummary(pStrFirstName2,pStrLastName2,Gender1,pStrAge2,pStrRelationship2,pStrStatus2,pStrRate2)
        log4j.info("Eligible employees details are displayed")
        when:
        clickCloseButtonInSummaryPage()
        at RecentActivityPage
        navigateToRecentActivities()

        then:
        verifyRecentCaseName(pStrCaseName)
        log4j.info("Case is retrieved in recent activities")

        when:
        at SearchCaseNamePage
        QuickSearchCase(pStrCaseName)

        then:
        at CaseSearchResultPage
//        verifyCaseSearchResultTitle(propEnvDetails.getProperty("CaseSearchPage"))
        String pStrCreatedDate= dts.getCurrentDate("MM/dd/yyyy")
        println pStrCreatedDate
        verifyCaseName(pStrCaseName,pStrState, pStrZipCode,"Prospect",pStrCreatedDate)
        log4j.info("Case summary details are displayed")

        when:
        at ViewHistoryPage
        NavigateToCaseHistory()
        String pStrQuoteNumber = GetQuoteNumber()
        log4j.info("Quote number of case"+pStrCaseName+"is "+pStrQuoteNumber)

        then:
//        VerifyCaseHistory()
//        VerifyCaseHistoryTitle("InsureAdvantage - Case History")

//        when:
        at WorkQueuePage
        ClickWorkQueue()

        then:
        VerifyCaseNameInWorkQueue(pStrCaseName)
        log4j.info("Case is retrieved in work queue page")
    }
}

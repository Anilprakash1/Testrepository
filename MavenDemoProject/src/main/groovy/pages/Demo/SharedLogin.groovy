package Demo


import geb.Page

class WelcomePage extends Page {
    static url =  "http://ia62-qa.ct.com/exemplar/user/Welcome.action"
    static at = { title == "Exemplar - Welcome" }
    static content = {
        LoginLink(to: LoginPage){$("td.sideBarText>a")}
    }
}
class ConnectWelcomeLogin extends Page {
    static at = { title == "Welcome" }
    static content = {
        waitFor {title=="Welcome"}
        assert title=="Welcome"

    }
}


class LoginPage extends Page {
    static at = { title == "Welcome" }

    static content = {
       // results(wait: true) { $("#LoginEdit_username") }

        username { $("#LoginEdit_username") }
        password { $("#LoginEdit_password") }
        LoginButton(to: LoginPage){$("#LoginEdit_login_button")}

    }
}

class ConnectLoginDashboard extends Page {
    static content = {
        waitFor {title=="Dashboard"}

    }
}

class ToActivities extends Page {
    static at = { title == "Dashboard" }
    static content = {
        WelcomeText{$("span.welcome_user")}
        Activities{$("#activities")}
        NewQuote{$("#newQuote")}
        SmallGroup{$("#sgQuote")}
        waitFor {$("#ui-dialog-title-selectQuoteTypeDlg")=="Quote Type" }
        TitleQuote{$("#ui-dialog-title-selectQuoteTypeDlg")}
        DefinedBenefitText{$("p.quotep > label")}
        DefinedBenefit{$("#quoteTypeForm_dcQuoteTRAD")}
        ContinueButton{$("#quoteTypeForm_2")}


    }
}

class QuoteProfilePage extends Page{
    static at = {title == "InsureAdvantage - Quote Profile"}
    static content = {
        QuoteTypeText{$("td.clsPageTitle")}
        CaseName{$("#grpName")}
        DoingBusinessAs{$("#quoteProfileForm_quoteProfile_groupProfile_doingBusinessAs")}
        AddressLine1{$("#quoteProfileForm_quoteProfile_groupProfile_groupAddress1")}
        AddressLine2{$("#quoteProfileForm_quoteProfile_groupProfile_groupAddress2")}
        City{$("#quoteProfileForm_quoteProfile_groupProfile_groupCity")}
        State{$("#group_state")}
        ZIPCode{$("#quoteProfileForm_quoteProfile_quoteZip")}
        EffectiveDate{$(" #quoteProfileForm_quoteProfile_requestedEffectiveDate")}
        TotalEmployer{$("#total_emp")}
        TotalEligible{$("#totalEligibleMedical")}
        EligibleInState{$("#instateEligibleMedical")}
        EligibleOutOfState{$("#outStateEligibleMedical")}
        Cobra{$("#totalCobraMedical")}
        Retirees{$("#totalRetireesMedical")}
        TotalEnrolled{$("#totalEnrolledMedical")}
        AddPrimaryContact{$("span > #quoteProfileForm_ > img")}
        FirstName{$("#quoteProfileForm_quoteProfile_groupProfile_contactFirstName")}
        LastName{$("#quoteProfileForm_quoteProfile_groupProfile_contactLastName")}
        MiddleName{$("#quoteProfileForm_quoteProfile_groupProfile_contactMiddleName")}
        Suffix{$("#quoteProfileForm_quoteProfile_groupProfile_contactSuffix")}
        TitleName{$("#quoteProfileForm_quoteProfile_groupProfile_contactTitle")}
        SelectSameAddress{$("input[name='quoteProfile.groupProfile.sameAddress']")}
        ContactAddress1{$("#quoteProfileForm_quoteProfile_groupProfile_contactAddress1")}
        ContactAddress2{$("#quoteProfileForm_quoteProfile_groupProfile_contactAddress2")}
        ContactCity{$("#quoteProfileForm_quoteProfile_groupProfile_contactCity")}
        ContactState{$("#quoteProfileForm_quoteProfile_groupProfile_contactState")}
        ContactEmail{$("#quoteProfileForm_quoteProfile_groupProfile_contactEmailAddress")}
        ContactZipCode{$("#quoteProfileForm_quoteProfile_groupProfile_contactZip")}
        Producer{$("#producerNameSpan")}
        Agency{$("#agencySpan")}
        ManagingAgency{$("#mgaNameSpan")}
        SalesRep{$("#salesRepNameSpan")}
        ContinueButton{$("#quoteProfileForm_8")}
    }
}

class CensusPage extends Page{
    static at ={title== "InsureAdvantage - Census"}
    static content={
       CaseName{$("td.breakWordHeader")}
        DetailsTab{$("#tab_dataentry > a")}
        Gender1{$("select[name='members[0].genderType']")}
        Month1{$("input[name='members[0].month']")}
        Date1{$("input[name='members[0].day']")}
        Year1{$("input[name='members[0].year']")}
        Smoker1{$("select[name='members[0].displaySmoker']")}
        SmokingCessation1{$("select[name='members[0].displaySmokingCessation']")}
        Status1{$("select[name='members[0].memberStatusKey']")}
        ZipCode1{$("input[name='members[0].zipCode']")}
        Gender2{$("select[name='members[1].genderType']")}
        Month2{$("input[name='members[1].month']")}
        Date2{$("input[name='members[1].day']")}
        Year2{$("input[name='members[1].year']")}
        Smoker2{$("select[name='members[1].displaySmoker']")}
        Status2{$("select[name='members[1].memberStatusKey']")}
        ZipCode2{$("input[name='members[1].zipCode']")}
        ContinueButton{$("#quoteCensusForm_12")}


    }
}
class PlansPage extends Page{
    static at ={title== "InsureAdvantage - Available Plans"}
    static content={
//        MedicalInsList("#tab_Medical")
        CaseName{$("td.breakWordHeader")}
        PPO{$("#Img00")}
        Insurance4{$("input[name='productLines[0].products[0].plans[4].selected']")}
        Insurance3{$("input[name='productLines[0].products[0].plans[3].selected']")}
        AddPlan{$("#addMultiplePlan")}
        CheckAll{$("input[name='checkAll_0']")}
        ComparePlan{$("#plansForm_4")}
        Ins1{$("#compPlanList > table.clsFormTable.0.1")}
        Ins2{$("#compPlanList > table.clsFormTable.0.2")}
        CloseButton{$("#compPlanPanelForm_0")}
        InsName{$("td.leftAlignCell > a")}
        Deductible1{$("tr.tableRowDark > td:nth-child(5)")}
        Coinsurance1{$("tr.tableRowDark > td:nth-child(6)")}
        OfficeVisitCopay1{$("tr.tableRowDark > td:nth-child(7)")}
        Pharmacy1{$("tr.tableRowDark > td:nth-child(8)")}
        ContinueButton{$("#plansForm_14")}

    }
}
class RatesPage extends Page{
    static at ={title== "InsureAdvantage - Rates"}
    static content = {
        CaseName{$("td.breakWordHeader")}
        InsText{$("span.ratesPlanTitle > a")}
        ViewMemberRates{$("div.ratesRight>a")}
        RateTitle{$("#ui-dialog-title-viewMemberRatesDlg")}
        CloseButton{$("div.pageactions > input.btn_primary")}
        ContinueButton{$("#ViewRates_6")}

    }
}
class GenerateProposal extends Page{
     static at ={title== "InsureAdvantage - Generate Proposal"}
    static content = {
        CoverPage{$("")}
        RateSheet{$("#includeRatePage")}
        EstimatedPremiumSummary{$("#includePremiumPage")}
        Census{$("#GenerateProp_includeCensusPage")}
        BenefitsSummaries{$("#GenerateProp_includeBenefitsPage")}
        SummaryofBenefitsandCoverage{$("")}

        SendProposalButton{$("#GenerateProp_12")}
        SavQuoteButton{$("#GenerateProp_10")}
    }
}
class QuoteSummaryPage extends Page{
    static at ={title== "InsureAdvantage - Quote Summary"}
    static content={
        InsName{$("tr.tableRowDark > td:nth-child(1)")}
        Deductible1{$("tr.tableRowDark > td:nth-child(2)")}
        Coinsurance1{$("tr.tableRowDark > td:nth-child(3)")}
        OfficeVisitCopay1{$("tr.tableRowDark > td:nth-child(4)")}
        Pharmacy1{$("tr.tableRowDark > td:nth-child(5)")}
        EstimatedPremium1{$("tr.tableRowDark > td:nth-child(6)")}
        ViewMemberRates{$("tr.tableRowDark > td:last-child")}
        EffectiveDate{$("td.qsRightSide")}
        EmailCheckbox{$("#GenerateProp_emailOther")}
        EMailTextField{$("input[name='emailOtherAddress']")}
        RateTitle{$("#ui-dialog-title-viewMemberRatesDlg")}
        CloseButton{$("div.pageactions > input.btn_primary")}
    }
}
class PopUpMessagePage extends Page{
    static content={
        PopUP{$("#popup_content")}
        PopUpOK{$("#popup_ok")}
        EffectiveDate{$("td.qsRightSide")}
    }
}
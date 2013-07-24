package pages.Demo

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */

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

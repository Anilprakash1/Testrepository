package modules.QuoteProfileSingleBenefitModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 5:54 PM
 * To change this template use File | Settings | File Templates.
 */
class QuoteProfileSingleBenefitModule extends Module{
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


        ContinueButton{$("#quoteProfileForm_8")}
        MedicalCheckBox{$("#quoteProfileForm_quoteProfile_quoteEmployeeSummary_0__selected")}
//        MedicalCheckBox{$("checkbox",name:"quoteProfile.quoteEmployeeSummary[0].selected")}
    }
}

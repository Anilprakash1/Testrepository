package pages.QuoteProfileSingleBenefitPage

import geb.Page
import modules.QuoteProfileSingleBenefitModule.QuoteProfileSingleBenefitModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 6:05 PM
 * To change this template use File | Settings | File Templates.
 */
class QuoteProfileSingleBenefitPage extends Page{

    static content = {
        Module_QuoteProfileSingleBenefitModule{module QuoteProfileSingleBenefitModule}
    }


    def provideDemographicsDetails(pStrCaseName, pStrBusinessAs, pStrAddress1, pStrAddress2, pStrCity, pStrState, pStrZipCode, pStrEffectiveDate ){
        Module_QuoteProfileSingleBenefitModule.CaseName().value pStrCaseName
        Module_QuoteProfileSingleBenefitModule.DoingBusinessAs().value pStrBusinessAs
        Module_QuoteProfileSingleBenefitModule.AddressLine1().value pStrAddress1
        Module_QuoteProfileSingleBenefitModule.AddressLine2().value pStrAddress2
        Module_QuoteProfileSingleBenefitModule.City().value pStrCity
        Module_QuoteProfileSingleBenefitModule.State().value pStrState
        Module_QuoteProfileSingleBenefitModule.ZIPCode().value pStrZipCode
        Module_QuoteProfileSingleBenefitModule.EffectiveDate().value pStrEffectiveDate

    }

    def provideEmployeeSummary(pStrTotalEmployer, pStrTotalEligible,pStrEligibleInState, pStrEligibleOutOfState, pStrCobra, pStrRetirees, pStrTotalEnrolled ){
        Module_QuoteProfileSingleBenefitModule.TotalEmployer().value pStrTotalEmployer
        Module_QuoteProfileSingleBenefitModule.TotalEligible().value pStrTotalEligible
        Module_QuoteProfileSingleBenefitModule.EligibleInState().value pStrEligibleInState
        Module_QuoteProfileSingleBenefitModule.EligibleOutOfState().value pStrEligibleOutOfState
        Module_QuoteProfileSingleBenefitModule.Cobra().value pStrCobra
        Module_QuoteProfileSingleBenefitModule.Retirees().value pStrRetirees
        Module_QuoteProfileSingleBenefitModule.TotalEnrolled().value pStrTotalEnrolled
    }
    def ContinueButton(){
        waitFor{Module_QuoteProfileSingleBenefitModule.ContinueButton.click()}
    }

    def verifyMedicalIsChecked(){
        waitFor{Module_QuoteProfileSingleBenefitModule.MedicalCheckBox.attr('checked')}
    }
}
package pages.QuoteProfilePage

import geb.Page
import modules.QuoteProfileModule.QuoteProfileModule
/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/4/13
 * Time: 7:08 PM
 * To change this template use File | Settings | File Templates.
 */
class QuoteProfilePage extends Page {

    static content={
        Module_QuoteProfilePage{module QuoteProfileModule}
    }

    def individualFamilyOption(){
        Module_QuoteProfilePage.IndividualFamilyPlans.click()
    }

    def fillQuoteProfileFields(EffectiveDate,ZipCode,DOB,Gender,Smoker){
        Module_QuoteProfilePage.RequestedEffectiveDate().value EffectiveDate
        Module_QuoteProfilePage.ZIPCode().value ZipCode
        Module_QuoteProfilePage.PrimaryApplicantDOB().value DOB
        Module_QuoteProfilePage.PrimaryApplicantGender().value Gender
        waitFor(50){
            !Module_QuoteProfilePage.PrimaryApplicantSmokerDisabl.displayed
        }
        Module_QuoteProfilePage.PrimaryApplicantSmoker().value Smoker

    }
    def showPlans(){

        boolean blnresult=false
        Module_QuoteProfilePage.ShowPlans.click()
        waitFor (50){
            title=="InsureAdvantage - Available Plans"
        }
        try{
            assert  title=="InsureAdvantage - Available Plans"
            blnresult=true
            println "Available Plans page is displayed"
        } catch(AssertionError Ae){
            println Ae.stackTrace
            println "Available Plans page is NOT displayed"
        }
          return blnresult

    }

}

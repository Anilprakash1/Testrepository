package pages.HomePage

import geb.Page
import modules.HomeModule.HomeModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/4/13
 * Time: 6:41 PM
 * To change this template use File | Settings | File Templates.
 */
class HomePage extends Page {

    static content = {
        Module_HomeModule { module HomeModule }
        HomeTitle{$("title")}
    }

    def verfyWelcomeMessage() {
        waitFor { Module_HomeModule.welcomeMessage.text() == "Welcome, Bob Broker!"
        }


    }
    def navToQuoteProfilePge() {
        waitFor {
            Module_HomeModule.Activities.click()
            Module_HomeModule.NewQuote.click()
            Module_HomeModule.IndividualFamilyQuote.click()
        }
        //waitFor (50){Module_HomeModule.QuoteProfileTitle.text()=="InsureAdvantage - Quote Profile"}

    }

    def verifyQuoteProfilePge() {

        boolean blnresult = false

        try {
            assert Module_HomeModule.QuoteProfileTitle.text() == "InsureAdvantage - Quote Profile"
            blnresult = true
            println "Quote Profile page is displayed"
        } catch (AssertionError Ae) {
            println Ae.stackTrace
            println "Quote Profile page is NOT displayed"
        }

        return blnresult

    }

    def navToDefinedBenefitQuote() {
        Module_HomeModule.Activities.click()
        waitFor { Module_HomeModule.NewQuote }
        Module_HomeModule.NewQuote.click()
        waitFor { Module_HomeModule.SmallGroup }
        Module_HomeModule.SmallGroup.click()
        waitFor { Module_HomeModule.TitleQuote.text() == "Quote Type" }


    }

    def verifyQuoteTypePage() {
        waitFor { Module_HomeModule.DefinedBenefitText.text() }
        Module_HomeModule.DefinedBenefitText.text() == "Defined Benefit"

    }

    def selectDefinedBenefitQuote() {
        Module_HomeModule.DefinedBenefit.click()
        Module_HomeModule.ContinueButton.click()
    }

    def verifyHomeTitle(pStrHomeTitleName){
              waitFor{HomeTitle.text()==pStrHomeTitleName}
    }
}

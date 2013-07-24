package pages.SingleQuoteGenerateProposalPage

import geb.Page
import modules.SingleQuoteGenerateProposalModule.SingleQuoteGenerateProposalModule


/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 7:58 PM
 * To change this template use File | Settings | File Templates.
 */
class SingleQuoteGenerateProposalPage extends Page{
    static content = {

        Module_SingleQuoteGenerateProposalModule { module SingleQuoteGenerateProposalModule }
    }

    def clickSendProposalButton(){
        Thread.sleep(2000)
        waitFor {Module_SingleQuoteGenerateProposalModule.RateSheet.click()}
        Module_SingleQuoteGenerateProposalModule.EstimatedPremiumSummary.click()
        Module_SingleQuoteGenerateProposalModule.Census.click()
        Module_SingleQuoteGenerateProposalModule.BenefitsSummaries.click()
        Module_SingleQuoteGenerateProposalModule.SendProposalButton.click()
    }
}

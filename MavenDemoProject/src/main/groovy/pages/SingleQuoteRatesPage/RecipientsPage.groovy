package pages.SingleQuoteRatesPage

import geb.Page
import modules.SingleQuoteRatesModule.RecipientsModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/17/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
class RecipientsPage  extends Page{
    static content = {

        Module_RecipientsModule { module RecipientsModule }
        GenerateProposalPageTitle{$("title")}
    }

    def selectEmailOtherAndEnterId(pStrMailId){
        waitFor{Module_RecipientsModule.EmailOtherCheckBox}
        Module_RecipientsModule.EmailOtherCheckBox.click()
        Module_RecipientsModule.EmaiOtherTextBox().value pStrMailId
    }

    def verifyGenerateProposalPageTitle(pStrGenerateProposalPageTitleName){
        waitFor{GenerateProposalPageTitle.text() == pStrGenerateProposalPageTitleName}
    }
}

package pages.QuoteProfileSingleBenefitPage
import geb.Page
import modules.QuoteProfileSingleBenefitModule.QuoteProfileOwnerAssignModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/17/13
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
class QuoteProfileOwnerAssignPage extends Page {
    static content = {
        Module_QuoteProfileOwnerAssignModule { module QuoteProfileOwnerAssignModule }
        QuoteProfileTitle{$("title")}
    }

    def verifyDetailsInQuoteProfilePage(){

//        println Module_QuoteProfileOwnerAssignModule.Producer.text()
//        println Module_QuoteProfileOwnerAssignModule.ManagingAgency.text()
//        println Module_QuoteProfileOwnerAssignModule.SalesRep.text()
//        println Module_QuoteProfileOwnerAssignModule.Agency.text()

        waitFor {Module_QuoteProfileOwnerAssignModule.Producer.text() == "Bob B Broker "}
        waitFor {Module_QuoteProfileOwnerAssignModule.Agency.text() == "AA Agency "}
        waitFor {Module_QuoteProfileOwnerAssignModule.ManagingAgency.text() == "Mga Connecture"}
        waitFor {Module_QuoteProfileOwnerAssignModule.SalesRep.text() == "Sally I Salesinternaluser "}
    }

    def verifyQuoteProfileTitle(pStrQuoteProfileTitleName){
        waitFor{QuoteProfileTitle.text() == pStrQuoteProfileTitleName}
    }
}

package pages.CaseSearchPage
import geb.Page
import modules.CaseSearchModule.ViewHistoryModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/23/13
 * Time: 6:30 PM
 * To change this template use File | Settings | File Templates.
 */
class ViewHistoryPage extends Page{
    static content = {
        Module_ViewHistoryModule { module ViewHistoryModule }
        CaseHistoryTitle{$("title")}

    }

    def NavigateToCaseHistory(){
        waitFor{Module_ViewHistoryModule.ViewButton.click()}
        Module_ViewHistoryModule.CaseHistory.click()
    }

    def VerifyCaseHistoryTitle(pStrCaseHistoryTitleName){
        CaseHistoryTitle.text()== pStrCaseHistoryTitleName
    }

    def VerifyCaseHistory(){
        String pStrCaseCreated =$("table.clsFormTable> tbody > tr:nth-last-child(1) > td:nth-of-type(4)").text()
        println (pStrCaseCreated)
        String pStrEmailDetails = $("table.clsFormTable> tbody > tr:nth-of-type(1) > td:nth-of-type(4)").text()
        println (pStrEmailDetails)

    }
    def String GetQuoteNumber(){
        String pStrQuoteNumber = $("table.clsFormTable> tbody > tr:nth-of-type(1) > td:nth-of-type(1)").text()
        println(pStrQuoteNumber)
        return pStrQuoteNumber
    }
}

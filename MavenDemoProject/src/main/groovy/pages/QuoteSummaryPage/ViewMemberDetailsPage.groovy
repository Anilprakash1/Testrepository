package pages.QuoteSummaryPage
import geb.Page
import modules.QuoteSummaryModule.ViewMemberDetailsModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/23/13
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
class ViewMemberDetailsPage extends Page{
    static content = {
        Module_ViewMemberDetailsModule { module ViewMemberDetailsModule }
    }

    def clickViewMemberRates(){
        waitFor{Module_ViewMemberDetailsModule.ViewMemberRates.click()}
    }

    def  verifyEmployee1DetailInSummary(pStrFirstName1,pStrLastName1,pStrGender1,pStrAge1,pStrRelationship1,pStrStatus1,pStrRate1){
        waitFor{Module_ViewMemberDetailsModule.FirstName1.text()== pStrFirstName1}
        Module_ViewMemberDetailsModule.LastName1.text() == pStrLastName1
        Module_ViewMemberDetailsModule.Gender1.text() == pStrGender1
        Module_ViewMemberDetailsModule.Age1.text() == pStrAge1
        Module_ViewMemberDetailsModule.Relationship1.text() == pStrRelationship1
        Module_ViewMemberDetailsModule.Status1.text() == pStrStatus1
        Module_ViewMemberDetailsModule.Rate1.text()== pStrRate1

    }
    def  verifyEmployee2DetailInSummary(pStrFirstName2,pStrLastName2,pStrGender2,pStrAge2,pStrRelationship2,pStrStatus2,pStrRate2){
        waitFor{Module_ViewMemberDetailsModule.FirstName2.text()== pStrFirstName2}
        Module_ViewMemberDetailsModule.LastName2.text() == pStrLastName2
        Module_ViewMemberDetailsModule.Gender2.text() == pStrGender2
        Module_ViewMemberDetailsModule.Age2.text() == pStrAge2
        Module_ViewMemberDetailsModule.Relationship2.text() == pStrRelationship2
        Module_ViewMemberDetailsModule.Status2.text() == pStrStatus2
        Module_ViewMemberDetailsModule.Rate2.text() == pStrRate2
    }

    def clickCloseButtonInSummaryPage(){
        Module_ViewMemberDetailsModule.CloseButton.click()
        Thread.sleep(2000)
    }
}

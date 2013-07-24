package pages.CensusPage
import geb.Page
import modules.CensusModule.FirstLastNameCheckBoxModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/17/13
 * Time: 12:24 PM
 * To change this template use File | Settings | File Templates.
 */
class FirstLastNameCheckBoxPage extends Page{
    static content = {
        Module_FirstLastNameCheckBoxModule { module FirstLastNameCheckBoxModule }
        CensusPageTitle {$("title")}

    }

    def VerifyCaseName(pStrCaseName){

       waitFor{Module_FirstLastNameCheckBoxModule.CaseName.text() == pStrCaseName}

    }

    def selectFirstAndLastName(){
        Module_FirstLastNameCheckBoxModule.DetailsTab.click()
        Module_FirstLastNameCheckBoxModule.FirstNameCheckBox.click()
        Module_FirstLastNameCheckBoxModule.LastNameCheckBox.click()

    }

    def verifyCensusPageTitle(pStrCensusPageTitleName){
        waitFor{CensusPageTitle.text() == pStrCensusPageTitleName}
    }
}

package pages.HomePage
import geb.Page
import modules.HomeModule.SearchCaseNameModule
/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/18/13
 * Time: 12:33 PM
 * To change this template use File | Settings | File Templates.
 */
class SearchCaseNamePage  extends Page{
    static content = {
        Module_SearchCaseNameModule { module SearchCaseNameModule }
    }
    def QuickSearchCase(pStrCaseName){
        waitFor{Module_SearchCaseNameModule.QuickSearchBox()}
        Module_SearchCaseNameModule.QuickSearchBox().value  pStrCaseName
        Module_SearchCaseNameModule.QuickSearchButton.click()
    }
}

package pages.CaseSearchPage

import geb.Page
import modules.CaseSearchModule.CaseSearchResultModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/18/13
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
class CaseSearchResultPage extends Page{
    static content = {
        Module_CaseSearchModule { module CaseSearchResultModule }
        CaseSearchResultPageTitle{$("title")}
    }
    def verifyCaseName(pStrCaseName,pStrState, pStrZipCode,pStrProspect,pStrCreatedDate){
        waitFor{Module_CaseSearchModule.CaseName.text() == pStrCaseName}
        $("td",class:"leftAlignCell",text:iContains(pStrState)).displayed
        $("td",class:"leftAlignCell",text:iContains(pStrZipCode)).displayed
        $("td",class:"leftAlignCell",text:iContains(pStrProspect)).displayed
        $("td",class:"leftAlignCell",text:iContains(pStrCreatedDate)).displayed
    }

    def verifyCaseSearchResultTitle(pStrCaseSearchResultTitle){
        waitFor{CaseSearchResultPageTitle.text() == pStrCaseSearchResultTitle}
    }


}

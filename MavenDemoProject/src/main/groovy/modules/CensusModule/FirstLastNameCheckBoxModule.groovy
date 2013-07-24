package modules.CensusModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/17/13
 * Time: 12:23 PM
 * To change this template use File | Settings | File Templates.
 */
class FirstLastNameCheckBoxModule extends Module{
    static content= {
        CaseName{$("td.breakWordHeader")}
        DetailsTab{$("#tab_dataentry > a")}
        FirstNameCheckBox{$("#showFNColOption")}
        LastNameCheckBox{$("#showLNColOption")}
    }
}

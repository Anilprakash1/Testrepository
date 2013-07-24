package modules.CaseSearchModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/23/13
 * Time: 6:28 PM
 * To change this template use File | Settings | File Templates.
 */
class ViewHistoryModule extends Module {
    static content = {
        ViewButton{$("#GroupSearchResult_4")}
        CaseHistory{$("a",text:iContains("Case History"))}

    }
}

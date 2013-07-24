package modules.HomeModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/18/13
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
class SearchCaseNameModule extends Module {
    static content = {
       QuickSearchBox{$("#quickSearchText")}
        QuickSearchButton{$("#quickSearchButton")}
    }
}

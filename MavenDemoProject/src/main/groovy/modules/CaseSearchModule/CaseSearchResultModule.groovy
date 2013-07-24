package modules.CaseSearchModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/18/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
class CaseSearchResultModule extends Module{
    static content = {
       CaseName{$("tr.tableRowDark > td.leftAlignCell")}

    }
}

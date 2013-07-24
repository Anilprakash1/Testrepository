package pages.Demo

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
class PopUpMessagePage extends Page{
    static content={
        PopUP{$("#popup_content")}
        PopUpOK{$("#popup_ok")}
        EffectiveDate{$("td.qsRightSide")}
    }
}
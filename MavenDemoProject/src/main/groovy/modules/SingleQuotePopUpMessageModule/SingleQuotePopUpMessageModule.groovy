package modules.SingleQuotePopUpMessageModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */
class SingleQuotePopUpMessageModule extends Module{
    static content = {
        PopUP{$("#popup_content")}
        PopUpOK{$("#popup_ok")}


    }
}

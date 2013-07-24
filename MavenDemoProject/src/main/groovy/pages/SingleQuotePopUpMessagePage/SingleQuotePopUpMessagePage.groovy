package pages.SingleQuotePopUpMessagePage

import geb.Page
import modules.SingleQuotePopUpMessageModule.SingleQuotePopUpMessageModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 8:04 PM
 * To change this template use File | Settings | File Templates.
 */
class SingleQuotePopUpMessagePage extends Page{
    static content = {

        Module_SingleQuotePopUpMessageModule { module SingleQuotePopUpMessageModule }


    }

    def verifyPopUp(){
        waitFor{Module_SingleQuotePopUpMessageModule.PopUP.text()== "Proposal generation and delivery completed."}

    }

    def ClickOkOnPopUp(){
        Module_SingleQuotePopUpMessageModule.PopUpOK.click()
    }

}

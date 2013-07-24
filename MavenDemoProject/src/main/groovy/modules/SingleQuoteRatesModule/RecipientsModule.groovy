package modules.SingleQuoteRatesModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/17/13
 * Time: 5:01 PM
 * To change this template use File | Settings | File Templates.
 */
class RecipientsModule extends Module{
    static content = {
        EmailOtherCheckBox{$("#GenerateProp_emailOther")}
        EmaiOtherTextBox{$("input[name='emailOtherAddress']")}
    }
}

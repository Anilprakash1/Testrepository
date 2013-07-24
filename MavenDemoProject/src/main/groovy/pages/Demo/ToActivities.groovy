package pages.Demo

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
class ToActivities extends Page {
    static at = { title == "Dashboard" }
    static content = {
        WelcomeText{$("span.welcome_user")}
        Activities{$("#activities")}
        NewQuote{$("#newQuote")}
        SmallGroup{$("#sgQuote")}
        waitFor {$("#ui-dialog-title-selectQuoteTypeDlg")=="Quote Type" }
        TitleQuote{$("#ui-dialog-title-selectQuoteTypeDlg")}
        DefinedBenefitText{$("p.quotep > label")}
        DefinedBenefit{$("#quoteTypeForm_dcQuoteTRAD")}
        ContinueButton{$("#quoteTypeForm_2")}


    }
}

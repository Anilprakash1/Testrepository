package modules.HomeModule
import geb.Module


/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/4/13
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
class HomeModule extends Module {
    static at = { title == "Dashboard" }
    static content = {
        Activities{$("#activities")}
        NewQuote{$("#newQuote")}

        IndividualFamilyQuote{$("#ifpQuote")}
        QuoteProfileTitle{$("title")}
//        WelcomeText{$("span.welcome_user")}
        SmallGroup{$("#sgQuote")}
        TitleQuote{$("#ui-dialog-title-selectQuoteTypeDlg")}
        DefinedBenefitText{$("p.quotep > label")}
        DefinedBenefit{$("#quoteTypeForm_dcQuoteTRAD")}
        ContinueButton{$("#quoteTypeForm_2")}
        WelcomeText{$("span.welcome_user")}
        welcomeMessage{$("span.welcome_user")}
    }
}

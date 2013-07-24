package pages.Demo

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 3:40 PM
 * To change this template use File | Settings | File Templates.
 */
class RatesPage extends Page{
    static at ={title== "InsureAdvantage - Rates"}
    static content = {
        CaseName{$("td.breakWordHeader")}
        InsText{$("span.ratesPlanTitle > a")}
        ViewMemberRates{$("div.ratesRight>a")}
        RateTitle{$("#ui-dialog-title-viewMemberRatesDlg")}
        CloseButton{$("div.pageactions > input.btn_primary")}
        ContinueButton{$("#ViewRates_6")}

    }
}
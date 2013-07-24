package pages.Demo

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 3:41 PM
 * To change this template use File | Settings | File Templates.
 */
class QuoteSummaryPage extends Page{
    static at ={title== "InsureAdvantage - Quote Summary"}
    static content={
        InsName{$("tr.tableRowDark > td:nth-child(1)")}
        Deductible1{$("tr.tableRowDark > td:nth-child(2)")}
        Coinsurance1{$("tr.tableRowDark > td:nth-child(3)")}
        OfficeVisitCopay1{$("tr.tableRowDark > td:nth-child(4)")}
        Pharmacy1{$("tr.tableRowDark > td:nth-child(5)")}
        EstimatedPremium1{$("tr.tableRowDark > td:nth-child(6)")}
        ViewMemberRates{$("tr.tableRowDark > td:last-child")}
        EffectiveDate{$("td.qsRightSide")}
        EmailCheckbox{$("#GenerateProp_emailOther")}
        EMailTextField{$("input[name='emailOtherAddress']")}
        RateTitle{$("#ui-dialog-title-viewMemberRatesDlg")}
        CloseButton{$("div.pageactions > input.btn_primary")}
    }
}
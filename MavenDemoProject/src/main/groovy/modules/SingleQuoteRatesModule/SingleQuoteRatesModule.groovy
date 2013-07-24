package modules.SingleQuoteRatesModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
class SingleQuoteRatesModule extends Module{
    static content = {
        CaseName{$("td.breakWordHeader")}
        InsText{$("span.ratesPlanTitle > a")}
        ViewMemberRates{$("div.ratesRight>a")}
        RateTitle{$("#ui-dialog-title-viewMemberRatesDlg")}
        CloseButton{$("div.pageactions > input.btn_primary")}
        ContinueButton{$("#ViewRates_6")}
        FirstName1{$("tr",id:"memberRow_seq1_64").find("td:nth-child(2)")}
        LastName1{$("tr",id:"memberRow_seq1_64").find("td:nth-child(3)")}
        Gender1{$("tr",id:"memberRow_seq1_64").find("td:nth-child(4)")}
        Age1{$("tr",id:"memberRow_seq1_64").find("td:nth-child(5)")}
        Relationship1{$("tr",id:"memberRow_seq1_64").find("td:nth-child(6)")}
        Status1{$("tr",id:"memberRow_seq1_64").find("td:nth-child(7)")}
        Rate1{$("tr",id:"memberRow_seq1_64").find("td:nth-child(8)")}
        FirstName2{$("tr",id:"memberRow_seq2_64").find("td:nth-child(2)")}
        LastName2{$("tr",id:"memberRow_seq2_64").find("td:nth-child(3)")}
        Gender2{$("tr",id:"memberRow_seq2_64").find("td:nth-child(4)")}
        Age2{$("tr",id:"memberRow_seq2_64").find("td:nth-child(5)")}
        Relationship2{$("tr",id:"memberRow_seq2_64").find("td:nth-child(6)")}
        Status2{$("tr",id:"memberRow_seq2_64").find("td:nth-child(7)")}
        Rate2{$("tr",id:"memberRow_seq2_64").find("td:nth-child(8)")}

    }
}

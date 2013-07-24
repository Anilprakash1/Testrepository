package modules.QuoteSummaryModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/23/13
 * Time: 3:46 PM
 * To change this template use File | Settings | File Templates.
 */
class ViewMemberDetailsModule extends Module{
    static content = {

    ViewMemberRates{$("a",text:iContains("View Member Rates"))}
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
        CloseButton{$("div.pageactions > input.btn_primary")}
}
}
package modules.QuoteProfileSingleBenefitModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/17/13
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */
class QuoteProfileOwnerAssignModule extends Module{
    static content = {

//    Producer{$("span",id:"producerNameSpan")}
//    Agency{$("span",id:"agencySpan")}
//    ManagingAgency{$("span",id:"mgaNameSpan")}
//    SalesRep{$("span",id:"salesRepNameSpan")}
        Producer{$("#producerNameSpan")}
        Agency{$("#agencySpan")}
        ManagingAgency{$("#mgaNameSpan")}
        SalesRep{$("#salesRepNameSpan")}
    }
}

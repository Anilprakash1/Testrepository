package pages.QuoteSummaryPage

import geb.Page
import modules.QuoteSummaryModule.SummaryPreliminaryQuoteModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/18/13
 * Time: 12:04 PM
 * To change this template use File | Settings | File Templates.
 */
class SummaryPreliminaryQuotePage extends Page{
    static content = {

        Module_SummaryPreliminaryQuoteModule { module SummaryPreliminaryQuoteModule }

    }
    def verifyEffectiveDate(pStrFutureDate,pStrCreatedByName,pStrEligibleEmployee,pStrSelectedPlan){
        waitFor { Module_SummaryPreliminaryQuoteModule.EffectiveDate.displayed}
        waitFor { Module_SummaryPreliminaryQuoteModule.EffectiveDate.text()== pStrFutureDate}
        waitFor { Module_SummaryPreliminaryQuoteModule.CreatedByName.text()== pStrCreatedByName}
        waitFor { Module_SummaryPreliminaryQuoteModule.EligibleEmployeeNo.text()== pStrEligibleEmployee}
        waitFor { Module_SummaryPreliminaryQuoteModule.SelectedPlan.text()== pStrSelectedPlan}

    }
    def verifyInsNameInSummaryPage(pStrSelectedPlan){
        waitFor { Module_SummaryPreliminaryQuoteModule.SelectedPlan.text()== pStrSelectedPlan}
    }

    def verifyInsuranceDetails(pStrInsName, pStrDeductable, pStrCoinsurance,pStrOfficeVisitCopay, pStrPharmacy){
        waitFor{$("a",id:"quoteSummaryForm_",text:iContains(pStrInsName)).displayed}
        $("td",class:"alignCellCenter",text:iContains(pStrDeductable)).displayed
        $("td",class:"alignCellCenter",text:iContains(pStrCoinsurance)).displayed
        $("td",class:"alignCellCenter",text:iContains(pStrOfficeVisitCopay)).displayed
        $("td",class:"alignCellCenter",text:iContains(pStrPharmacy)).displayed
    }
}

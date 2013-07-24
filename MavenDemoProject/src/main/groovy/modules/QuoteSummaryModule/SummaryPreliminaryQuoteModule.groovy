package modules.QuoteSummaryModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/18/13
 * Time: 12:03 PM
 * To change this template use File | Settings | File Templates.
 */
class SummaryPreliminaryQuoteModule extends Module{
    static content = {
        EffectiveDate{$("td",text:iContains("Requested Effective Date:")).next()}
        CreatedByName{$("td",text:iContains("Created By:")).next()}
        EligibleEmployeeNo{$("td",text:iContains("Eligible Employees:")).next()}
        SelectedPlan{$("a",id:"quoteSummaryForm_",text:iContains("Hip N Trendy Health"))}
    }
}

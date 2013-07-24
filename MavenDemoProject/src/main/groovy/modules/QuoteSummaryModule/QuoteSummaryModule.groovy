package modules.QuoteSummaryModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
class QuoteSummaryModule extends Module{
    static content = {
        SelectPlanInQuoteSummary_One{$("table.clsFormTable>tbody>tr:nth-child(2)>td>input")}
        SelectPlanInQuoteSummary_Apply{$("#QuoteSummaryIfp_14")}

    }

}

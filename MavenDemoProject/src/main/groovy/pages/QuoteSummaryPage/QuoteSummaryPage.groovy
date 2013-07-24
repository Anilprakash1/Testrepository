package pages.QuoteSummaryPage
import geb.Page
import modules.QuoteSummaryModule.QuoteSummaryModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
class QuoteSummaryPage extends Page {
    static  content={
        QuoteSummaryPage_Module{module QuoteSummaryModule}

    }

    def selectPlanInQuoteSummaryPage(){
        QuoteSummaryPage_Module. SelectPlanInQuoteSummary_One.click()
        QuoteSummaryPage_Module.SelectPlanInQuoteSummary_Apply.click()

        waitFor (50){
            title=="InsureAdvantage - Prior to Applying"

        }
    }
}

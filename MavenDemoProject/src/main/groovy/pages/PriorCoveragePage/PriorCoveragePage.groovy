package pages.PriorCoveragePage
import geb.Page
import modules.PriorCoverageModule.PriorCoverageModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 6:41 PM
 * To change this template use File | Settings | File Templates.
 */
class PriorCoveragePage extends Page {

    static content = {
        PriorCoveragePage_Module{module PriorCoverageModule}
    }

    def navigateToPaymentOptionPage(){
        PriorCoveragePage_Module.PriorCoverage_No.click()
        PriorCoveragePage_Module.PriorCoverage_Next.click()

        waitFor(50){
            title=="Payment Options"
        }
    }
}

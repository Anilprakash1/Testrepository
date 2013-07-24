package pages.PlanSelectionPage
import geb.Page
import modules.PlanSelectionModule.PlanSelectionModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 6:33 PM
 * To change this template use File | Settings | File Templates.
 */
class PlanSelectionPage extends Page {

    static content = {

        PlanSelectionPage_Module{module PlanSelectionModule}
    }

    def navPriorCoveragePage(){
        PlanSelectionPage_Module.PlanSelection_SelectPlan.click()
        waitFor (100){
            title=="Plan Selection"
        }

    }


}

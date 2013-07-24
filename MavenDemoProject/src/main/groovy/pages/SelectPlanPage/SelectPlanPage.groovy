package pages.SelectPlanPage
import geb.Page
import modules.SelectPlanModule.SelectPlanModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/4/13
 * Time: 7:59 PM
 * To change this template use File | Settings | File Templates.
 */
class SelectPlanPage extends Page{
    static content={
        SelectPlanPage_Module{module SelectPlanModule}

    }
    def selectPlans(){
        SelectPlanPage_Module.PPO.click()
        SelectPlanPage_Module.Plan1.click()
        SelectPlanPage_Module.Plan2.click()
        SelectPlanPage_Module.SaveQuote .click()
        waitFor (50){title=="InsureAdvantage - Case Profile"}

    }
}

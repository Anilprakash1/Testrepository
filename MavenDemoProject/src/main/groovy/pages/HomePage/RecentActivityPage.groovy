package pages.HomePage

import geb.Page
import modules.HomeModule.RecentActivityModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/18/13
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
class RecentActivityPage extends Page{
    static content = {
        Module_RecentActivityModule { module RecentActivityModule }

    }

    def navigateToRecentActivities(){
        waitFor{Module_RecentActivityModule.Activities.click()}
        waitFor{Module_RecentActivityModule.RecentActivity.click()}
    }
    def verifyRecentCaseName(pStrCaseName) {

        waitFor{Module_RecentActivityModule.CaseName.text() ==pStrCaseName }

    }
}

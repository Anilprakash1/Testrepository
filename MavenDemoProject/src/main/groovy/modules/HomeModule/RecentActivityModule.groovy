package modules.HomeModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/18/13
 * Time: 11:45 AM
 * To change this template use File | Settings | File Templates.
 */
class RecentActivityModule extends Module {

    static content = {
        Activities{$("#activities")}
        RecentActivity{$("#recentActivity")}
        CaseName{$("a > span.activitybigcell")}
    }
}

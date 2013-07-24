package modules.WorkQueueModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/22/13
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
class WorkQueueModule extends Module {
    static content = {

    WorkQueue{$("#workQueue")}
}
}
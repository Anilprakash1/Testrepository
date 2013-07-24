package pages.WorkQueuePage
import geb.Page
import modules.WorkQueueModule.WorkQueueModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/23/13
 * Time: 6:37 PM
 * To change this template use File | Settings | File Templates.
 */
class WorkQueuePage extends Page{
    static content = {
        Module_WorkQueueModule { module WorkQueueModule }
    }

    def ClickWorkQueue(){
        waitFor{Module_WorkQueueModule.WorkQueue.click() }
    }

    def VerifyCaseNameInWorkQueue(pStrCaseName){
        waitFor{$("a",text:iContains(pStrCaseName)).displayed}
    }
}

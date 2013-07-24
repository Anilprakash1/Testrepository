package modules.ApplicationCheckListModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 5:33 PM
 * To change this template use File | Settings | File Templates.
 */
class ApplicationCheckListModule extends Module {

    static content = {
        ApplicationCheckList_Start{$("a.buttonNext>img")}

    }
}

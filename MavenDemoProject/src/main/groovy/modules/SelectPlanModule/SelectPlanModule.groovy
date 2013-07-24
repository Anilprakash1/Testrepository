package modules.SelectPlanModule
import geb.Module


/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/4/13
 * Time: 7:57 PM
 * To change this template use File | Settings | File Templates.
 */
class SelectPlanModule extends Module {

    static content = {
        PPO{$("td.subHeadBlue>a>b")}
        Plan1{$("td.alignCellCenter>input")}
        Plan2{$("tr.tableRowLight>td.alignCellCenter>input")}
        SaveQuote{$("span.icon_save")}

    }
}

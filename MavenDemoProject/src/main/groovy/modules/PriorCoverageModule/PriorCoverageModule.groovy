package modules.PriorCoverageModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 6:41 PM
 * To change this template use File | Settings | File Templates.
 */
class PriorCoverageModule  extends Module {

    static content = {
        PriorCoverage_No{$("#RADIOC8DGC293DD71C954A961")}
        PriorCoverage_Next{$("a.buttonNext>img")}

    }
}
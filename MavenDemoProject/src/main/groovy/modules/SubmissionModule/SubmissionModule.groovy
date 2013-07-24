package modules.SubmissionModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */
class SubmissionModule extends Module{
    static content = {
        Submission_Next{$("a.buttonNext>img")}

    }


}

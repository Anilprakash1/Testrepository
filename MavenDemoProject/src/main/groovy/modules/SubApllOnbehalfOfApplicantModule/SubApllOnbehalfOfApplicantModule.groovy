package modules.SubApllOnbehalfOfApplicantModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
class SubApllOnbehalfOfApplicantModule extends Module{
    static content = {
        SignFN{$("input[name='Application.Signature.First_Name']")}
        SignLN{$("input[name='Application.Signature.Last_Name']")}
        Accept{$("input[name=\"Application.Signature.SBC_Provided\"]")}
        Submit {$("span.appPagerDone>a.buttonDone")}
        ExitApplication_Exit{$("span.appPagerExit>a.buttonExit")}

    }
}

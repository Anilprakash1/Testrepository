package pages.SubApllOnbehalfOfApplicantPage
import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
class SubApllOnbehalfOfApplicantPage extends Page {

    static content={
        SubApllOnbehalfOfApplicantPage_Module{module SubApllOnbehalfOfApplicantModule}
    }

    def   SubApllOnbehalfOfApplicant(FN,LN){
        SubApllOnbehalfOfApplicantPage_Module.SignFN().value FN
        SubApllOnbehalfOfApplicantPage_Module.SignLN().value LN
        SubApllOnbehalfOfApplicantPage_Module.Accept.click()
        SubApllOnbehalfOfApplicantPage_Module.Submit.click()
        waitFor (50){
            SubApllOnbehalfOfApplicantPage_Module. ExitApplication_Exit.displayed
        }

    }

}

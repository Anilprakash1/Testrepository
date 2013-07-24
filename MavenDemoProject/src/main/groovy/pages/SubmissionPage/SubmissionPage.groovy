package pages.SubmissionPage
import geb.Page
import modules.SubmissionModule.SubmissionModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 7:17 PM
 * To change this template use File | Settings | File Templates.
 */
class SubmissionPage extends Page {

    static content = {
        SubmissionPage_Module{module SubmissionModule}
    }

    def navVerfyApplPage(){
        SubmissionPage_Module.Submission_Next.click()

        waitFor(50){
            title=="Verify Application"
        }
    }
}

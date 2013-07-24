package pages.PrimaryApplicantPage
import geb.Page
import  modules.PrimaryApplicantModule.PrimaryApplicantModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 6:03 PM
 * To change this template use File | Settings | File Templates.
 */
class PrimaryApplicantPage extends Page {

    static content = {

        PrimaryApplicantPage_Module{module PrimaryApplicantModule}
    }

    def fillPrimaryApplFields(SSN,maritialStatus){
        PrimaryApplicantPage_Module.PrimaryApplicant_SameAsPrimaryAdd.click()
        PrimaryApplicantPage_Module.PrimaryApplicant_SSN().value SSN
        PrimaryApplicantPage_Module.PrimaryApplicant_MaritalStatus().value maritialStatus
        PrimaryApplicantPage_Module.PrimaryApplicant_Next.click()

        waitFor (50){
            title=="Family Members"
            PrimaryApplicantPage_Module.FamilyMembers_Next.displayed
        }
    }

}

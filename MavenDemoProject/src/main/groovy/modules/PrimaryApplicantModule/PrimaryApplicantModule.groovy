package modules.PrimaryApplicantModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 6:02 PM
 * To change this template use File | Settings | File Templates.
 */
class PrimaryApplicantModule extends Module {

    static content = {
        PrimaryApplicant_SameAsPrimaryAdd{$("#RADIOGG4D3961C28E087B4585")}
        PrimaryApplicant_SSN{$("input[name='Application.Applicant.Ssn']")}
        PrimaryApplicant_MaritalStatus{$("select[name='Application.Applicant.Marital_Status']")}
        PrimaryApplicant_Next{$("a.buttonNext>img")}
        FamilyMembers_Next{$("a.buttonNext>img")}

    }
}

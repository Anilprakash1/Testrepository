package modules.CreateCaseModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
class CreateCaseModule extends Module {

    static content = {
        CaseName{$("input",id:"CaseProfileEditAdd_caseProfileData_caseName",name:"caseProfileData.caseName")}
        CaseFirstName{$("#CaseProfileEditAdd_caseProfileData_contactFirstName")}
        CaseLastName{$("#CaseProfileEditAdd_caseProfileData_contactLastName")}
        continueCase{$("span.icon_next")}

    }
}

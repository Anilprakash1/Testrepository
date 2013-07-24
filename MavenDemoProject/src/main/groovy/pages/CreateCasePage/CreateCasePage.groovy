package pages.CreateCasePage
import geb.Page
import modules.CreateCaseModule.CreateCaseModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
class CreateCasePage extends Page{
    static content={
        CreateCasePage_Module{module  CreateCaseModule }
    }

    def fillCaseProfileFields(CaseNames,CaseFN,CaseLN){

        CreateCasePage_Module.CaseFirstName().value CaseFN
        CreateCasePage_Module.CaseName().value  CaseNames
        CreateCasePage_Module.CaseName().value  CaseNames
        CreateCasePage_Module.CaseLastName().value  CaseLN
        CreateCasePage_Module.continueCase.click()
        waitFor (50){
              title=="InsureAdvantage - Quote Summary"

        }


    }


}

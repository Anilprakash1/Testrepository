package pages.ApplicationCheckListPage
import geb.Page
import modules.ApplicationCheckListModule.ApplicationCheckListModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
class ApplicationCheckListPage extends Page {

    static content = {
        ApplicationCheckListPage_Module{module ApplicationCheckListModule}



    }
    def navigateToPrmryApplPage(){
        ApplicationCheckListPage_Module.ApplicationCheckList_Start.click()
        waitFor (50){
               title== "Primary Applicant"
        }
    }
}
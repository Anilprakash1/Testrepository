package pages.PriorToApplyingPage
import geb.Page
import modules.PriorToApplyingModule.PriorToApplyingModule
import modules.ApplicationCheckListModule.ApplicationCheckListModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 5:00 PM
 * To change this template use File | Settings | File Templates.
 */
class PriorToApplyingPage extends Page{
    static content={
        PriorToApplyingPage_Module{module PriorToApplyingModule}
        ApplicationCheckListPage_Module{module ApplicationCheckListModule}
    }

    def  fillPriorToApplyingFields(Add1,City,PhoneType,PhoneNumber,
                                    Email,ContactMethod,BestContactMethd){

        PriorToApplyingPage_Module.ProrToAppl_Add1().value Add1
        PriorToApplyingPage_Module.ProrToAppl_City ().value City
        PriorToApplyingPage_Module.ProrToAppl_PhoneType().value PhoneType
        PriorToApplyingPage_Module.ProrToAppl_PhoneNumber().value PhoneNumber
        PriorToApplyingPage_Module.ProrToAppl_Email().value Email
        PriorToApplyingPage_Module.ProrToAppl_ContactMethod().value ContactMethod
        PriorToApplyingPage_Module.ProrToAppl_BestContactMethod().value BestContactMethd
        PriorToApplyingPage_Module.ProrToAppl_WhoWillEnter.click()
        PriorToApplyingPage_Module.ProrToAppl_Continue.click()

      /*  waitFor(50){
            title=="Application Checklist"

        }*/


    }
}

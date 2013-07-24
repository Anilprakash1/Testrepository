package pages.CensusPage

import geb.Page
import modules.CensusModule.CensusModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 7:02 PM
 * To change this template use File | Settings | File Templates.
 */
class CensusPage extends Page {
    static content = {

        Module_CensusModule { module CensusModule }


    }


    def provideEmployeeDetails1(pStrFirstName1,pStrLastName1,pStrGender1, pStrMonth1,pStrDate1, pStrYear1, pStrSmoker1, pStrSmokingCessation1, pStrStatus1, pStrZipCode1){
        Module_CensusModule.FirstName1().value pStrFirstName1
        Module_CensusModule.LastName1().value pStrLastName1
        Module_CensusModule.Gender1().value pStrGender1
        Module_CensusModule.Month1().value pStrMonth1
        Module_CensusModule.Date1().value pStrDate1
        Module_CensusModule.Year1().value pStrYear1
        Module_CensusModule.Year1.click()
        Thread.sleep(6000)
        Module_CensusModule.Smoker1().value pStrSmoker1
        Thread.sleep(6000)
        Module_CensusModule.SmokingCessation1().value pStrSmokingCessation1
        Module_CensusModule.Status1().value pStrStatus1
        Module_CensusModule.ZipCode1().value pStrZipCode1
    }
    def provideEmployeeDetails2(pStrFirstName2,pStrLastName2,pStrGender2, pStrMonth2,pStrDate2, pStrYear2, pStrSmoker2, pStrSmokingCessation2, pStrStatus2, pStrZipCode2){
        Module_CensusModule.FirstName2().value pStrFirstName2
        Module_CensusModule.LastName2().value pStrLastName2
        Module_CensusModule.Gender2().value pStrGender2
        Module_CensusModule.Month2().value pStrMonth2
        Module_CensusModule.Date2().value pStrDate2
        Module_CensusModule.Year2().value pStrYear2
        Module_CensusModule.Year2.click()
        //waitFor{Smoker2}
        Thread.sleep(5000)
        Module_CensusModule.Smoker2().value pStrSmoker2
        Module_CensusModule.Status2().value pStrStatus2
        Module_CensusModule.ZipCode2().value pStrZipCode2

    }
    def verifyAgeIsDisplayed(){
        println = Module_CensusModule.Age1.text()
        println = Module_CensusModule.Age2.text()
        String Age1 = Module_CensusModule.Age1().attr('value')
        String Age2 = Module_CensusModule.Age2().attr('value')
    }
    def clickContinueButton(){
        Module_CensusModule.ContinueButton.click()
    }

}
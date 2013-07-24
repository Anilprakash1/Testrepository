package pages.SingleQuoteRatesPage

import geb.Page
import modules.SingleQuoteRatesModule.SingleQuoteRatesModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
class SingleQuoteRatesPage extends Page{
    static content = {

        Module_SingleQuoteRatesModule { module SingleQuoteRatesModule }
        RatesPageTitle{$("title")}
    }
    def verifyInsuranceName(pStrCaseName, pStrInsName){
        waitFor{Module_SingleQuoteRatesModule.CaseName.text() == pStrCaseName}

        waitFor{Module_SingleQuoteRatesModule.InsText.text()== pStrInsName}
     }

    def clickViewMemberRates(){
        waitFor{Module_SingleQuoteRatesModule.ViewMemberRates.click()}
    waitFor{Module_SingleQuoteRatesModule.RateTitle}
    Module_SingleQuoteRatesModule.RateTitle.text()== "Rates"
    Thread.sleep(2000)


}

    def String verifyEmployee1Detail(pStrFirstName1,pStrLastName1,pStrGender1,pStrAge1,pStrRelationship1,pStrStatus1){
        waitFor{Module_SingleQuoteRatesModule.FirstName1.text()== pStrFirstName1}
        Module_SingleQuoteRatesModule.LastName1.text() == pStrLastName1
        Module_SingleQuoteRatesModule.Gender1.text() == pStrGender1
        Module_SingleQuoteRatesModule.Age1.text() == pStrAge1
        Module_SingleQuoteRatesModule.Relationship1.text() == pStrRelationship1
        Module_SingleQuoteRatesModule.Status1.text() == pStrStatus1
        String pStrRate1 = Module_SingleQuoteRatesModule.Rate1.text()
        return pStrRate1
    }
    def String verifyEmployee2Detail(pStrFirstName2,pStrLastName2,pStrGender2,pStrAge2,pStrRelationship2,pStrStatus2){
        waitFor{Module_SingleQuoteRatesModule.FirstName2.text()== pStrFirstName2}
        Module_SingleQuoteRatesModule.LastName2.text() == pStrLastName2
        Module_SingleQuoteRatesModule.Gender2.text() == pStrGender2
        Module_SingleQuoteRatesModule.Age2.text() == pStrAge2
        Module_SingleQuoteRatesModule.Relationship2.text() == pStrRelationship2
        Module_SingleQuoteRatesModule.Status2.text() == pStrStatus2
        String pStrRate2 =Module_SingleQuoteRatesModule.Rate2.text()
        return pStrRate2
    }

    def clickCloseButton(){
        Module_SingleQuoteRatesModule.CloseButton.click()
        Thread.sleep(2000)
    }
    def clickContinueButton(){
        Module_SingleQuoteRatesModule.ContinueButton.click()
    }
     def verifyRatesPageTitle(pStrRatesPageTitleName){
         waitFor{RatesPageTitle.text() == pStrRatesPageTitleName}
     }

}

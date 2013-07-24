package pages.SingleQuotePlanSelectionPage

import geb.Page
import modules.SingleQuotePlanSelectionModule.SingleQuotePlanSelectionModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
class SingleQuotePlanSelectionPage extends Page{
    static content = {

        Module_SingleQuotePlanSelectionModule { module SingleQuotePlanSelectionModule }
         PlansPageTitle{$("title")}

    }
    def VerifyCaseName(pStrCaseName){
        waitFor{Module_SingleQuotePlanSelectionModule.CaseName.text() == pStrCaseName}


    }
    def String[] verifySingleQuotePage(){
        waitFor{Module_SingleQuotePlanSelectionModule}
        Module_SingleQuotePlanSelectionModule.PPO.click()
        Module_SingleQuotePlanSelectionModule.Insurance3.click()
        Module_SingleQuotePlanSelectionModule.AddPlan.click()
        waitFor{Module_SingleQuotePlanSelectionModule.InsName}
        String pStrInsName= Module_SingleQuotePlanSelectionModule.InsName.text()
        String pStrDeductible = Module_SingleQuotePlanSelectionModule.Deductible1.text()
        pStrDeductible = pStrDeductible.trim()
        String pStrCoinsurance = Module_SingleQuotePlanSelectionModule.Coinsurance1.text()
        pStrCoinsurance= pStrCoinsurance.trim()
        String pStrOfficeVisitCopay = Module_SingleQuotePlanSelectionModule.OfficeVisitCopay1.text()
        pStrOfficeVisitCopay = pStrOfficeVisitCopay.trim()
        String pStrPharmacy = Module_SingleQuotePlanSelectionModule.Pharmacy1.text()
        pStrPharmacy = pStrPharmacy.trim()
        pStrInsName= pStrInsName.trim()
//        Module_SingleQuotePlanSelectionModule.ContinueButton.click()
        String[] pStrArrayDetails = new String[5]
        pStrArrayDetails= [pStrInsName, pStrDeductible, pStrCoinsurance,pStrOfficeVisitCopay, pStrPharmacy]
        return   pStrArrayDetails

    }
    def clickContinueButton(){
        Module_SingleQuotePlanSelectionModule.ContinueButton.click()
    }

    def verifyOnlyMedicalTabDisplayed(){

        waitFor{ Module_SingleQuotePlanSelectionModule.Medical.displayed}
         waitFor{!Module_SingleQuotePlanSelectionModule.Dental.displayed}
         waitFor{!Module_SingleQuotePlanSelectionModule.Life.displayed}
         waitFor{!Module_SingleQuotePlanSelectionModule.Vision.displayed}
    }

    def verifyPlansPageTitle(pStrPlansPageTitleName){
        waitFor{PlansPageTitle.text() == pStrPlansPageTitleName }
    }

}

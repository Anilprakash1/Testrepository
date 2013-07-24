package pages.Demo

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
class PlansPage extends Page{
    static at ={title== "InsureAdvantage - Available Plans"}
    static content={
//        MedicalInsList("#tab_Medical")
        CaseName{$("td.breakWordHeader")}
        PPO{$("#Img00")}
        Insurance4{$("input[name='productLines[0].products[0].plans[4].selected']")}
        Insurance3{$("input[name='productLines[0].products[0].plans[3].selected']")}
        AddPlan{$("#addMultiplePlan")}
        CheckAll{$("input[name='checkAll_0']")}
        ComparePlan{$("#plansForm_4")}
        Ins1{$("#compPlanList > table.clsFormTable.0.1")}
        Ins2{$("#compPlanList > table.clsFormTable.0.2")}
        CloseButton{$("#compPlanPanelForm_0")}
        InsName{$("td.leftAlignCell > a")}
        Deductible1{$("tr.tableRowDark > td:nth-child(5)")}
        Coinsurance1{$("tr.tableRowDark > td:nth-child(6)")}
        OfficeVisitCopay1{$("tr.tableRowDark > td:nth-child(7)")}
        Pharmacy1{$("tr.tableRowDark > td:nth-child(8)")}
        ContinueButton{$("#plansForm_14")}

    }
}
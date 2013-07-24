package modules.QuoteProfileModule

import geb.Module
/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/4/13
 * Time: 7:07 PM
 * To change this template use File | Settings | File Templates.
 */
class QuoteProfileModule extends Module {

    static content = {
        IndividualFamilyPlans{$("#QuotingInformation_quotingInformation_coverageTypeIFP")}
        RequestedEffectiveDate{$("#QuotingInformation_effectiveDt")}
        ZIPCode{$("#QuotingInformation_quotingInformation_zipCode")}
        PrimaryApplicantDOB{$("#QuotingInformation_quotingInformation_primaryApplicant_birthDayDate")}
        PrimaryApplicantGender{$("#QuotingInformation_quotingInformation_primaryApplicant_gender")}
        PrimaryApplicantSmoker{$("select[name='quotingInformation.primaryApplicant.tobaccoUse']")}
        PrimaryApplicantSmokerDisabl(required:false){$("select[name='quotingInformation.primaryApplicant.tobaccoUse'][disabled='disabled']")}
        ShowPlans{$("#QuotingInformation_8")}

    }
}

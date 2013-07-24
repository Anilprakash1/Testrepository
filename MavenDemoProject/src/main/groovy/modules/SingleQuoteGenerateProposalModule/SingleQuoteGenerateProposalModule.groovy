package modules.SingleQuoteGenerateProposalModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 7:57 PM
 * To change this template use File | Settings | File Templates.
 */
class SingleQuoteGenerateProposalModule  extends Module{
    static content = {
        CoverPage{$("")}
        RateSheet{$("#includeRatePage")}
        EstimatedPremiumSummary{$("#includePremiumPage")}
        Census{$("#GenerateProp_includeCensusPage")}
        BenefitsSummaries{$("#GenerateProp_includeBenefitsPage")}
        SummaryofBenefitsandCoverage{$("")}

        SendProposalButton{$("#GenerateProp_12")}
        SavQuoteButton{$("#GenerateProp_10")}
    }
}

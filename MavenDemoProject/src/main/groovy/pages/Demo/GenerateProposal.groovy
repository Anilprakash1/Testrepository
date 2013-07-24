package pages.Demo

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 3:41 PM
 * To change this template use File | Settings | File Templates.
 */
class GenerateProposal extends Page{
    static at ={title== "InsureAdvantage - Generate Proposal"}
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

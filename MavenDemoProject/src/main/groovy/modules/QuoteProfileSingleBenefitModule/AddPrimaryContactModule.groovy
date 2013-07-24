package modules.QuoteProfileSingleBenefitModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/17/13
 * Time: 12:06 PM
 * To change this template use File | Settings | File Templates.
 */
class AddPrimaryContactModule extends Module{
    static content = {
        AddPrimaryContact{$("span > #quoteProfileForm_ > img")}
        FirstName{$("#quoteProfileForm_quoteProfile_groupProfile_contactFirstName")}
        LastName{$("#quoteProfileForm_quoteProfile_groupProfile_contactLastName")}
        MiddleName{$("#quoteProfileForm_quoteProfile_groupProfile_contactMiddleName")}
        Suffix{$("#quoteProfileForm_quoteProfile_groupProfile_contactSuffix")}
        TitleName{$("#quoteProfileForm_quoteProfile_groupProfile_contactTitle")}
        SelectSameAddress{$("input[name='quoteProfile.groupProfile.sameAddress']")}
        ContactAddress1{$("#quoteProfileForm_quoteProfile_groupProfile_contactAddress1")}
        ContactAddress2{$("#quoteProfileForm_quoteProfile_groupProfile_contactAddress2")}
        ContactCity{$("#quoteProfileForm_quoteProfile_groupProfile_contactCity")}
        ContactState{$("#quoteProfileForm_quoteProfile_groupProfile_contactState")}
        ContactEmail{$("#quoteProfileForm_quoteProfile_groupProfile_contactEmailAddress")}
        ContactZipCode{$("#quoteProfileForm_quoteProfile_groupProfile_contactZip")}
        PhoneNo{$("#quoteProfileForm_quoteProfile_groupProfile_phoneNumber1")}
    }
}

package modules.PriorToApplyingModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 4:59 PM
 * To change this template use File | Settings | File Templates.
 */

class PriorToApplyingModule extends Module {

    static content = {
        ProrToAppl_Add1{$("#priorToApplyingForm_priorToApplyingInfo_userProfile_address_addrLine1")}
        ProrToAppl_City{$("#priorToApplyingForm_priorToApplyingInfo_userProfile_address_city")}
        ProrToAppl_PhoneType{$("select[name='priorToApplyingInfo.userProfile.phoneNumbers[0].type']")}
        ProrToAppl_PhoneNumber{$("input[name='priorToApplyingInfo.userProfile.phoneNumbers[0].number']")}
        ProrToAppl_Email{$("input[name='priorToApplyingInfo.userProfile.user.emailAddress']")}
        ProrToAppl_ContactMethod{$("select[name='priorToApplyingInfo.userProfile.preferredContactMethod']")}
        ProrToAppl_BestContactMethod{$("select[name='priorToApplyingInfo.userProfile.bestContactTime']")}
        ProrToAppl_WhoWillEnter{$("#priorToApplyingForm_whoWillStartpaperAppOnline")}
        ProrToAppl_Continue{$("span.appPagerNext>a.buttonNext")}
    }
}
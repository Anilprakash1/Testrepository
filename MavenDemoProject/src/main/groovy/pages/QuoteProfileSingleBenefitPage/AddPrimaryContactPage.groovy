package pages.QuoteProfileSingleBenefitPage

import geb.Page
import modules.QuoteProfileSingleBenefitModule.AddPrimaryContactModule

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/17/13
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
class AddPrimaryContactPage extends Page {
    static content = {
        Module_AddPrimaryContactModule { module AddPrimaryContactModule }
    }
    def AddPrimaryContact(pStrFirstName, pStrMiddleName, pStrLastName,pStrSuffix,pStrTitle, pStrContactEmail, pStrPhoneNo){
        Module_AddPrimaryContactModule.AddPrimaryContact.click()
        Module_AddPrimaryContactModule.FirstName().value pStrFirstName
        Module_AddPrimaryContactModule.MiddleName().value pStrMiddleName
        Module_AddPrimaryContactModule.LastName().value pStrLastName
        Module_AddPrimaryContactModule.TitleName().value pStrTitle
        Module_AddPrimaryContactModule.Suffix().value pStrSuffix
        Module_AddPrimaryContactModule.ContactEmail().value pStrContactEmail
        Module_AddPrimaryContactModule.SelectSameAddress.click()
        Module_AddPrimaryContactModule.PhoneNo().value pStrPhoneNo


    }
}

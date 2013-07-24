package pages.PaymentOptionPage
import geb.Page
import modules.PaymentOptionModule.PaymentOptionModule

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 7:06 PM
 * To change this template use File | Settings | File Templates.
 */
class PaymentOptionPage extends Page {
    static content = {
        PaymentOptionPage_Module{module PaymentOptionModule}
    }
    def fillPaymentOptions(PaymentMode,ReceipntName,Addr,City,State,ZipCode){
        PaymentOption_Method().value PaymentMode
        PaymentOption_ReceipntName().value ReceipntName
        PaymentOption_Addr().value Addr
        PaymentOption_City().value City
        PaymentOption_State().value State
        PaymentOption_ZipCode().value ZipCode
        PaymentOption_Next.click()

        waitFor (50){
            title=="Verify Application"
        }
    }
}

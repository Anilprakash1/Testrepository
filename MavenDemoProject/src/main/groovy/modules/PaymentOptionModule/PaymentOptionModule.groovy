package modules.PaymentOptionModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/5/13
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
class PaymentOptionModule extends Module{
    static content = {
        PaymentOption_Method{$("select[name='Application.Payment_Details.Initial_Method']")}
        PaymentOption_ReceipntName{$("input[name='Application.Initial_Bill.Recipient_Name']")}
        PaymentOption_Addr{$("input[name='Application.Initial_Bill.Billing_Address_1']")}
        PaymentOption_City{$("input[name='Application.Initial_Bill.Billing_City']")}
        PaymentOption_State{$("select[name='Application.Initial_Bill.Billing_State']")}
        PaymentOption_ZipCode{$("input[name='Application.Initial_Bill.Billing_Zip']")}
        PaymentOption_Next{$("a.buttonNext>img")}

    }
}

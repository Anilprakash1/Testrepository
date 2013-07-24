package pages.WelcomePage_EMR

import geb.Page
import modules.WelcomeModule_EMR.WelcomeModule_EMR

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/2/13
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
class WelcomePage_EMR extends Page {

    static url =  "https://emresource-test.emsystem.com/login.jsp"
    //static at = { title == "EMResource ~ Login" }

    static content = {
        mod{module WelcomeModule_EMR}
    }

}

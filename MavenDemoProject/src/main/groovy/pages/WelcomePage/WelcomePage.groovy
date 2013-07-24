package pages.WelcomePage

import geb.Page
/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/2/13
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
class WelcomePage extends Page {

    static url =  "http://iaautoqa62.dyndns.org/exemplar/user/LoginEdit.action"
    static at = { title == "Welcome" }
    static content = {
        LoginLink{$("td.sideBarText>a")}
    }


    def navigateToLoginPage(){
        LoginLink.click()
        waitFor (50){
            title=="Welcome"
        }
    }
}

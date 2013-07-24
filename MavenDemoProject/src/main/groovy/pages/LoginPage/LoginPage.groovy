package pages.LoginPage

import geb.Page
import modules.LoginModule.LoginModule
/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/2/13
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
class LoginPage extends Page {
    static content = {

        theModule { module LoginModule }
        LoginTitle{$("title")}

        }
    def login(username,pwd){

        waitFor{
            theModule.username().value username
            theModule.password().value pwd
            theModule.LoginButton.click()
        }

        //waitFor {theModule.WelcomeText.text() == "Welcome, Bob Broker!"}
        //println("Login Page is displayed")
    }

    def verifyloginPageTitle(pStrLoginTitleName){
        waitFor{LoginTitle.text() == pStrLoginTitleName }
    }

}
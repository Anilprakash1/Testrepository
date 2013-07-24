package pages.LoginPage

import geb.Page
import modules.LoginModule.LoginModule1

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/2/13
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
class LoginPage1 extends Page {
    static content = {

        theModule { module LoginModule1 }
        LoginTitle(wait:true){$("title")}
        //LoginTitle(wait:true){$("select",name:"regionID",id:"regionID")}

        }
    def login(username,pwd){
        theModule.username().value username
        theModule.password().value pwd
        theModule.LoginButton.click()



        assert LoginTitle.text()=="Select Region"
        println("Login Page is displayed")
    }


}
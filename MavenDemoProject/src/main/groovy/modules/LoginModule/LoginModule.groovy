package modules.LoginModule

import geb.Module


/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/2/13
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
class LoginModule extends Module{

    static content = {
        username{$("input",id:"LoginEdit_username")}
        password{$("input",id:"LoginEdit_password")}
        LoginButton(wait:true){$("input",id:"LoginEdit_login_button")}
        WelcomeText{$("span.welcome_user")}
        //LoginTitle{$("title")}
    }

}

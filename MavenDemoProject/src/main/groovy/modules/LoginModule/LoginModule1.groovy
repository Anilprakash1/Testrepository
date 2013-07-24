package modules.LoginModule

import geb.Module


/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/2/13
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
class LoginModule1 extends Module{

    static content = {

        username{$("input",name:"loginName")}
        password{$("input",name:"password")}
        LoginButton{$("input",name:"LoginBtn")}

    }

}

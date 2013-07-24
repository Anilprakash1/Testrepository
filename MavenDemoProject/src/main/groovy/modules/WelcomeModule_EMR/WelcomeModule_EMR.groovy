package modules.WelcomeModule_EMR

import geb.Module
/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/2/13
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
class WelcomeModule_EMR extends Module {
    static content = {
        username{$("input",name:"loginName")}
        password{$("input",name:"password")}
        submit{$("input",name:"LoginBtn")}
    }

}

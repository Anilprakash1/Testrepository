package modules.PreLoginModule
import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/18/13
 * Time: 10:07 AM
 * To change this template use File | Settings | File Templates.
 */
class ReturnToLogin extends Module{
    static content={
               ReturnToLoginLink(wait:true){$("#rLogin")}

    }
}

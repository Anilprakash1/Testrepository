package pages.Demo

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
class LoginPage extends Page {
    static at = { title == "Welcome" }

    static content = {
        // results(wait: true) { $("#LoginEdit_username") }

        username { $("#LoginEdit_username") }
        password { $("#LoginEdit_password") }
        LoginButton(to: LoginPage){$("#LoginEdit_login_button")}

    }
}
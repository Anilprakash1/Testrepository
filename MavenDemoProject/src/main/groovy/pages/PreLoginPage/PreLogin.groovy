package pages.PreLoginPage
import geb.Page
import modules.PreLoginModule.ReturnToLogin

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/18/13
 * Time: 10:14 AM
 * To change this template use File | Settings | File Templates.
 */
class PreLogin extends Page{
    static content = {
        PreLogin_Module{module ReturnToLogin}
        PreLoginPageTitle{$("title")}
    }

    def navLoginPage(){
        waitFor {
            PreLogin_Module.ReturnToLoginLink.click()
        }

    }
    def verifyPreLoginTitle(PreLoginTitleName) {
        println $("title")
        println{ $("title").text()}
//        println  PreLogin_Module.PreLoginPageTitle.text()
//        waitFor{$("title",text:iContains(PreLoginTitleName))}
        $("title").text()== PreLoginTitleName

}
}

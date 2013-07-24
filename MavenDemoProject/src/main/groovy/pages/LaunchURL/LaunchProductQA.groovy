package pages.LaunchURL
import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/18/13
 * Time: 9:57 AM
 * To change this template use File | Settings | File Templates.
 */
class LaunchProductQA extends Page{
    static url="http://lars1.dyndns.org/exemplar/exemplar/Portal.action"

    def verifyTitle(pageTitle){
        title== pageTitle
    }


}

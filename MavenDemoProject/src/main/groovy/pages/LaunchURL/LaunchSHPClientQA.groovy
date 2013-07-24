package pages.LaunchURL
import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/18/13
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */
class LaunchSHPClientQA extends Page{
    static url="http://ec2-54-226-210-213.compute-1.amazonaws.com:8180/shp/exemplar/Portal.action"

    def verifyTitle(pageTitle){
        title== pageTitle
    }

}

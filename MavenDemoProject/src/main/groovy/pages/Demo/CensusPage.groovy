package pages.Demo

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */

class CensusPage extends Page{
    static at ={title== "InsureAdvantage - Census"}
    static content={
        CaseName{$("td.breakWordHeader")}
        DetailsTab{$("#tab_dataentry > a")}
        Gender1{$("select[name='members[0].genderType']")}
        Month1{$("input[name='members[0].month']")}
        Date1{$("input[name='members[0].day']")}
        Year1{$("input[name='members[0].year']")}
        Smoker1{$("select[name='members[0].displaySmoker']")}
        SmokingCessation1{$("select[name='members[0].displaySmokingCessation']")}
        Status1{$("select[name='members[0].memberStatusKey']")}
        ZipCode1{$("input[name='members[0].zipCode']")}
        Gender2{$("select[name='members[1].genderType']")}
        Month2{$("input[name='members[1].month']")}
        Date2{$("input[name='members[1].day']")}
        Year2{$("input[name='members[1].year']")}
        Smoker2{$("select[name='members[1].displaySmoker']")}
        Status2{$("select[name='members[1].memberStatusKey']")}
        ZipCode2{$("input[name='members[1].zipCode']")}
        ContinueButton{$("#quoteCensusForm_12")}


    }
}
package modules.CensusModule

import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Anil
 * Date: 7/15/13
 * Time: 7:01 PM
 * To change this template use File | Settings | File Templates.
 */
class CensusModule extends Module{
    static content= {
    CaseName{$("td.breakWordHeader")}
    DetailsTab{$("#tab_dataentry > a")}
    FirstNameCheckBox{$("#showFNColOption")}
    LastNameCheckBox{$("#showLNColOption")}
    FirstName1{$("input[name='members[0].firstName']")}
    LastName1{$("input[name='members[0].lastName']")}
    Gender1{$("select[name='members[0].genderType']")}
    Month1{$("input[name='members[0].month']")}
    Date1{$("input[name='members[0].day']")}
    Year1{$("input[name='members[0].year']")}
    Age1{$("#Ag32")}
    Smoker1{$("select[name='members[0].displaySmoker']")}
    SmokingCessation1{$("select[name='members[0].displaySmokingCessation']")}
    Status1{$("select[name='members[0].memberStatusKey']")}
    ZipCode1{$("input[name='members[0].zipCode']")}
    FirstName2{$("input[name='members[1].firstName']")}
    LastName2{$("input[name='members[1].lastName']")}
    Gender2{$("select[name='members[1].genderType']")}
    Month2{$("input[name='members[1].month']")}
    Date2{$("input[name='members[1].day']")}
    Year2{$("input[name='members[1].year']")}
    Age2{$("Ag33")}
    Smoker2{$("select[name='members[1].displaySmoker']")}
    Status2{$("select[name='members[1].memberStatusKey']")}
    ZipCode2{$("input[name='members[1].zipCode']")}
    ContinueButton{$("#quoteCensusForm_12")}

}

}
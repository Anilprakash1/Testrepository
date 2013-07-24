package com.resultech.Smoke

import com.resultech.support.ReadEnvironment
import geb.spock.GebSpec
import pages.HomePage.HomePage
import pages.LaunchURL.LaunchProductQA
import pages.LaunchURL.LaunchSHPClientQA
import pages.LoginPage.LoginPage
import pages.PreLoginPage.PreLogin

import java.util.logging.Logger

/**
 * Created with IntelliJ IDEA.
 * User: qsg
 * Date: 7/2/13
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
class LoginSpec extends GebSpec {
    static Logger log4j = Logger
            .getLogger("com.resultech.connecture");

    Properties propEnvDetails

    def setupSpec() {
        clearCookies()
    }

    def setup() {
        ReadEnvironment objReadEnvironment = new ReadEnvironment();
        propEnvDetails = objReadEnvironment.ReadEnvironment();

    }

    def "Verify User Login in Product QA"() {

        given: "Launch URL"
        to LaunchProductQA

        and:
        def LoginUsername = propEnvDetails.getProperty("username")
        def LoginPassword = propEnvDetails.getProperty("password")
        def titleName = propEnvDetails.getProperty("ProductQATitle")

        when:
        at LaunchProductQA
        then:
        verifyTitle(titleName)
        waitFor { at PreLogin }


        when: "Navigate to Login Page"
        at PreLogin
        navLoginPage()

        then: "Verify login page is displayed"
        waitFor { at LoginPage }
        assert title == "Welcome"
        log4j.info("Login page is displayed")

        when: "Login using Bob Broker"
        login(LoginUsername, LoginPassword)

        then: "Verify Bob is logged in successfully"
        waitFor { at HomePage }
        assert { verfyWelcomeMessage() }
        log4j.info("Logged in Broker's name is displayed with a welcome message")


    }

    def "Verify User Login in SHP Client QA"() {

        given: "Launch URL"
        to LaunchSHPClientQA


        and:
        def LoginUsername = propEnvDetails.getProperty("username")
        def LoginPassword = propEnvDetails.getProperty("password")
        def titleName = propEnvDetails.getProperty("clientQAPageTitle")

        and:
        assert {verifyTitle(titleName)}
        waitFor {at PreLogin}

        when: "Navigate to Login Page"
        navLoginPage()
        log4j.info("Login page is displayed")

        then: "Verify login page is displayed"
        waitFor { at LoginPage }
        assert title == "Welcome"

        when: "Login using Bob Broker"
        at LoginPage
        login(LoginUsername, LoginPassword)

        then: "Verify Bob is logged in successfully"
        waitFor { at HomePage }
        assert { verfyWelcomeMessage() }
        log4j.info("Logged in Broker's name is displayed with a welcome message")


    }
}

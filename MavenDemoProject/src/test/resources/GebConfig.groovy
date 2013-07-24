/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/configuration.html
*/

def urls = [
        local:'http://iaautoqa63.dyndns.org/exemplar/user/LoginEdit.action',
//        local: 'http://lars1.dyndns.org/exemplar/user/LoginEdit.action',
//        local: ' http://ec2-54-226-210-213.compute-1.amazonaws.com:8180/shp/user/LoginEdit.action;jsessionid=LMXob0dQrBJVwFXf34XVjw__.wa01_ad01',
]

// defaults:
def defaultBaseUrl = urls['local']
baseUrl = System.getProperty('geb.build.baseUrl') ?: defaultBaseUrl
def defaultBrowser = 'firefox' // valid drivers include: htmlunit, firefox, ie, chrome
driver = System.getProperty('geb.driver') ?: defaultBrowser
quitCachedDriverOnShutdown = System.getProperty('quitOnShutdown') ?: true
reportsDir = 'build/test-results'  // alongside published test results:  this is where jenkins junit attachments plugin expects to find them.

environments {
    local {
        driver = 'ie'
        baseUrl = urls['local']
    }


    dev {
        driver = 'chrome'
        baseUrl = urls['dev']
    }

    qa {
        driver = 'chrome'
        baseUrl = urls['qa']
    }
}

waiting {
    timeout = 100
    retryInterval = 1.0
}
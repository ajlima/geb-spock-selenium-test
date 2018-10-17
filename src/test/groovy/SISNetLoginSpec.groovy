import geb.spock.GebSpec
import SISNetLoginPage

class SISNetLoginSpec extends GebSpec {

    def "execute login"() {
        given:
            to SISNetLoginPage

        when:
            username.value("admin_total")
            password.value("mutuaadmin")
            loginButton.click()

        then:
            at SISNetMainPage
    }

    def "execute login fail"() {
        given:
        to SISNetLoginPage

        when:
        username.value("admin_total")
        password.value("mutuaadm")
        loginButton.click()

        then:
        at SISNetLoginErrorPage
    }
}

import geb.Page

class SISNetLoginPage extends Page {

    static at = { title == "Mutua de propietarios" }

    static content = {
        loginButton { $("input", type: "submit") }
        username { $("input", name: "usuario") }
        password { $("input", name: "password") }
    }

}

import geb.Page

class SISNetLoginErrorPage extends Page {

    static at = { title == "Mutua de propietarios - Error de identificación" }

    static content = {
        loginButton { $("input", type: "submit") }
        username { $("input", name: "usuario") }
        password { $("input", name: "password") }
    }

}

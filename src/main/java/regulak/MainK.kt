package regulak

fun main() {

    getToken { token ->
        useToken(token)
    }

}

fun getToken(requestToken: (token: Token) -> Unit) {

    /**mock process*/
    // -- request process start
    // --
    val newToken: Token = serverResponse()
    // --
    // -- request process end

    requestToken(newToken)

}

fun useToken(token: Token) {}

fun serverResponse(): Token = Token()

class Token

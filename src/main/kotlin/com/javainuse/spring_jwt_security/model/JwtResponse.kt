package com.javainuse.spring_jwt_security.model

import java.io.Serializable


class JwtResponse(val token: String) : Serializable {

    companion object {
        private const val serialVersionUID = -8091879091924046844L
    }

}
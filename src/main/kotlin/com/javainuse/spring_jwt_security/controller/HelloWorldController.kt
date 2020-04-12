package com.javainuse.spring_jwt_security.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @RequestMapping("/hello")
    fun firstPage(): String {
        return "Hello World"
    }
}
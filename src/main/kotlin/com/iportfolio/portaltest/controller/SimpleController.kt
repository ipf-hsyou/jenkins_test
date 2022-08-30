package com.iportfolio.portaltest.controller

import com.iportfolio.portaltest.PortaltestApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {

    @GetMapping("/")
    fun getLandingPage(): String {
        return "Landing Page!";
    }

    @GetMapping("/ping9")
    fun getPing9(): String {
        return "Welcome to Ping9!";
    }
}
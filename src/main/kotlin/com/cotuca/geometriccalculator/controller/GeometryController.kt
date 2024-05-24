package com.cotuca.geometriccalculator.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
@RequestMapping("geometric")
class GeometryController {

    @GetMapping
    fun list() {

    }
}
package com.cotuca.geometriccalculator.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
@RequestMapping("geometric")
class GeometryController {


    @GetMapping("/circle")
    fun getCircle(@RequestParam radius: Double): Map<String, Double> {
        val perimeter = 2 * PI * radius
        val area = PI * radius.pow(2)
        return mapOf("perimeter" to perimeter, "area" to area)
    }

    @GetMapping("/cone")
    fun getCone(@RequestParam radius: Double, @RequestParam height: Double): Map<String, Double> {
        val slantHeight = sqrt(radius.pow(2) + height.pow(2))
        val surfaceArea = PI * radius * (radius + slantHeight)
        val volume = (1.0 / 3) * PI * radius.pow(2) * height
        return mapOf("surfaceArea" to surfaceArea, "volume" to volume)
    }

    @GetMapping("/hexagon")
    fun getHexagon(@RequestParam side: Double): Map<String, Double> {
        val perimeter = 6 * side
        val area = (3 * sqrt(3.0) / 2) * side.pow(2)
        return mapOf("perimeter" to perimeter, "area" to area)
    }

    @GetMapping("/square")
    fun getSquare(@RequestParam side: Double): Map<String, Double> {
        val perimeter = 4 * side
        val area = side.pow(2)
        return mapOf("perimeter" to perimeter, "area" to area)
    }
}
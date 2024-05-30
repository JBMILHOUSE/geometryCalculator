package com.cotuca.geometriccalculator.controller

import com.cotuca.geometriccalculator.dto.CircleResponse
import com.cotuca.geometriccalculator.dto.ConeResponse
import com.cotuca.geometriccalculator.dto.HexagonResponse
import com.cotuca.geometriccalculator.dto.SquareResponse
import com.cotuca.geometriccalculator.service.GeometryService

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("geometric")
class GeometryController(private val geometryService: GeometryService) {

    @GetMapping("/circle")
    fun getCircle(@RequestParam radius: Double): CircleResponse {
        return geometryService.calculateCircle(radius)
    }

    @GetMapping("/cone")
    fun getCone(@RequestParam radius: Double, @RequestParam height: Double): ConeResponse {
        return geometryService.calculateCone(radius, height)
    }

    @GetMapping("/hexagon")
    fun getHexagon(@RequestParam side: Double): HexagonResponse {
        return geometryService.calculateHexagon(side)
    }

    @GetMapping("/square")
    fun getSquare(@RequestParam side: Double): SquareResponse {
        return geometryService.calculateSquare(side)
    }
}
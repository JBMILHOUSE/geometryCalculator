package com.cotuca.geometriccalculator.service

import com.cotuca.geometriccalculator.dto.CircleResponse
import com.cotuca.geometriccalculator.dto.ConeResponse
import com.cotuca.geometriccalculator.dto.HexagonResponse
import com.cotuca.geometriccalculator.dto.SquareResponse
import org.springframework.stereotype.Service
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

@Service
class GeometryService {

    fun calculateCircle(radius: Double): CircleResponse {
        val perimeter = 2 * PI * radius
        val area = PI * radius.pow(2)
        return CircleResponse(perimeter, area)
    }

    fun calculateCone(radius: Double, height: Double): ConeResponse {
        val slantHeight = sqrt(radius.pow(2) + height.pow(2))
        val surfaceArea = PI * radius * (radius + slantHeight)
        val volume = (1.0 / 3) * PI * radius.pow(2) * height
        return ConeResponse(surfaceArea, volume)
    }

    fun calculateHexagon(side: Double): HexagonResponse {
        val perimeter = 6 * side
        val area = (3 * sqrt(3.0) / 2) * side.pow(2)
        return HexagonResponse(perimeter,area)
    }

    fun calculateSquare(side: Double): SquareResponse {
        val perimeter = 4 * side
        val area = side.pow(2)
        return SquareResponse(perimeter,area)
    }
}
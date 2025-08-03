package com.theo.github

import com.theo.github.domain.Calculations
import org.junit.Assert.assertEquals
import org.junit.Test

class CalculationsTest {
    @Test
    fun addition_isCorrect() {
        val calculations = Calculations()
        assertEquals(4, calculations.add(2, 2))
    }

    @Test
    fun subtraction_isCorrect() {
        val calculations = Calculations()
        assertEquals(0, calculations.subtract(2, 2))
    }
}
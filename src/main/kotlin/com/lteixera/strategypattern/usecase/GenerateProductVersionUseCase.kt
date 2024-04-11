package com.lteixera.strategypattern.usecase

import org.springframework.stereotype.Component

@Component
class GenerateProductVersionUseCase {

    fun generate() {
        println("Gerando nova versão")
    }
}
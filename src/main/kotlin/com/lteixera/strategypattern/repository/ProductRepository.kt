package com.lteixera.strategypattern.repository

import org.springframework.stereotype.Component

@Component
class ProductRepository {

    fun save() {
        println("Salvando produto ...")
    }
}
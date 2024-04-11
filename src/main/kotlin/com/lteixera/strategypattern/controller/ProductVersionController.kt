package com.lteixera.strategypattern.controller

import com.lteixera.strategypattern.domain.Product
import com.lteixera.strategypattern.strategy.ProductVersionStrategyExecutor
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductVersionController(private val productVersionStrategyExecutor: ProductVersionStrategyExecutor) {

    @PostMapping("/products")
    fun process(@RequestBody product: Product) {
        productVersionStrategyExecutor.execute(product)
    }
}
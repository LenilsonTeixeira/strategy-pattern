package com.lteixera.strategypattern.strategy

import com.lteixera.strategypattern.domain.Product
import org.springframework.stereotype.Component

@Component
class ProductVersionStrategyExecutor(
    private val productVersionStrategyFactory: ProductVersionStrategyFactory
) {
    fun execute(product: Product) {
        val strategy = productVersionStrategyFactory.getStrategyType(product)
        strategy.execute(product)
    }
}
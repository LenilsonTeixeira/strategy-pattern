package com.lteixera.strategypattern.strategy

import com.lteixera.strategypattern.domain.Product
import org.springframework.stereotype.Component

@Component
class ProductVersionStrategyFactory(
    private val newProductWithPreviousSkuStrategy: NewProductWithPreviousSkuStrategy,
    private val newProductWithoutPreviousSkuStrategy: NewProductWithoutPreviousSkuStrategy) {

    fun getStrategyType(product: Product) : ProductVersionStrategy{
        if(product.previousSku == "") {
            return newProductWithoutPreviousSkuStrategy
        } else {
            return newProductWithPreviousSkuStrategy
        }
    }
}
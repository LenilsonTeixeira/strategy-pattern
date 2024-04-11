package com.lteixera.strategypattern.strategy

import com.lteixera.strategypattern.domain.Product

interface ProductVersionStrategy {
    fun execute(product: Product)
}
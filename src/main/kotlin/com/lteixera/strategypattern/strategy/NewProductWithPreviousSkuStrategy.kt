package com.lteixera.strategypattern.strategy

import com.lteixera.strategypattern.domain.Product
import com.lteixera.strategypattern.repository.ProductRepository
import org.springframework.stereotype.Component

@Component
class NewProductWithPreviousSkuStrategy(private val productRepository: ProductRepository): ProductVersionStrategy {
    override fun execute(product: Product) {
        println("Executando regras de produto não encontrado com previous sku")
        println(product)
        productRepository.save()
    }
}
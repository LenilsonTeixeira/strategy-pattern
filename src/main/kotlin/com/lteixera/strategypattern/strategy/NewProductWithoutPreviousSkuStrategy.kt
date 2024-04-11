package com.lteixera.strategypattern.strategy

import com.lteixera.strategypattern.domain.Product
import com.lteixera.strategypattern.repository.ProductRepository
import com.lteixera.strategypattern.usecase.GenerateProductVersionUseCase
import org.springframework.stereotype.Component

@Component
class NewProductWithoutPreviousSkuStrategy(private val productRepository: ProductRepository, private val generateProductVersionUseCase: GenerateProductVersionUseCase) : ProductVersionStrategy {
    override fun execute(product: Product) {
        println("Executando regras de novo produto sem previous sku")
        println(product)
        generateProductVersionUseCase.generate()
        productRepository.save()
    }
}
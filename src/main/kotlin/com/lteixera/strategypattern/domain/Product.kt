package com.lteixera.strategypattern.domain

data class Product(
    val sku: String,
    val businessUnit: String,
    val previousSku: String? = ""
)
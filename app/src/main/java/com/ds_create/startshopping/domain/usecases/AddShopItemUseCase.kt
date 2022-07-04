package com.ds_create.startshopping.domain.usecases

import com.ds_create.startshopping.domain.ShopItem
import com.ds_create.startshopping.domain.ShopListRepository

class AddShopItemUseCase(
    private val shopListRepository: ShopListRepository
    ) {
    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}
package com.ds_create.startshopping.domain.usecases

import com.ds_create.startshopping.domain.ShopItem
import com.ds_create.startshopping.domain.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}
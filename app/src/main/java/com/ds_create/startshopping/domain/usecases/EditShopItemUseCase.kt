package com.ds_create.startshopping.domain.usecases

import com.ds_create.startshopping.domain.ShopItem
import com.ds_create.startshopping.domain.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}
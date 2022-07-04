package com.ds_create.startshopping.domain.usecases

import com.ds_create.startshopping.domain.ShopItem
import com.ds_create.startshopping.domain.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
       return shopListRepository.getShopItem(shopItemId)
    }
}
package com.ds_create.startshopping.domain.usecases

import com.ds_create.startshopping.domain.ShopItem
import com.ds_create.startshopping.domain.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}
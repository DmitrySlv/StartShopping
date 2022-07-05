package com.ds_create.startshopping.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ds_create.startshopping.data.ShopListRepositoryImpl
import com.ds_create.startshopping.domain.ShopItem
import com.ds_create.startshopping.domain.usecases.DeleteShopItemUseCase
import com.ds_create.startshopping.domain.usecases.EditShopItemUseCase
import com.ds_create.startshopping.domain.usecases.GetShopListUseCase

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl
    val shopList = MutableLiveData<List<ShopItem>>()

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    fun getShopList() {
        val list = getShopListUseCase.getShopList()
        shopList.value = list
    }

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
        getShopList()
    }

    fun changeEnabledState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
        getShopList()
    }
}
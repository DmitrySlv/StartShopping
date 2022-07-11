package com.ds_create.startshopping.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ds_create.startshopping.R
import com.ds_create.startshopping.presentation.ViewModels.ShopItemViewModel

class ShopItemActivity : AppCompatActivity() {

    private lateinit var viewModel: ShopItemViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_item)
        viewModel.errorInputName.value
        viewModel.errorInputCount.value
    }
}
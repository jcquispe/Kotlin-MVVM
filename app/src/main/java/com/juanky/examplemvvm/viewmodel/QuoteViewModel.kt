package com.juanky.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.juanky.examplemvvm.model.QuoteModel
import com.juanky.examplemvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}
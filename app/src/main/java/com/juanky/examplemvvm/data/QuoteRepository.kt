package com.juanky.examplemvvm.data

import com.juanky.examplemvvm.data.model.QuoteModel
import com.juanky.examplemvvm.data.model.QuoteProvider
import com.juanky.examplemvvm.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}
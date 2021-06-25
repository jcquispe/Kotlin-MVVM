package com.juanky.examplemvvm.domain

import com.juanky.examplemvvm.data.QuoteRepository
import com.juanky.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()
}
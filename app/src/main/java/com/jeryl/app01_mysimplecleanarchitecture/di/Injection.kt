package com.jeryl.app01_mysimplecleanarchitecture.di

import com.jeryl.app01_mysimplecleanarchitecture.data.IMessageDataSource
import com.jeryl.app01_mysimplecleanarchitecture.data.MessageDataSource
import com.jeryl.app01_mysimplecleanarchitecture.data.MessageRepository
import com.jeryl.app01_mysimplecleanarchitecture.domain.IMessageRepository
import com.jeryl.app01_mysimplecleanarchitecture.domain.MessageInteractor
import com.jeryl.app01_mysimplecleanarchitecture.domain.MessageUseCase


/**
 * Created by Jery I D Lenas on 02/09/2024.
 * Contact : jerylenas@gmail.com
 */

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}
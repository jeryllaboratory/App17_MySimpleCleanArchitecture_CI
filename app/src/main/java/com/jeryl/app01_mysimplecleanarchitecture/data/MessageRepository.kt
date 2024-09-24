package com.jeryl.app01_mysimplecleanarchitecture.data

import com.jeryl.app01_mysimplecleanarchitecture.domain.IMessageRepository


/**
 * Created by Jery I D Lenas on 02/09/2024.
 * Contact : jerylenas@gmail.com
 */

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}
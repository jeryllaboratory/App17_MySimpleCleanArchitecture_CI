package com.jeryl.app01_mysimplecleanarchitecture.data

import com.jeryl.app01_mysimplecleanarchitecture.domain.MessageEntity


/**
 * Created by Jery I D Lenas on 02/09/2024.
 * Contact : jerylenas@gmail.com
 */

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}
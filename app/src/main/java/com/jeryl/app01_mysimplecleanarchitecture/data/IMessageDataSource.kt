package com.jeryl.app01_mysimplecleanarchitecture.data

import com.jeryl.app01_mysimplecleanarchitecture.domain.MessageEntity


/**
 * Created by Jery I D Lenas on 02/09/2024.
 * Contact : jerylenas@gmail.com
 */

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}
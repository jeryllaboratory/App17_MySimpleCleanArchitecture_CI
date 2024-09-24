package com.jeryl.app01_mysimplecleanarchitecture.domain


/**
 * Created by Jery I D Lenas on 02/09/2024.
 * Contact : jerylenas@gmail.com
 */

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}
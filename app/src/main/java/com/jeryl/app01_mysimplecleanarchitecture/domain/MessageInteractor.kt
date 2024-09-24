package com.jeryl.app01_mysimplecleanarchitecture.domain


/**
 * Created by Jery I D Lenas on 02/09/2024.
 * Contact : jerylenas@gmail.com
 */

class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}
package com.jeryl.app01_mysimplecleanarchitecture.domain

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner


/**
 * Created by Jery I D Lenas on 02/09/2024.
 * Contact : jerylenas@gmail.com
 */

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {

    private lateinit var messageUseCase: MessageUseCase

    @Mock
    private lateinit var messageRepository: IMessageRepository

    @Before
    fun setUp() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME Welcome to Clean Architecture")
        `when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    @Test
    fun `should get data from repository`() {
        val message = messageUseCase.getMessage(NAME)

        verify(messageRepository).getWelcomeMessage(NAME)
        verifyNoMoreInteractions(messageRepository)
        Assert.assertEquals("Hello $NAME Welcome to Clean Architecture", message.welcomeMessage)
    }

    companion object {
        const val NAME = "Dicoding"
    }
}
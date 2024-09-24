package com.jeryl.app01_mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jeryl.app01_mysimplecleanarchitecture.domain.MessageEntity
import com.jeryl.app01_mysimplecleanarchitecture.domain.MessageUseCase


/**
 * Created by Jery I D Lenas on 02/09/2024.
 * Contact : jerylenas@gmail.com
 */

class MainViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}
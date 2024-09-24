package com.jeryl.app01_mysimplecleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jeryl.app01_mysimplecleanarchitecture.di.Injection
import com.jeryl.app01_mysimplecleanarchitecture.domain.MessageUseCase


/**
 * Created by Jery I D Lenas on 02/09/2024.
 * Contact : jerylenas@gmail.com
 */

class MainViewModelFactory (
    private var messageUseCase: MessageUseCase
) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUseCase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}
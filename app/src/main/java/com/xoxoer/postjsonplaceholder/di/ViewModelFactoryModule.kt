package com.xoxoer.postjsonplaceholder.di

import androidx.lifecycle.ViewModelProvider
import com.xoxoer.postjsonplaceholder.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(
        viewModelProviderFactory: ViewModelProviderFactory
    ): ViewModelProvider.Factory
}
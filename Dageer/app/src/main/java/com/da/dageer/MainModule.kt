package com.da.dageer

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainModule {
    @ActivityScoped
    @Provides
    @Named("String 2")

    fun provideTestString1(@ApplicationContext context:Context,
                         @Named( "String 1")testString1: String
    ) =
            "${ context.getString(R.string.string_to_inject)}  - $testString1 "


}
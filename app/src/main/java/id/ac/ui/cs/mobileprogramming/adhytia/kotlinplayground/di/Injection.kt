package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.di

import android.content.Context
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.source.AcademyRepository
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.source.remote.RemoteDataSource
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}
package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.source.AcademyRepository
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.ui.reader.CourseReaderViewModel
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.ui.academy.AcademyViewModel
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.di.Injection
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.ui.bookmark.BookmarkViewModel
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.ui.detail.DetailCourseViewModel

class ViewModelFactory private constructor(private val mAcademyRepository: AcademyRepository) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context)).apply {
                    instance = this
                }
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(AcademyViewModel::class.java) -> {
                return AcademyViewModel(mAcademyRepository) as T
            }
            modelClass.isAssignableFrom(DetailCourseViewModel::class.java) -> {
                return DetailCourseViewModel(mAcademyRepository) as T
            }
            modelClass.isAssignableFrom(BookmarkViewModel::class.java) -> {
                return BookmarkViewModel(mAcademyRepository) as T
            }
            modelClass.isAssignableFrom(CourseReaderViewModel::class.java) -> {
                return CourseReaderViewModel(mAcademyRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
}
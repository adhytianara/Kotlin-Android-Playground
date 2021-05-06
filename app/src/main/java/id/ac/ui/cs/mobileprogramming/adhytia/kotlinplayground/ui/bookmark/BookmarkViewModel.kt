package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.ui.bookmark

import androidx.lifecycle.ViewModel
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.CourseEntity
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.source.AcademyRepository
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.utils.DataDummy

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = academyRepository.getBookmarkedCourses()

}
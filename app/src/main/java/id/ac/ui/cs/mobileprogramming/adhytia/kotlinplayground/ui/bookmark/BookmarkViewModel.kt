package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.ui.bookmark

import androidx.lifecycle.ViewModel
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.CourseEntity
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}
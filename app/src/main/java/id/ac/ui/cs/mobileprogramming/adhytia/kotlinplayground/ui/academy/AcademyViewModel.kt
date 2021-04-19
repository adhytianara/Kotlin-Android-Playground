package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.ui.academy

import androidx.lifecycle.ViewModel
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.CourseEntity
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}
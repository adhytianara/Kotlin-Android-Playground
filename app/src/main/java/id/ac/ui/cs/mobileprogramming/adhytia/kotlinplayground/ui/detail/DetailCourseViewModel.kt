package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.ui.detail

import androidx.lifecycle.ViewModel
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.CourseEntity
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.ModuleEntity
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.source.AcademyRepository
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.utils.DataDummy

class DetailCourseViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity = academyRepository.getCourseWithModules(courseId)

    fun getModules(): List<ModuleEntity> = academyRepository.getAllModulesByCourse(courseId)
}
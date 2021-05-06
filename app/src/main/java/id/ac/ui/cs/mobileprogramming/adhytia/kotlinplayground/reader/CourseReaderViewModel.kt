package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.reader

import androidx.lifecycle.ViewModel
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.ContentEntity
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.ModuleEntity
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.source.AcademyRepository
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.utils.DataDummy

class CourseReaderViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    private lateinit var courseId: String
    private lateinit var moduleId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun setSelectedModule(moduleId: String) {
        this.moduleId = moduleId
    }

    fun getModules(): ArrayList<ModuleEntity> = academyRepository.getAllModulesByCourse(courseId)

    fun getSelectedModule(): ModuleEntity = academyRepository.getContent(courseId, moduleId)
}
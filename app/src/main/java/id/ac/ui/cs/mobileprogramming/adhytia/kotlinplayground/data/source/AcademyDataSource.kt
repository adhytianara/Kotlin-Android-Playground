package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.source

import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.CourseEntity
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.ModuleEntity

interface AcademyDataSource {

    fun getAllCourses(): List<CourseEntity>

    fun getBookmarkedCourses(): List<CourseEntity>

    fun getCourseWithModules(courseId: String): CourseEntity

    fun getAllModulesByCourse(courseId: String): List<ModuleEntity>

    fun getContent(courseId: String, moduleId: String): ModuleEntity
}
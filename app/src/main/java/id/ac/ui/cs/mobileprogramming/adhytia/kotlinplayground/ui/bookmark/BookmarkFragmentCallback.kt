package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.ui.bookmark

import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
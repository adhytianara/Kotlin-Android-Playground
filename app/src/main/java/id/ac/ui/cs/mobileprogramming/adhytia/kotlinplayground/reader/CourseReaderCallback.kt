package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}
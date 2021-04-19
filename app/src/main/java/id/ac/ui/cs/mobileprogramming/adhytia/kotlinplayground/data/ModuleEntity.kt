package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.data

data class ModuleEntity(
    var moduleId: String,
    var courseId: String,
    var title: String,
    var position: Int,
    var read: Boolean = false
) {
    var contentEntity: ContentEntity? = null
}
package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    var name: String?,
    val age: Int?,
    val email: String?,
    val city: String?
) : Parcelable

package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    var name: String,
    var description: String,
    var photo: String
) : Parcelable
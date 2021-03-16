package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// ACTIVITY TIDAK BISA DIPANGGIL DARI DRAWER, CEK DISKUSI DICODING
class SubwayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subway)
    }
}
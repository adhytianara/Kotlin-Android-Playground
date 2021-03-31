package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import bangkit.adhytia.github_user.MainViewModelFactory
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.repository.Repository
import id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground.databinding.ActivityMainBinding

// SOURCE : https://www.youtube.com/playlist?list=PLSrm9z4zp4mF1Ssdfuocy2XH5Bw4wLLNw

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        viewModel.myCustomPosts2.observe(this, Observer { response ->
            if (response.isSuccessful) {
                binding!!.textView.text = response.body().toString()
                response.body()?.forEach {
                    Log.d("RESPONSE", it.myUserId.toString())
                    Log.d("RESPONSE", it.id.toString())
                    Log.d("RESPONSE", it.title)
                    Log.d("RESPONSE", it.body)
                }
            } else {
                binding!!.textView.text = response.body().toString()
            }
        })

        val options: HashMap<String, String> = HashMap()
        options["_sort"] = "id"
        options["_order"] = "desc"

        binding?.button?.setOnClickListener {
            val myNumber = binding?.numberEditText?.text.toString()
            viewModel.getCustomPosts2(Integer.parseInt(myNumber), options)
        }
    }
}
package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.Charset

/*
Source :
1. https://www.tutorialspoint.com/how-to-parse-json-objects-on-android-using-kotlin
2. https://bezkoder.com/kotlin-android-read-json-file-assets-gson/
*/

class MainActivity : AppCompatActivity() {
    var personName: ArrayList<String> = ArrayList()
    var emailId: ArrayList<String> = ArrayList()
    var mobileNumbers: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val linearLayoutManager = LinearLayoutManager(applicationContext)

        recyclerView.layoutManager = linearLayoutManager

        try {
            val obj = JSONObject(loadJSONFromAsset())
            val userArray = obj.getJSONArray("users")
            for (i in 0 until userArray.length()) {
                val userDetail = userArray.getJSONObject(i)
                personName.add(userDetail.getString("name"))
                emailId.add(userDetail.getString("email"))
                val contact = userDetail.getJSONObject("contact")
                mobileNumbers.add(contact.getString("mobile"))
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        val customAdapter = CustomAdapter(this@MainActivity, personName, emailId, mobileNumbers)
        recyclerView.adapter = customAdapter


        //READ USING GSON
        val jsonFileString = getJsonDataFromAsset(applicationContext, "bezkoder.json")
        Log.i("data", jsonFileString)

        val gson = Gson()
        val listPersonType = object : TypeToken<List<Person>>() {}.type

        var persons: List<Person> = gson.fromJson(jsonFileString, listPersonType)
        persons.forEachIndexed { idx, person -> Log.i("data", "> Item $idx:\n$person") }
    }

    private fun getJsonDataFromAsset(context: Context, fileName: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

    private fun loadJSONFromAsset(): String {
        val json: String?

        try {
            val inputStream = assets.open("user_list.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            val charset: Charset = Charsets.UTF_8

            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, charset)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return ""
        }
        return json
    }
}
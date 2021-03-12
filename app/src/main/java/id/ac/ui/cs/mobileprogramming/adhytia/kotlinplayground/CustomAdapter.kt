package id.ac.ui.cs.mobileprogramming.adhytia.kotlinplayground

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.util.*

class CustomAdapter(
    private var context: Context,
    private var personNames: ArrayList<String>,
    private var emailIds: ArrayList<String>,
    private var mobileNumbers: ArrayList<String>
) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // set the data in items
        holder.name.text = personNames[position]
        holder.email.text = emailIds[position]
        holder.mobileNo.text = mobileNumbers[position]
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener { // display a toast with person name on item click
            Toast.makeText(context, personNames[position], Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return personNames.size
    }

    inner class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        var name: TextView = itemView.findViewById<View>(R.id.tvName) as TextView
        var email: TextView = itemView.findViewById<View>(R.id.tvEmail) as TextView
        var mobileNo: TextView = itemView.findViewById<View>(R.id.tvMobile) as TextView
    }
}
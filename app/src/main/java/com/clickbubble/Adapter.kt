package com.clickbubble

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.clickbubble.model.Highscore
import java.util.*

/**
 * @author Hendrik
 */
class Adapter(private val highscores: ArrayList<Highscore>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // create a new view
        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_highscore, parent, false) as TextView
        return ViewHolder(textView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.text = java.lang.String.format(Locale.getDefault( ), "%s %d",
                highscores[position].name, highscores[position].points )
    }

    override fun getItemCount() = highscores.size
}
package com.clickbubble

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.clickbubble.model.Highscore
import kotlinx.android.synthetic.main.activity_highscore.*

/**
 *
 * @author Hendrik
 */
class HighscoreActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_highscore)

        viewManager = LinearLayoutManager(this)

        // creating sample data
        val data: ArrayList<Highscore> = arrayListOf(
                Highscore("Pexi", 43),
                Highscore("Chicken", 122),
                Highscore("Maroun", 343434),
                Highscore(points = 5)
        )

        viewAdapter = Adapter(data)

        recyclerView = highscoreBoard.apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            //specify an ViewAdapter ( see also next example
            adapter = viewAdapter
        }

    }


}

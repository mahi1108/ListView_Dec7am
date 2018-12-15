package cubex.mahesh.listview_dec7am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val  values = resources.getStringArray(R.array.states)

       lview.setOnItemClickListener { adapterView, view, i, l ->
           Toast.makeText(this@MainActivity,
               values[i],Toast.LENGTH_LONG).show()
       }

    }
}

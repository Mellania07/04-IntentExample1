package mellania.polbeng.ac.id.intentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {
    val Log = Logger.getLogger(SecondActivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.info("onCreate")
        btnExitActivity.setOnClickListener {
            finish()
        }
    }
    override fun onRestart() {
        super.onRestart()
        Log.info("onRestart")
    }
    override fun onStop() {
        super.onStop()
        Log.info("onStop")
    }
}
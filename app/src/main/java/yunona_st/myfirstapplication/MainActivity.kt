package yunona_st.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Мы знаем, что ныне лежит на весах \n")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "И что совершается ныне. \n")
    }

    /*И что совершается ныне.
    Час мужества пробил на наших часах,
    И мужество нас не покинет.

    Не страшно под пулями мертвыми лечь,
    Не горько остаться без крова,
    И мы сохраним тебя, русская речь,
    Великое русское слово.*/

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Час мужества пробил на наших часах, \n")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "И мужество нас не покинет. \n \n")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Не горько остаться без крова, \n")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "\n Не страшно под пулями мертвыми лечь, \n Не горько остаться без крова, \n И мы сохраним тебя, русская речь, \n Великое русское слово. ")
    }
}
package app.naklab.assu.android.kotlinfontmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.opencv.android.OpenCVLoader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // OpenCV をアプリで使うために必要
        if (!OpenCVLoader.initDebug()) {
            Log.i("OpenCV", "Failed")
        } else {
            Log.i("OpenCV", "successfully built !")
        }
    }
}

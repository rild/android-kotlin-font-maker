package app.naklab.assu.android.kotlinfontmaker.services

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import app.naklab.assu.android.kotlinfontmaker.R
import org.opencv.android.Utils
import org.opencv.core.*
import org.opencv.imgproc.Imgproc
import java.util.ArrayList

class EdgeDetector {
    private fun contour2point(contour: List<MatOfPoint>): List<List<Point>> {
        val points = ArrayList<List<Point>>()
        for (i in contour.indices) {
            points.add(contour[i].toList())
        }
        return points
    }

    // test method
    fun makeGlyphString(bmp: Bitmap): String {
        return makeGlyphString(detectEdgePoints(bmp), "uni22", 584, "&#x22;")
    }

    fun makeGlyphString(bmp: Bitmap, glyphName: String, horizAdvX: Int, unicode: String): String {
        return makeGlyphString(detectEdgePoints(bmp), glyphName, horizAdvX, unicode)
    }

    // 画像から path を抽出する: bmp → points
    private fun detectEdgePoints(bmp: Bitmap): List<List<Point>> {
        val mat = Mat()
        Utils.bitmapToMat(bmp, mat, true)
        Imgproc.threshold(mat, mat, 128.0, 255.0, Imgproc.THRESH_BINARY)
        Imgproc.cvtColor(mat, mat, Imgproc.COLOR_RGB2GRAY)
        //        Imgproc.Canny(mat, mat, 110, 130);

        val mHierarchy = Mat.zeros(Size(5.0, 5.0), CvType.CV_8UC1)

        // These lines are in function onCameraFrame
        val contours = ArrayList<MatOfPoint>()
        Imgproc.findContours(
            mat,
            contours,
            mHierarchy,
            Imgproc.RETR_TREE,
            Imgproc.CHAIN_APPROX_SIMPLE
        )

        return contour2point(contours)
    }


    // path から svg の文字列を生成する: points → svg string
    private fun makeGlyphString(
        points: List<List<Point>>,
        glyphName: String,
        horizAdvX: Int,
        unicode: String
    ): String {

        var out = "<glyph d=\""
        for (j in points.indices) {
            if (j == 0) continue // 外周はスキップ
            out = out + "M"
            val pointList = points[j]
            for (i in pointList.indices) {
                // Android のy座標系は下向きなのに対して、font-svg の glyph では上向き座標系なので座標系の変換を行う
                pointList[i].y = pointList[i].y * -1 + 1000
                out = out + pointList[i].x + " " + pointList[i].y + " "
            }

        }
        out = out + "Z" // 終端文字？
        out = out + "\" glyph-name=\"" + glyphName +
                "\" horiz-adv-x=\"" + horizAdvX +
                "\" unicode=\"" + unicode +
                "\" vert-adv-y=\"1000\" />"
        return out
    }

    fun makeGlyphBitmap(context: Context, bmp: Bitmap): Bitmap {
        val mat = Mat()
        Utils.bitmapToMat(bmp, mat, true)
        Imgproc.threshold(mat, mat, 128.0, 255.0, Imgproc.THRESH_BINARY)
        Imgproc.cvtColor(mat, mat, Imgproc.COLOR_RGB2GRAY)
        Imgproc.Canny(mat, mat, 110.0, 130.0)

        val mHierarchy = Mat.zeros(Size(5.0, 5.0), CvType.CV_8UC1)

        // These lines are in function onCameraFrame
        val contours = ArrayList<MatOfPoint>()
        Imgproc.findContours(
            mat,
            contours,
            mHierarchy,
            Imgproc.RETR_EXTERNAL,
            Imgproc.CHAIN_APPROX_TC89_L1
        )

        val outBmp = BitmapFactory.decodeResource(context.resources, R.drawable.background_green)
        val out = Mat(mat.size(), mat.type())
        val CONTOUR_COLOR = Scalar(255.0, 0.0, 0.0, 255.0)
        Imgproc.drawContours(out, contours, -1, CONTOUR_COLOR)
        Utils.matToBitmap(out, outBmp)
        return outBmp
    }
}
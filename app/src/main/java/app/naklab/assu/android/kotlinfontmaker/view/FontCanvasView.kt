package app.naklab.assu.android.kotlinfontmaker.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import java.util.ArrayList

class FontCanvasView : View {
    internal val TAG = "FontFanvas"
    internal val PATH_NO_DATA = -1

    var currentPath: Path? = null
    internal lateinit var paths: MutableList<Path>
    internal var currentPathIndex: Int = PATH_NO_DATA

    internal lateinit var context: Context
    internal lateinit var paint: Paint

    private fun init() {
        currentPath = null

        paths = ArrayList()
        currentPathIndex = PATH_NO_DATA

        paint = Paint()
        paint.color = -0x1000000
        paint.style = Paint.Style.STROKE
        paint.strokeJoin = Paint.Join.ROUND
        paint.strokeCap = Paint.Cap.ROUND
        paint.strokeWidth = 30f
    }


    constructor(context: Context) : super(context, null)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        this.context = context
        init()
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        this.context = context
        init()
    }

    protected override fun onDraw(canvas: Canvas) {
        canvas.save()

        for (i in 0..currentPathIndex) {
            val p = paths.get(i)
            canvas.drawPath(p, paint)
        }
        canvas.restore()

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x = event.x
        val y = event.y

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
//                currentPath = Path()
                val p = Path()
                currentPathIndex++
                if (currentPathIndex >= paths.size) {
                    paths.add(p)
                } else {
                    paths.set(currentPathIndex, p)
                }
                paths.get(currentPathIndex).moveTo(x, y)
                invalidate()
            }
            MotionEvent.ACTION_MOVE -> {
                paths.get(currentPathIndex).lineTo(x, y)
                invalidate()
            }
            MotionEvent.ACTION_UP -> {
                paths.get(currentPathIndex).lineTo(x, y)
                invalidate()
            }
        }

        return true
    }

    fun clear() {
        init()
        invalidate()
    }

    fun undo() {
        currentPathIndex--
        if (currentPathIndex < 0) currentPathIndex = PATH_NO_DATA
        invalidate()
    }

    fun redo() {
        currentPathIndex++
        if (currentPathIndex > paths.size - 1) currentPathIndex = paths.size - 1
        invalidate()
    }
}
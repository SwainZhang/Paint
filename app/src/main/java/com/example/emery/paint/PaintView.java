package com.example.emery.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by emery on 2017/8/10.
 */

public class PaintView extends View {
    public PaintView(Context context) {
        super(context);
    }

    public PaintView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(50);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(100,600,400,600,paint);
        canvas.drawCircle(250,600,150,paint);

        paint.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
        paint.setTextSize(200);
        paint.setStrokeWidth(10);
        paint.setColor(Color.BLACK);
        canvas.drawText("浙江萨宝科技",1,200,paint);
    }
}

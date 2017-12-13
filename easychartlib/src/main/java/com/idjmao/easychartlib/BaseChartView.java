package com.idjmao.easychartlib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 1djmao on 2017/12/13.
 */

public class BaseChartView extends View {
    int pading=10;
    int color= Color.BLUE;
    float[] mFloats=new float[]{19,25,36,88,23,52,52};


    public BaseChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float maxVal=60;
        int barWidth=getWidth()/mFloats.length-pading*2;

        Paint paint=new Paint(color);

        for (int i = 0; i < mFloats.length; i++) {
            int barHigh= (int) (mFloats[i]*getHeight()/maxVal);

            canvas.drawRect(pading*(1+i*2)+barWidth*i,getHeight()-barHigh,pading*(1+i*2)+(barWidth*i+1),getHeight(),paint);



        }




    }
}

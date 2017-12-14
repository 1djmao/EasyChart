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

public class BarView extends View {
    int pading=10;//两个 bar 之间的间隔
    int color= Color.BLUE;//bar 颜色
    float[] mFloats=new float[]{19,25,36,88,23,52,52};//数据
    float maxVal=0;//坐标轴的最大值，默认自动获取最大数据最近的整数

    public BarView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int barWidth=(getWidth()/mFloats.length)-pading*2;

        Paint paint=new Paint();
        paint.setColor(color);


        for (int i = 0; i < mFloats.length; i++) {

            int barHigh= (int) (mFloats[i]*getHeight()/maxVal);
            canvas.drawRect(pading*(1+i*2)+barWidth*i,getHeight()-barHigh,pading*(1+i*2)+barWidth*(i+1),getHeight(),paint);

        }

    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
        invalidate();
    }

    public int getPading() {
        return pading;
    }

    public void setPading(int pading) {
        this.pading = pading;
        invalidate();
    }

    public float[] getFloats() {
        return mFloats;
    }

    public void setFloats(float[] floats) {
        mFloats = floats;
        invalidate();
    }

    public float getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(float maxVal) {
        this.maxVal = maxVal;
        invalidate();
    }
}

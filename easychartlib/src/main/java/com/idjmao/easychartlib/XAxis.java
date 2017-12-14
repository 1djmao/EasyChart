package com.idjmao.easychartlib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 1djmao on 2017/12/14.
 */

public class XAxis extends View{
    private String[] mStrings;
    private float textsize=25;
    private int lineColor= Color.BLACK;
    private int textColor=Color.BLACK;

    public XAxis(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setTextSize(textsize);
        paint.setColor(lineColor);
        canvas.drawLine(0,0,getWidth(),0,paint);
        if (mStrings==null||mStrings.length==0){
            return;
        }

        int width=getWidth()/mStrings.length;
        for (int i = 0; i < mStrings.length; i++) {
            canvas.drawText(mStrings[i],i*width,50,paint);
        }
    }

    public String[] getStrings() {
        return mStrings;
    }

    public void setStrings(String[] strings) {
        mStrings = strings;
        invalidate();
    }

    public float getTextsize() {
        return textsize;
    }

    public void setTextsize(float textsize) {
        this.textsize = textsize;
        invalidate();
    }

    public int getLineColor() {
        return lineColor;
    }

    public void setLineColor(int lineColor) {
        this.lineColor = lineColor;
        invalidate();
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
        invalidate();
    }
}

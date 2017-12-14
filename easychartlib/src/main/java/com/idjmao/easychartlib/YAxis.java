package com.idjmao.easychartlib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 1djmao on 2017/12/14.
 */

public class YAxis extends View{

    int loc=2;
    public static final int LOC_LEFT=1;
    public static final int LOC_RIGHT=2;

    private String[] mStrings;


    public YAxis(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Paint paint=new Paint();
        paint.setStrokeWidth(5);
        paint.setTextSize(35);

        if (loc==LOC_LEFT){

        }else if (loc==LOC_RIGHT){
            canvas.drawLine(0,0,0,getHeight(),paint);
            if (mStrings==null||mStrings.length==0){

                return;
            }
            int high=getHeight()/mStrings.length-50;
            for (int i = 0; i < mStrings.length; i++) {
                String s=mStrings[i];
                canvas.drawText(s,5,getHeight()-i*high,paint);
            }
        }

    }

    public String[] getStrings() {
        return mStrings;
    }

    public void setStrings(String[] strings) {
        mStrings = strings;
        invalidate();
    }
}

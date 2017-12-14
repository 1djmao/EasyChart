package com.idjmao.easychartlib;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;

/**
 * Created by 1djmao on 2017/12/14.
 */

public class BarChart extends ConstraintLayout{

    public BarChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_barchart, this);

        ((BarView)findViewById(R.id.barview)).setFloats(new float[]{1,2,3,10});
        ((BarView)findViewById(R.id.barview)).setMaxVal(10);
        ((YAxis)findViewById(R.id.y_axis_right)).setStrings(new String[]{"1","2","3","4"});
        ((XAxis)findViewById(R.id.x_axis)).setStrings(new String[]{"第一周","第二周","第三周","第四周"});


    }


}

package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatImageView;

public class CustomRatioImageView extends AppCompatImageView {

    private static final int TWO = 2;
    private static final int THREE = 3;

    public CustomRatioImageView(Context context) {
        super(context);
    }

    public CustomRatioImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRatioImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeTwoHeight = View.MeasureSpec.getSize(widthMeasureSpec) * TWO / THREE;
        int threeTwoHeightSpec =
                View.MeasureSpec.makeMeasureSpec(threeTwoHeight, View.MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec);
    }
}
package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import com.hencoder.hencoderpracticedraw6.Utils;

/**
 * description：
 * author：bux on 2019/10/26 14:33
 * email: 471025316@qq.com
 */
public class CustomBtn extends androidx.appcompat.widget.AppCompatButton {
    private static final String TAG = "CustomBtn";
    public CustomBtn(Context context) {
        super(context);
    }

    public CustomBtn(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomBtn(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
       /* setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d(TAG, "onTouch: "+ Utils.actionToString(event.getAction()));
                return false;
            }
        });*/
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: "+Utils.actionToString(event.getAction()));
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


}

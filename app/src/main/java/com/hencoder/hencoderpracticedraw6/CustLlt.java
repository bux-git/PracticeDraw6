package com.hencoder.hencoderpracticedraw6;

import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * description：
 * author：bux on 2019/10/26 14:37
 * email: 471025316@qq.com
 */
public class CustLlt extends LinearLayout {
    private static final String TAG = "CustLlt";
    public CustLlt(Context context) {
        super(context);
    }

    public CustLlt(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustLlt(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustLlt(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: "+Utils.actionToString(event.getAction()));

        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "dispatchTouchEvent: "+Utils.actionToString(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG, "onInterceptTouchEvent: "+Utils.actionToString(ev.getAction()));
        return super.onInterceptTouchEvent(ev);
    }


}

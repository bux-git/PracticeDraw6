package com.hencoder.hencoderpracticedraw6;

import android.content.res.Resources;
import android.util.DisplayMetrics;

public class Utils {
    public static float dpToPixel(float dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return dp * metrics.density;
    }


    public static String actionToString(int action){
        String result="";
        switch (action) {
            case 0:
                result="ACTION_DOWN";
                break;
            case 1:
                result="ACTION_UP";
                break;
            case 2:
                result="ACTION_MOVE";
                break;
            case 3:
                result="ACTION_CANCEL";
                break;
            case 4:
                result="ACTION_OUTSIDE";
                break;
            case 5:
                result="ACTION_POINTER_DOWN";
                break;
            case 6:
                result="ACTION_POINTER_UP";
                break;
            case 7:
                result="ACTION_HOVER_MOVE";
                break;
            case 8:
                result="ACTION_SCROLL";
                break;
                default:
        }
        return result;
    }
}

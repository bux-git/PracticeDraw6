package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

import static android.os.Build.VERSION.SDK_INT;
import static com.hencoder.hencoderpracticedraw6.Utils.dpToPixel;

public class Practice01Translation extends RelativeLayout {
    private static final String TAG = "Practice01Translation";
    Button animateBt;
    ImageView imageView;

    private int mCurIndex = 0;
    private int count = SDK_INT > Build.VERSION_CODES.LOLLIPOP ? 5 : 4;

    public Practice01Translation(Context context) {
        super(context);
    }

    public Practice01Translation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01Translation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);
        if (SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            // 给音乐图标加上合适的阴影
            imageView.setOutlineProvider(new MusicOutlineProvider());
        }

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {

                switch (mCurIndex) {
                    case 0:
                        imageView.animate().translationX(200);
                        break;
                    case 1:
                        imageView.animate().translationX(0);
                        break;
                    case 2:
                        imageView.animate().translationY(200);
                        break;
                    case 3:
                        imageView.animate().translationY(-100);
                        break;
                    case 4:
                        if (SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            imageView.animate().translationZ(15);
                        }
                        break;
                    case 5:
                        if (SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            imageView.animate().translationZ(5);
                        }
                        break;
                    default:

                }
                mCurIndex++;
                if (mCurIndex > count) {
                    mCurIndex = 0;
                }
            }
        });


    }

    Path path = new Path();
    Paint mPaint = new Paint();

    {

        path.moveTo(50, dpToPixel(10));
        path.lineTo(dpToPixel(7), dpToPixel(2));
        path.lineTo(dpToPixel(116), dpToPixel(58));
        path.lineTo(dpToPixel(116), dpToPixel(70));
        path.lineTo(dpToPixel(7), dpToPixel(128));
        path.lineTo(50, dpToPixel(120));
        path.close();
        mPaint.setStyle(Paint.Style.STROKE);
    }


    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(path, mPaint);
    }


    /**
     * 为音乐图标设置三角形的 Outline。
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    class MusicOutlineProvider extends ViewOutlineProvider {
        Path path = new Path();

        {
            path.moveTo(0, dpToPixel(10));
            path.lineTo(dpToPixel(7), dpToPixel(2));
            path.lineTo(dpToPixel(116), dpToPixel(58));
            path.lineTo(dpToPixel(116), dpToPixel(70));
            path.lineTo(dpToPixel(7), dpToPixel(128));
            path.lineTo(0, dpToPixel(120));
            path.close();
        }

        @Override
        public void getOutline(View view, Outline outline) {
            outline.setConvexPath(path);
        }
    }
}
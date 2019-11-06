package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private int mCurIndex = 0;
    private int count =5;
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                switch (mCurIndex) {
                    case 0:
                        imageView.animate().rotationX(180);
                        break;
                    case 1:
                        imageView.animate().rotationX(0);
                        break;
                    case 2:
                        imageView.animate().rotationY(180);
                        break;
                    case 3:
                        imageView.animate().rotationY(0);
                        break;
                    case 4:
                        imageView.animate().rotation(180);
                        break;
                    case 5:
                        imageView.animate().rotation(0);
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
}
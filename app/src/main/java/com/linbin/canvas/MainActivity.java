package com.linbin.canvas;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mImage = (ImageView) findViewById(R.id.iv);

        Bitmap canvasBitmap;
        canvasBitmap = Bitmap.createBitmap(320,480, Bitmap.Config.ARGB_8888);

        Bitmap srcBitmap = ((BitmapDrawable)getResources().getDrawable(R.drawable.test)).getBitmap();
        Canvas canvas = new Canvas();
        canvas.setBitmap(canvasBitmap);
        Paint paint = new Paint();
        canvas.drawBitmap(srcBitmap,0,0,paint);
        mImage.setImageBitmap(canvasBitmap);


    }

}

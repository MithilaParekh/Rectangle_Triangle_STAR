package com.example.rectangle.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;


public class MyCanvas extends View {

    Paint paint;
    Rect rect;

    public MyCanvas(Context context) {
        super(context);

        paint = new Paint();
        rect = new Rect();

    }


    @Override
    protected void onDraw(Canvas canvas) {
     paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        rect.left = 100;
        rect.top = 200;
        rect.right = rect.left + 150;
        rect.bottom = rect.top + 150;
        canvas.drawRect(rect, paint);
        //paint.setColor(Color.RED);

       int cx= 700;
        int cy= 1500;
        canvas.drawCircle(cx,cy,150,paint);

        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(35f);
        canvas.drawText(  "Graphics Rotation", 40, 180, paint);

       paint.setColor(Color.GREEN);
        int halfWidth = 250;

        int x=500;int y=500;
        Path path = new Path();
        path.moveTo(x, y-halfWidth ); // Top
        path.lineTo(x - halfWidth, y + halfWidth); // Bottom left
        path.lineTo(x + halfWidth, y + halfWidth); // Bottom right
        path.lineTo(x, y - halfWidth); // Back to Top
        path.close();
        canvas.drawPath(path, paint);


       paint.setColor(Color.BLUE);
        paint.setStrokeWidth(5);
        int halfWidth1 = 250;
        //int halfWidth2=350;
        int x1=500;int y1=500;
        Path path1 = new Path();
        Path path2=new Path();
        path1.moveTo(x1, y1+halfWidth1 ); // Top
        path1.lineTo(x1+halfWidth1,y1-125);
        path1.lineTo(x1-halfWidth1,y1-125);
        path1.moveTo(x1, y1+halfWidth1 );
        path2.moveTo(x1, y1-halfWidth1 ); // Top
        path2.lineTo(x1-halfWidth1,y1+125);
        path2.lineTo(x1+halfWidth1,y1+125);
        path2.moveTo(x1, y1-halfWidth1 );
        canvas.drawPath(path1, paint);
        //paint.setColor(Color.RED);
        canvas.drawPath(path2, paint);
       /* paint.setColor(Color.GREEN);
        int halfWidth1 = 500 / 2;

        int x1=1500;int y1=1500;
        Path path1 = new Path();*/



        /*path1.moveTo(x, y - halfWidth1); // Top
        path1.lineTo(x - halfWidth1, y + halfWidth1); // Bottom left
        path1.lineTo(x + halfWidth1, y + halfWidth1); // Bottom right
        path1.lineTo(x, y - halfWidth1); // Back to Top
        path1.close();*/
        //canvas.drawPath(path1, paint);




        super.onDraw(canvas);
    }

}

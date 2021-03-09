package com.example.iq_step.GUI;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

import com.example.iq_step.R;
import com.example.iq_step.code.Board;

public class BoardView extends View {

//    private ShapeDrawable drawable;
//    Board board = new Board();

    Rect rectangle;
    Paint paint = new Paint();

    public BoardView(Context context) {

        super(context);

        int x = 50;
        int y = 50;
        int sideLength = 200;

        // create a rectangle that we'll draw later
        rectangle = new Rect(x, y, sideLength, sideLength);

        // create the Paint and set its color
        paint = new Paint();
        paint.setColor(Color.GRAY);

    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawRect(rectangle, paint);

    }
}

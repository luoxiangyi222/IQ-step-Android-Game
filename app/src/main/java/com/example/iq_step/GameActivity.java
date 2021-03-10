package com.example.iq_step;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class GameActivity extends AppCompatActivity implements View.OnLongClickListener, View.OnClickListener, View.OnDragListener {


    private View aa;
    private View ba;
    private View ca;
    private View da;
    private View ea;
    private View fa;
    private View ga;
    private View ha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Change orientation to landscape
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        // Load XML file
        setContentView(R.layout.activity_game);

        // Find all chess and set event listener
        aa = findViewById(R.id.aa);

        aa.setOnClickListener(this);
        aa.setOnLongClickListener(this);

    }

    @Override
    public boolean onLongClick(View view){

        // FIXME: If the view is long clicked, flip it.
        view.setVisibility(View.INVISIBLE);
        return true;
    }

    @Override
    public void onClick(View view) {
        // FIXME: If the view is clicked, right rotate.

    }

    @Override
    public boolean onDrag(View view, DragEvent event) {
        // FIXME: Zoom in the chess and move with the touch.
        final int action = event.getAction();

        switch (action){
            case DragEvent.ACTION_DRAG_STARTED:
                return true;
        }
        return false;
    }

}
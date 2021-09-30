package com.ravenioet.animationlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.google.android.material.button.MaterialButton;
import com.ravenioet.animator.Animate;

public class MainActivity extends AppCompatActivity {
    MaterialButton top,bottom,right,left;
    ProgressBar center;
    ImageView star;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_ui();
    }
    public void init_ui(){
        top = findViewById(R.id.top);
        bottom = findViewById(R.id.bottom);
        right = findViewById(R.id.right);
        left = findViewById(R.id.left);
        center = findViewById(R.id.center);
        star = findViewById(R.id.star);
        setup_actions();
    }
    boolean in_top = false;
    boolean out_top = false;
    boolean in_right = false;
    boolean out_right = false;
    boolean in_left = false;
    boolean out_left = false;
    boolean in_bottom = false;
    boolean out_bottom = false;
    public void setup_actions(){
        top.setOnClickListener(v -> {
            if(!in_top){
                star.setAnimation(Animate.inFromTopAnimation(500));
                star.setVisibility(View.VISIBLE);
                in_top = true;
            }else {
                star.setAnimation(Animate.outToTopAnimation(500));
                star.setVisibility(View.GONE);
                out_top = true;
                in_top = false;
            }
        });
        bottom.setOnClickListener(v -> {
            if(!in_bottom){
                star.setAnimation(Animate.inFromBottomAnimation(500));
                star.setVisibility(View.VISIBLE);
                in_bottom = true;
            }else {
                star.setAnimation(Animate.outToBottomAnimation(500));
                star.setVisibility(View.GONE);
                out_bottom = true;
                in_bottom = false;
            }
        });
        right.setOnClickListener(v -> {
            if(!in_right){
                star.setAnimation(Animate.inFromRightAnimation(500));
                star.setVisibility(View.VISIBLE);
                in_right = true;
            }else {
                star.setAnimation(Animate.outToRightAnimation(500));
                star.setVisibility(View.GONE);
                out_right = true;
                in_right = false;
            }
        });
        left.setOnClickListener(v -> {
            if(!in_left){
                star.setAnimation(Animate.inFromLeftAnimation(500));
                star.setVisibility(View.VISIBLE);
                in_left = true;
            }else {
                star.setAnimation(Animate.outToLeftAnimation(500));
                star.setVisibility(View.GONE);
                out_left = true;
                in_left = false;
            }
        });

    }
}
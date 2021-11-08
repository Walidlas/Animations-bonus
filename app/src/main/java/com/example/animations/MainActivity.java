package com.example.animations;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView image = findViewById(R.id.image);
// zoom in animation
        findViewById(R.id.buttonZoomIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_in
                ));
            }
        });
// zoom out animation
        findViewById(R.id.buttonZoomOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_out
                ));
            }
        });
// fade in animation
        findViewById(R.id.buttonFadeIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_in
                ));
            }
        });
// fade out animation
        findViewById(R.id.buttonFadeOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_out
                ));
            }
        });
// slide left animation
        findViewById(R.id.buttonSlideLeft).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_left
                ));
            }
        });
// slide right animation
        findViewById(R.id.buttonSlideRight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_righ
                ));
            }
        });
// slide up animation
        findViewById(R.id.buttonSlideUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_up
                ));
            }
        });
// slide down animation
        findViewById(R.id.buttonSlideDown).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_down
                ));
            }
        });
// zoom in and fade in animation
        findViewById(R.id.buttonZoomInFadeIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_in_fade_in
                ));
            }
        });
// zoom out and fade out animation
        findViewById(R.id.buttonZoomOutFadeOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_out_fade_out
                ));
            }
        });
// rotate animation
        findViewById(R.id.buttonRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.rotate
                ));
            }
        });
// move animation
        findViewById(R.id.buttonMove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.move
                ));
            }
        });
    }
}
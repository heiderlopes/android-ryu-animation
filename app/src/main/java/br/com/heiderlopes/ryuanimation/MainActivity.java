package br.com.heiderlopes.ryuanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable frameAnimation;
    private ImageView ivRyu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivRyu = (ImageView)findViewById(R.id.ivRyu);
        ivRyu.setBackgroundResource(R.drawable.frame_animation_list);

        frameAnimation = (AnimationDrawable) ivRyu.getBackground();

        //Definir true se a animacao sera executada somente uma vez
        //frameAnimation.setOneShot(true);

        frameAnimation.start();
    }
}

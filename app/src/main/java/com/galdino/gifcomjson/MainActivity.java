package com.galdino.gifcomjson;

import android.animation.Animator;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.galdino.gifcomjson.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding mBinding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mBinding.btShowPoint.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()== mBinding.btShowPoint.getId())
        {
            mBinding.lavPoint.setVisibility(View.VISIBLE);
            mBinding.lavPoint.playAnimation();
            mBinding.lavPoint.addAnimatorListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animator) {

                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    mBinding.lavPoint.setVisibility(View.INVISIBLE);
                }

                @Override
                public void onAnimationCancel(Animator animator) {

                }

                @Override
                public void onAnimationRepeat(Animator animator) {

                }
            });
        }
    }
}

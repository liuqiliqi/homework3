package edu.zju.homework3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentC extends Fragment {

    private Button bt;
    private ImageView ima;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragmentc, container, false);

    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        View imageview =getView().findViewById(R.id.imageView5);
        super.onViewCreated(view, savedInstanceState);
        bt=(Button) getView().findViewById(R.id.button3);
        ima =(ImageView) getView().findViewById(R.id.imageView5);
        final Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(),R.anim.sca);
        final ObjectAnimator ani1 = ObjectAnimator.ofFloat(ima,"scaleX",1.0f,2.0f);
        ani1.setRepeatCount(ValueAnimator.INFINITE);
        ani1.setInterpolator(new LinearInterpolator());
        ani1.setDuration(400);
        ani1.setRepeatMode(ValueAnimator.REVERSE);


        final ObjectAnimator ani2 = ObjectAnimator.ofFloat(imageview,"scaleY",2.0f,1.0f);
        ani2.setRepeatCount(ValueAnimator.INFINITE);
        ani2.setInterpolator(new LinearInterpolator());
        ani2.setDuration(400);
        ani2.setRepeatMode(ValueAnimator.REVERSE);

        final ObjectAnimator ani3 = ObjectAnimator.ofFloat(imageview,"alpha",1.0f,0.2f);
        ani3.setRepeatCount(ValueAnimator.INFINITE);
        ani3.setInterpolator(new LinearInterpolator());
        ani3.setDuration(400);
        ani3.setRepeatMode(ValueAnimator.REVERSE);
        final AnimatorSet setAnimation = new AnimatorSet();
        setAnimation.playTogether(ani1,ani2,ani3);

        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setAnimation.start();
            }
        });
    }
}

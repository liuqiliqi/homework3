package edu.zju.homework3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {
    private Button bt;
    private ImageView ima;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bt=(Button) getView().findViewById(R.id.button2);
        ima =(ImageView) getView().findViewById(R.id.imageView4);
        final Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(),R.anim.disappear);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ima.startAnimation(loadAnimation);
            }
        });
    }
}

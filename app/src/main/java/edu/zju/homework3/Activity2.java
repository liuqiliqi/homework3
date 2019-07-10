package edu.zju.homework3;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Activity2 extends AppCompatActivity {
    private Button bt_A;
    private Button bt_B;
    private Button bt_C;
    private Button bt_D;
    private int correntfra;
    private Animation loadAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act2);
        correntfra=1;
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fra_con,new FragmentA());
        transaction.commit();
        bt_A=(Button)findViewById(R.id.bt_turn);
        bt_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correntfra==1){
                    Toast.makeText(Activity2.this,"已经在该页面了",Toast.LENGTH_LONG).show();
                }
                else{

                    FragmentManager manager=getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.addToBackStack(null);
                    transaction.replace(R.id.fra_con,new FragmentA());
                    transaction.commit();
                    correntfra=1;
                }

            }
        });
        bt_B=(Button)findViewById(R.id.bt_turnb);
        bt_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correntfra==2){
                    Toast.makeText(Activity2.this,"已经在该页面了",Toast.LENGTH_LONG).show();
                }
                else{
                    FragmentManager manager=getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.addToBackStack(null);
                    transaction.replace(R.id.fra_con,new FragmentB());
                    transaction.commit();
                    correntfra=2;
                }

            }
        });
        bt_C=(Button)findViewById(R.id.bt_turnc);
        bt_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correntfra==3){
                    Toast.makeText(Activity2.this,"已经在该页面了",Toast.LENGTH_LONG).show();
                }
                else{
                    FragmentManager manager=getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.addToBackStack(null);
                    transaction.replace(R.id.fra_con,new FragmentC());
                    transaction.commit();
                    correntfra=3;
                }

            }
        });
        bt_C=(Button)findViewById(R.id.bt_turnc);
        bt_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correntfra==3){
                    Toast.makeText(Activity2.this,"已经在该页面了",Toast.LENGTH_LONG).show();
                }
                else{
                    FragmentManager manager=getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.addToBackStack(null);
                    transaction.replace(R.id.fra_con,new FragmentC());
                    transaction.commit();
                    correntfra=3;
                }

            }
        });
        bt_D=(Button)findViewById(R.id.bt_turnd);
        bt_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correntfra==4){
                    Toast.makeText(Activity2.this,"已经在该页面了",Toast.LENGTH_LONG).show();
                }
                else{
                    FragmentManager manager=getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.addToBackStack(null);
                    transaction.replace(R.id.fra_con,new FragmentD());
                    transaction.commit();
                    correntfra=4;
                }

            }
        });
        //Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fra_con);
        //if (fragment instanceof FragmentA)



    }


}

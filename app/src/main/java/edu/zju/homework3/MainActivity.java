package edu.zju.homework3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private List<filelist> mDatas;
    private myRecycleradatper recycleAdapter;
    private Button bt_insert;
    private Button bt_pa;
    Map<String, Integer> drawableMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatas = new ArrayList<filelist>();
        String zt = "paris";
        filelist fl;
        for (int i = 0; i < 50; i++) {
            zt = "paris";
            fl = new filelist(zt);
            mDatas.add(fl);
            zt = "beijing";
            fl = new filelist(zt);
            mDatas.add(fl);
            zt = "london";
            fl = new filelist(zt);
            mDatas.add(fl);
        }


        bt_insert = findViewById(R.id.bt_lifecycle);
        bt_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
        bt_pa = findViewById(R.id.button5);
        bt_pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_view_pager.class);
                startActivity(intent);
            }
        });
        recycleAdapter=new myRecycleradatper(this,mDatas);
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.mlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recycleAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }



}

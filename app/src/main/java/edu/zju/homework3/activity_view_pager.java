package edu.zju.homework3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class activity_view_pager extends AppCompatActivity {

    private static final int PAGE_COUNT = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ViewPager pager = (ViewPager)findViewById(R.id.vip);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab);

        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                switch (i){
                    case 0 :return new FragmentD();
                    case 1: return new FragmentA();
                    case 2: return new FragmentB();
                    case 3: return new FragmentC();
                    case 4: return new FragmentD();
                }
                return new FragmentD();
            }

            @Override
            public int getCount() {
                return PAGE_COUNT;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return "Hello " + position;
            }
        });
        tabLayout.setupWithViewPager(pager);
    }
}

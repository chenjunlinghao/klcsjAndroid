package com.chenjl.klcsj.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.chenjl.klcsj.klcsjandroid.R;
import com.chenjl.klcsj.view.Adapter.HomeViewPagerAdapter;
import com.chenjl.klcsj.view.fragment.FamilyFragment;
import com.chenjl.klcsj.view.fragment.FoodFragment;
import com.chenjl.klcsj.view.fragment.HappyFragment;
import com.chenjl.klcsj.view.fragment.HealthyFragment;
import com.chenjl.klcsj.view.fragment.WealthyFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.home_viewPager)
//    ViewPager viewPager;
//    @BindView(R.id.bottom_navigation)
//    BottomNavigationView bottomNavigationView;

    private HomeViewPagerAdapter viewPagerAdapter;
    private List<Fragment> fragments = new ArrayList<Fragment>();
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;
    private MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        viewPager = (ViewPager) findViewById(R.id.home_viewPager);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        viewPagerAdapter = new HomeViewPagerAdapter(getSupportFragmentManager());
        /**********装入5个fragment并以此初始化adapter**********/
        viewPagerAdapter.addFragment(new HealthyFragment());
        viewPagerAdapter.addFragment(new HappyFragment());
        viewPagerAdapter.addFragment(new WealthyFragment());
        viewPagerAdapter.addFragment(new FoodFragment());
        viewPagerAdapter.addFragment(new FamilyFragment());

        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(0);    //默认显示“康（健康）”页面

        /**********关联fragment到底部导航栏**********/
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_healthy:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.bottom_happy:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.bottom_wealth:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.bottom_food:
                        viewPager.setCurrentItem(3);
                        break;
                    case R.id.bottom_family:
                        viewPager.setCurrentItem(4);
                        break;
                }
                return false;
            }
        });

        /**********禁止ViewPager滑动**********/
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
    }

}

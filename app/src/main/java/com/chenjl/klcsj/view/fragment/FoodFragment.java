package com.chenjl.klcsj.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.chenjl.klcsj.klcsjandroid.R;
import com.chenjl.klcsj.view.activity.fo.dailyMeals.DailyMealsActivity;


public class FoodFragment extends Fragment {

    private Button btnDailyMeals;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.food_fragment_layout,null);
        initView();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /***********“每日食谱”功能跳转***********/
        btnDailyMeals = (Button)getActivity().findViewById(R.id.daily_meals);
        btnDailyMeals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"每日食谱", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DailyMealsActivity.class);
                startActivity(intent);
            }
        });
    }


    public void initView(){
    }
}

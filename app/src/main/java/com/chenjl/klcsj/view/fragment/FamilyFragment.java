package com.chenjl.klcsj.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chenjl.klcsj.klcsjandroid.R;

/**
 * Created by Administrator on 2017/4/27.
 */

public class FamilyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.family_fragment_layout,null);
        return view;
    }
}

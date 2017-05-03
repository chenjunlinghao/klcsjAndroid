package com.chenjl.klcsj.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.chenjl.klcsj.klcsjandroid.R;

import butterknife.BindView;

/*函数名称：HealthyFragment
* 主要功能："康"对应的页面
* 注意事项：
* 原始作者：陈俊岭2017/5/3 22:42
*/
public class HealthyFragment extends Fragment {

    private Button btnTestMap;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.healthy_fragment_layout,null);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        initView();
//        initData();
    }

    public void initView(){
        btnTestMap = (Button)getActivity().findViewById(R.id.btn_test_map);

    }
}

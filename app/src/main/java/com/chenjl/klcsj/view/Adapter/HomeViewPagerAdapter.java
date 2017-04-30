package com.chenjl.klcsj.view.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/*函数名称：HomeViewPagerAdapter
* 主要功能：首页五个viewpager的Adapter，完成五个fragment的切换
* 实现步骤：
* 注意事项：
* 原始作者：陈俊岭2017/4/30 11:49
*/
public class HomeViewPagerAdapter extends FragmentPagerAdapter{

    private final List<Fragment> fragments = new ArrayList<>();

    public HomeViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    public void addFragment(Fragment fragment){fragments.add(fragment);}

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}

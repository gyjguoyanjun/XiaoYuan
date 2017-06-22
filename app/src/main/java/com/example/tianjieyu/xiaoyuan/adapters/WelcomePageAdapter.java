package com.example.tianjieyu.xiaoyuan.adapters;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by tianjieyu on 2017/6/20.
 */

public class WelcomePageAdapter extends PagerAdapter {

    //界面列表
    private ArrayList<View> views;

    public WelcomePageAdapter (ArrayList<View> views){
        this.views = views;
    }

    /**
     * 获得当前界面数
     */
    @Override
    public int getCount() {
        if (views != null) {
            return views.size();
        }
        return 0;
    }

    /**
     * 初始化position位置的界面
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = views.get(position % views.size());

        ViewPager parent = (ViewPager) view.getParent();
        if (parent!= null) {
            parent.removeView(view);
        }
        container.addView(view);

        return view;
    }

    /**
     * 判断是否由对象生成界面
     */
    @Override
    public boolean isViewFromObject(View view, Object arg1) {
        return (view == arg1);
    }

    /**
     * 销毁position位置的界面
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //super.destroyItem(container, position, object);
        container.removeView(views.get(position % views.size()));
    }
}

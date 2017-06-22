package com.example.tianjieyu.xiaoyuan.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tianjieyu.xiaoyuan.R;
import com.example.tianjieyu.xiaoyuan.activities.PresonSettingActivity;
import com.example.tianjieyu.xiaoyuan.activities.MyFollowActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 类用途:
 * 作者:崔涵淞
 * 时间: 2017/6/21 15:37.
 */

public class GeRenZhongXinFragment extends Fragment {
    @BindView(R.id.iv_update_gerenzhongxin)
    ImageView ivUpdateGerenzhongxin;
    Unbinder unbinder;
    @BindView(R.id.ly_guanzhu_gerenzhongxin)
    AutoLinearLayout lyGuanzhuGerenzhongxin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gerenzhongxin, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ivUpdateGerenzhongxin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PresonSettingActivity.class);
                startActivity(intent);
            }
        });

        lyGuanzhuGerenzhongxin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyFollowActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}

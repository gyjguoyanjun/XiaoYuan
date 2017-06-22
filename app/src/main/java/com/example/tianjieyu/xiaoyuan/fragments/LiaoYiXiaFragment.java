package com.example.tianjieyu.xiaoyuan.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tianjieyu.xiaoyuan.R;
import com.example.tianjieyu.xiaoyuan.adapters.LiaoYiXiaRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 类用途:
 * 作者:崔涵淞
 * 时间: 2017/6/21 15:34.
 */

public class LiaoYiXiaFragment extends Fragment {
    private Toolbar tb_liaoyixia;
    private RecyclerView rv_liaoyixia;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.liaoyixia, null);
        initView(inflate);
        return inflate;

    }

    private void initView(View inflate) {

        tb_liaoyixia = (Toolbar) inflate.findViewById(R.id.tb_liaoyixia);
        rv_liaoyixia = (RecyclerView) inflate.findViewById(R.id.rv_liaoyixia);
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringList.add("粉色的丝带"+i);
        }
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rv_liaoyixia.setLayoutManager(manager);
        LiaoYiXiaRecycleAdapter adapter = new LiaoYiXiaRecycleAdapter(stringList,getActivity());
        rv_liaoyixia.setAdapter(adapter);

    }
}

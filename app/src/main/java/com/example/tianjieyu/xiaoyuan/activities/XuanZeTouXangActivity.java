package com.example.tianjieyu.xiaoyuan.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.tianjieyu.xiaoyuan.R;
import com.example.tianjieyu.xiaoyuan.adapters.TouXiangAdapter;
import com.example.tianjieyu.xiaoyuan.beans.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 类用途:
 * 作者:崔涵淞
 * 时间: 2017/6/21 15:38.
 */

public class XuanZeTouXangActivity extends AppCompatActivity {
    private RecyclerView touxiang_rc;
    private int[] pic = new int[]{R.mipmap.photo1, R.mipmap.photo2,
            R.mipmap.photo3, R.mipmap.photo4, R.mipmap.photo5, R.mipmap.photo6,
            R.mipmap.photo7, R.mipmap.photo8, R.mipmap.photo9, R.mipmap.photo10,
            R.mipmap.photo11, R.mipmap.photo12, R.mipmap.photo13, R.mipmap.photo14,};
    private List<Bean> mPicList;
    private Toolbar tb_touxiang;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touxiang);
        tb_touxiang = (Toolbar) findViewById(R.id.tb_touxiang);
        tb_touxiang.setTitle("");
        setSupportActionBar(tb_touxiang);
        getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initView();
    }

    private void initView() {
        mPicList = new ArrayList<>();
        for (int i = 0; i < pic.length; i++) {
            Bean bean = new Bean();
            bean.setPic(pic[i]);
            mPicList.add(bean);
        }
        touxiang_rc = (RecyclerView) findViewById(R.id.touxiang_rc);
        GridLayoutManager manager = new GridLayoutManager(this, 4);
        touxiang_rc.setLayoutManager(manager);
        TouXiangAdapter adapter = new TouXiangAdapter(XuanZeTouXangActivity.this, mPicList);
        touxiang_rc.setAdapter(adapter);

        tb_touxiang.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}

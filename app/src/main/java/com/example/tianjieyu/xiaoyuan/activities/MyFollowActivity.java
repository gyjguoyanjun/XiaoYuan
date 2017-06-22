package com.example.tianjieyu.xiaoyuan.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.tianjieyu.xiaoyuan.R;
import com.example.tianjieyu.xiaoyuan.adapters.MyfollowRecycleAdapter;

public class MyFollowActivity extends AppCompatActivity {

    private RecyclerView my_follow_recycleView;
    private Toolbar tb_my_follow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_follow);
        tb_my_follow = (Toolbar) findViewById(R.id.tb_my_follow);
        tb_my_follow.setTitle("");
        setSupportActionBar(tb_my_follow);
        getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initView();

    }

    private void initView() {
        my_follow_recycleView = (RecyclerView) findViewById(R.id.my_follow_recycleView);
        MyfollowRecycleAdapter myfollowRecycleAdapter = new MyfollowRecycleAdapter("粉色的丝带");
        LinearLayoutManager manager = new LinearLayoutManager(this);
        my_follow_recycleView.setLayoutManager(manager);
        my_follow_recycleView.setAdapter(myfollowRecycleAdapter);

        tb_my_follow.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

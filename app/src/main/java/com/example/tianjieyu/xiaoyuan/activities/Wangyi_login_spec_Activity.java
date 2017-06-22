package com.example.tianjieyu.xiaoyuan.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tianjieyu.xiaoyuan.MainActivity;
import com.example.tianjieyu.xiaoyuan.R;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Wangyi_login_spec_Activity extends AppCompatActivity {

    @BindView(R.id.btn_wangyi_spec_login_activity)
    Button btnWangyiSpecLoginActivity;
    @BindView(R.id.activity_main)
    AutoLinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wangyi_login_spec_);
        ButterKnife.bind(this);

        onInitListener();
    }

    private void onInitListener() {
        btnWangyiSpecLoginActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wangyi_login_spec_Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

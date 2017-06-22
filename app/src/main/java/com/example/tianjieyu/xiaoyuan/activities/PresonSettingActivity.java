package com.example.tianjieyu.xiaoyuan.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.tianjieyu.xiaoyuan.MainActivity;
import com.example.tianjieyu.xiaoyuan.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;


public class PresonSettingActivity extends AppCompatActivity {

    @BindView(R.id.btn_finish_setting_preson_activity)
    Button btnFinishSettingPresonActivity;
    @BindView(R.id.toolBar_preson_setting_activity)
    Toolbar toolBarPresonSettingActivity;
    @BindView(R.id.iv_headPortrait_setting_preson_activity)
    CircleImageView ivHeadPortraitSettingPresonActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preson_setting);
        ButterKnife.bind(this);

        onInitListener();
    }

    private void onInitListener() {
        ivHeadPortraitSettingPresonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PresonSettingActivity.this, XuanZeTouXangActivity.class);
                startActivity(intent);
            }
        });
        btnFinishSettingPresonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PresonSettingActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

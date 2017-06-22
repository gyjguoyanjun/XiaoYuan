package com.example.tianjieyu.xiaoyuan.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tianjieyu.xiaoyuan.R;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Binding_music_Activity extends AppCompatActivity {

    @BindView(R.id.btn_bind_music_activity)
    Button btnBindMusicActivity;
    @BindView(R.id.ly_bind_wangyi_music)
    AutoLinearLayout lyBindWangyiMusic;
    @BindView(R.id.ly_bind_xiami_music)
    AutoLinearLayout lyBindXiamiMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binding_music_);
        ButterKnife.bind(this);

        onInitListener();
    }

    private void onInitListener() {
        lyBindWangyiMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Binding_music_Activity.this,Wangyi_login_spec_Activity.class);
                startActivity(intent);

            }
        });
        btnBindMusicActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Binding_music_Activity.this, PresonSettingActivity.class);
                startActivity(intent);

            }
        });
    }

}

package com.example.tianjieyu.xiaoyuan;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import com.example.tianjieyu.xiaoyuan.fragments.GeRenZhongXinFragment;
import com.example.tianjieyu.xiaoyuan.fragments.LiaoYiXiaFragment;
import com.example.tianjieyu.xiaoyuan.fragments.YouYuanRenFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//jinhu 20:48 20170622
    @BindView(R.id.btn_youyuanren_main_activity)
    RadioButton btnYouyuanrenMainActivity;
    @BindView(R.id.btn_liaoyixia_main_activity)
    RadioButton btnLiaoyixiaMainActivity;
    @BindView(R.id.btn_me_main_activity)
    RadioButton btnMeMainActivity;
    private YouYuanRenFragment youyuanren;
    private LiaoYiXiaFragment liaoyixia;
    private FragmentManager manager;
    private GeRenZhongXinFragment gerenzhongxin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initData();
        onInitListener();
    }

    private void onInitListener() {
        btnYouyuanrenMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.show(youyuanren);
                transaction.hide(liaoyixia);
                transaction.hide(gerenzhongxin);
                transaction.commit();
            }
        });
        btnLiaoyixiaMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.hide(youyuanren);
                transaction.show(liaoyixia);
                transaction.hide(gerenzhongxin);
                transaction.commit();
            }
        });
        btnMeMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.hide(youyuanren);
                transaction.hide(liaoyixia);
                transaction.show(gerenzhongxin);
                transaction.commit();
            }
        });
    }

    private void initData() {
        youyuanren = new YouYuanRenFragment();
        liaoyixia = new LiaoYiXiaFragment();
        gerenzhongxin = new GeRenZhongXinFragment();
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_layout_main_activity, youyuanren, "tag1");
        transaction.add(R.id.frame_layout_main_activity, liaoyixia, "tag2");
        transaction.add(R.id.frame_layout_main_activity, gerenzhongxin, "tag3");

        transaction.show(youyuanren);
        transaction.hide(liaoyixia);
        transaction.hide(gerenzhongxin);

        transaction.commit();

    }


}

package com.example.tianjieyu.xiaoyuan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tianjieyu.xiaoyuan.activities.Binding_music_Activity;
import com.example.tianjieyu.xiaoyuan.adapters.WelcomePageAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WelcomeActivity extends AppCompatActivity {

    @BindView(R.id.vp_welcome_activity)
    ViewPager vpWelcomeActivity;

    private View v;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initState();
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    private void initView() {
        v = View.inflate(this, R.layout.welcome_view_layout,null);
        button = (Button) v.findViewById(R.id.btn_welcome_activity);

    }

    /**
     * 透明状态栏
     */
    private void initState() {
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT);
        }
    }

    /**
     * 初始化数据
     */
    private void initData() {
        ArrayList<View> imageArrayList = new ArrayList<>();
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.mipmap.yindaoye1);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageArrayList.add(imageView);
        imageArrayList.add(v);
        WelcomePageAdapter adapter = new WelcomePageAdapter(imageArrayList);
        vpWelcomeActivity.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, Binding_music_Activity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}

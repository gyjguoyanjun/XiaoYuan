package com.example.tianjieyu.xiaoyuan;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.tianjieyu.xiaoyuan.adapters.FriendRecyclerAdapter;
import com.example.tianjieyu.xiaoyuan.beans.MusicInfo;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class FriendActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_friend_activity)
    ImageView ivBackFriendActivity;
    @BindView(R.id.touxiang)
    CircleImageView touxiang;
    @BindView(R.id.rv_like_friend_activity)
    RecyclerView rvLikeFriendActivity;
    @BindView(R.id.rv_listen_friend_activity)
    RecyclerView rvListenFriendActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initState();
        setContentView(R.layout.activity_friend);
        ButterKnife.bind(this);
        initData();
    }

    /**
     * 透明状态栏
     */
    private void initState() {
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    );
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
    private void initData() {
        List<MusicInfo> list = new ArrayList<>();
        list.add(new MusicInfo(R.mipmap.music1,"桃花诺","G.E.M.邓紫棋"));
        list.add(new MusicInfo(R.mipmap.music2,"想做你的疯女孩","乔欣"));
        list.add(new MusicInfo(R.mipmap.music3,"Flaws","Litany"));

        List<MusicInfo> mList = new ArrayList<>();
        mList.add(new MusicInfo(R.mipmap.music3,"There For You","Martin Garrix / Troye Sivan"));
        mList.add(new MusicInfo(R.mipmap.music4,"阿婆说","陈一发儿"));
        mList.add(new MusicInfo(R.mipmap.music5,"咖喱咖喱","牛奶咖啡"));

        FriendRecyclerAdapter adapter = new FriendRecyclerAdapter(list);
        FriendRecyclerAdapter mAdapter = new FriendRecyclerAdapter(mList);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        LinearLayoutManager mManager = new LinearLayoutManager(this);
        rvLikeFriendActivity.setLayoutManager(manager);
        rvListenFriendActivity.setLayoutManager(mManager);
        rvLikeFriendActivity.setAdapter(adapter);
        rvListenFriendActivity.setAdapter(mAdapter);

        ivBackFriendActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

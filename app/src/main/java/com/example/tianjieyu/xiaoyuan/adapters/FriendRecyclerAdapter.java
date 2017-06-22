package com.example.tianjieyu.xiaoyuan.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tianjieyu.xiaoyuan.beans.MusicInfo;
import com.example.tianjieyu.xiaoyuan.R;

import java.util.List;

/**
 * Created by tianjieyu on 2017/6/21.
 */

public class FriendRecyclerAdapter extends RecyclerView.Adapter<FriendRecyclerAdapter.ViewHolder> {
    private List<MusicInfo> list;

    public FriendRecyclerAdapter(List<MusicInfo> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_item_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getPic());
        holder.tvTitle.setText(list.get(position).getTitle());
        holder.tvAuthor.setText(list.get(position).getAuthor());
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvTitle;
        TextView tvAuthor;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_friend_item_layout);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title_friend_item_layout);
            tvAuthor = (TextView) itemView.findViewById(R.id.tv_author_friend_item_layout);
        }
    }
}

package com.example.tianjieyu.xiaoyuan.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tianjieyu.xiaoyuan.R;
import com.example.tianjieyu.xiaoyuan.activities.LiaoYiXiaActivity;

import java.util.List;

/**
 * data:2017/6/21
 * author:郭彦君(Administrator)
 * function:
 */
public class LiaoYiXiaRecycleAdapter extends RecyclerView.Adapter<LiaoYiXiaRecycleAdapter.ViewHolder> {

    private List<String> name;
    private Context mContext;


    public LiaoYiXiaRecycleAdapter(List<String> name, Context mContext) {
        this.name = name;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.liaoyiixa_item, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(name.get(position));

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;

        public ViewHolder(View itemView) {

            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv_liaoyixia_item_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, LiaoYiXiaActivity.class);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}

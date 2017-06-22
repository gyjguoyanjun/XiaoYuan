package com.example.tianjieyu.xiaoyuan.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tianjieyu.xiaoyuan.R;

/**
 * data:2017/6/21
 * author:郭彦君(Administrator)
 * function:
 */
public class MyfollowRecycleAdapter extends RecyclerView.Adapter<MyfollowRecycleAdapter.ViewHolder> {

    private String name;

    public MyfollowRecycleAdapter(String name) {
        this.name = name;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.follow_item_layout, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(name);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;

        public ViewHolder(View itemView) {

            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.follow_item_name);
        }
    }
}

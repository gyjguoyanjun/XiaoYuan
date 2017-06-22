package com.example.tianjieyu.xiaoyuan.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.tianjieyu.xiaoyuan.R;
import com.example.tianjieyu.xiaoyuan.beans.Bean;

import java.util.List;

/**
 * 类用途:
 * 作者:崔涵淞
 * 时间: 2017/6/21 15:50.
 */

public class TouXiangAdapter extends RecyclerView.Adapter<TouXiangAdapter.ViewHolder> {
    boolean is_in_action_mode=false;
    //点击位置
    private int layoutPosition;
    //点击
    private OnItemClickListener mOnItemClickListener;


    //点击
    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    //点击监听接口
    public interface OnItemClickListener {
        void onItemClick(ViewHolder holder, int position);
    }

    private Context content;
    private List<Bean> picList;

    public TouXiangAdapter(Context content, List<Bean> picList) {
        this.content = content;
        this.picList = picList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.touxiang_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Glide.with(content).load(picList.get(position).getPic())
                .into(holder.image);
       /* if (mOnItemClickListener != null) {
            //为ItemView设置监听器
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layoutPosition = holder.getLayoutPosition(); // 1
                    mOnItemClickListener.onItemClick(holder, layoutPosition); // 2

                    if (picList.get(position).isFlag() == true){
                        holder.image1.setVisibility(View.VISIBLE);
                        picList.get(position).isFlag();
                    }else {
                        holder.image1.setVisibility(View.INVISIBLE);
                    }
                }
            });
        }*/
        /*flag = true;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (flag){
                   holder.image1.setVisibility(View.VISIBLE);
                   flag = false;
               }else{
                   holder.image1.setVisibility(View.GONE);
                   flag = true;
               }
           }
       });*/


    }

    @Override
    public int getItemCount() {
        return picList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        //public CheckBox mCheckBox;
        private ImageView image1;
        private boolean flag;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image_touxiang);
           // mCheckBox = (CheckBox) itemView.findViewById(R.id.cb_touxiang_item);
            image1 = (ImageView) itemView.findViewById(R.id.cb_touxiang_item);

            flag = false;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (flag){
                        image1.setVisibility(View.VISIBLE);
                        flag = false;
                    }else{
                        image1.setVisibility(View.GONE);
                        flag = true;
                    }
                }
            });
        }
    }
}

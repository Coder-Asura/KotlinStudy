package com.asura.kotlinstudy;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Liuxd on 2017/9/1 15:25.
 * 列表适配器
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] mStrings;
    private CallBack mCallBack;

    public MyAdapter(String[] skillNames, CallBack callBack) {
        this.mStrings = skillNames;
        this.mCallBack = callBack;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.btn_skillName.setText(mStrings[holder.getAdapterPosition()]);
        holder.btn_skillName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCallBack != null) {
                    mCallBack.onItemClick(view, holder.getAdapterPosition());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mStrings.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public Button btn_skillName;

        public MyViewHolder(View itemView) {
            super(itemView);
            btn_skillName = itemView.findViewById(R.id.btn_skillName);
        }
    }

    public interface CallBack {
        void onItemClick(View itemView, int position);
    }
}




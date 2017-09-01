package com.asura.kotlinstudy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Liuxd on 2017/9/1 15:16.
 */
public class MyActivity extends AppCompatActivity {
    private RecyclerView rv_ktSkill;
    private RecyclerView.Adapter mAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_ktSkill= (RecyclerView) findViewById(R.id.rv_ktSkill);
        rv_ktSkill.setAdapter(mAdapter);
    }
//    class  MyAdapter extends RecyclerView.Adapter{
//
//        @Override
//        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            return null;
//        }
//
//        @Override
//        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//
//        }
//
//        @Override
//        public int getItemCount() {
//            return 0;
//        }
//    }
}

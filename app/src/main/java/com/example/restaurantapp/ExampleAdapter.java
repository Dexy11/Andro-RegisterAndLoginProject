package com.example.restaurantapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private ArrayList<DishItems> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;


        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.dish_list_img);
            mTextView1 = itemView.findViewById(R.id.tv_line1);
            mTextView2 = itemView.findViewById(R.id.tv_line2);
        }
    }

    public ExampleAdapter(ArrayList<DishItems> exampleList){
        mExampleList = exampleList;

    }
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dish_items, parent,false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;







    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {

        DishItems currentItem = mExampleList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}

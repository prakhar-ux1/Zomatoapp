package com.example.zomato_c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>  {
    private String dataset_1[],dataset_2[];
    private Context context;
    private int imageset_1[];
    private double rating[];
    public MyAdapter(Context context,String A[],String b[],int image1[],double  rating[]){
        this.context=context;
        dataset_1=A;
        dataset_2=b;
        imageset_1=image1;
        this.rating=rating;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater lin = LayoutInflater.from(this.context);
        View view =lin.inflate(R.layout.rowlayout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.title.setText(dataset_1[position]);
        holder.detail.setText(dataset_2[position]);
        holder.icon.setImageResource(imageset_1[position]);
        holder.rate.setText(String.valueOf(rating[position]));
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title,detail,rate;
        ImageView icon;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);
            detail =itemView.findViewById(R.id.detail);
            icon=itemView.findViewById(R.id.op1);
            rate=itemView.findViewById(R.id.rating);



        }
    }
}

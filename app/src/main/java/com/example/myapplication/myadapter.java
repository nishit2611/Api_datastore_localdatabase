package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder>
{
    List<responsemodel> data;

    public myadapter(List<responsemodel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
         holder.tit.setText(data.get(position).getTitle());
        holder.des.setText(data.get(position).getDesig());
        Glide.with(holder.tit.getContext()).load("https://me-20-18-ga-01.inextrix.com/MEGA/api/images/"+data.get(position).getImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
       ImageView image;
       TextView tit,des;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.img);
            tit=itemView.findViewById(R.id.title1);
            des=itemView.findViewById(R.id.des);

        }
    }
}

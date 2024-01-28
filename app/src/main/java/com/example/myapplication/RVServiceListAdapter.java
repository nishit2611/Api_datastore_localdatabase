package com.example.retro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class RVServiceListAdapter extends RecyclerView.Adapter<RVServiceListAdapter.ViewHolder> {

    Context context;
    ArrayList<ServicesList> servicesLists;
    public RVServiceListAdapter(Context context,ArrayList<ServicesList> arrayList) {
             this.context = context;
             this.servicesLists=arrayList;
    }

    @NotNull
    @Override
    public RVServiceListAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.singlerow,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RVServiceListAdapter.ViewHolder holder, int position) {
              holder.bind(servicesLists.get(position));
    }

    @Override
    public int getItemCount() {
        return servicesLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView id,title,des;
        private ImageView image;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.id);
            title=itemView.findViewById(R.id.title1);
            des=itemView.findViewById(R.id.des);
            image=itemView.findViewById(R.id.img);

        }
        public void bind(ServicesList servicesList){
             id.setText(servicesList.getId()+"");
             title.setText(servicesList.getTitle());
             des.setText(servicesList.getDesig());
            Glide.with(context).load(servicesList.getImage()).into(image);
        }
    }
}

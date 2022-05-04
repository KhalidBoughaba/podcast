package com.example.podchikh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {

    List<responsemodel> data;

    public myadapter(List<responsemodel> data) {

        this.data = data;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.category.setText(data.get(position).getCategory());
        Glide.with(holder.category.getContext()).load("https://podkhotabae.000webhostapp.com/backEnd_podcast/images/"+data.get(position).getImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView category;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            category=itemView.findViewById(R.id.category);
        }
    }
}

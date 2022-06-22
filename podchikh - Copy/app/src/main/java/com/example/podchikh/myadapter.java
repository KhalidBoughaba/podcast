package com.example.podchikh;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {

    model data[];
    Context context;

    public myadapter(model[] data,Context mycontex) {
        this.data = data;
        this.context=mycontex;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);
        return new myviewholder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.category.setText(data[position].getCategory());
        Glide.with(holder.category.getContext()).load("https://podkhotabae.000webhostapp.com/backEnd_podcast/images/"+data[position].getImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class myviewholder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView category;
        CardView card;


        public myviewholder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image);
            category=itemView.findViewById(R.id.category);

            card=(CardView)itemView.findViewById(R.id.card);

            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    image=itemView.findViewById(R.id.image);

                    Intent intent = new Intent();
                    intent.setClass(view.getContext(), subCategory.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("image", image.getContext().toString());
                    intent.putExtras(bundle);

                    context.startActivity(intent);
                }
            });
        }
    }
}

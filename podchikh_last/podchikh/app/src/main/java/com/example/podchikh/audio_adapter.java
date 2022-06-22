package com.example.podchikh;


import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class audio_adapter extends RecyclerView.Adapter<audio_adapter.myviewholder> {

     LinearLayoutCompat li;
    amodel data[];
    Context context;

    public audio_adapter(amodel[] data, Context mycontex) {
        this.data = data;
        this.context=mycontex;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.audio_row,parent,false);
        return new myviewholder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.category.setText(data[position].getTitle());
        //Glide.with(holder.category.getContext()).load("http://192.168.1.2/backEnd/images/"+data[position].getImage()).into(holder.image);

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

            image=itemView.findViewById(R.id.image2);
            category=itemView.findViewById(R.id.sub_category);

            li=itemView.findViewById(R.id.li);

            li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   // Log.e("pos",""+data[getAdapterPosition()].getImage());
                    image=itemView.findViewById(R.id.image);
                   // PreferenceManager.getDefaultSharedPreferences(itemView.getContext()).edit().putString("id", ""+data[getAdapterPosition()].getImage()).apply();
                   /* Intent intent = new Intent();
                    intent.setClass(view.getContext(), subCategory.class);*/
                    /*Bundle bundle = new Bundle();
                    bundle.putString("image", image.getContext().toString());
                    intent.putExtras(bundle);*/

                   // context.startActivity(intent);
                }
            });
        }
    }
}

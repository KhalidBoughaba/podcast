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
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class mysubadapter extends RecyclerView.Adapter<mysubadapter.myviewholder>{

    private final Context context;
    static smodel[] data;


    public mysubadapter(smodel[] data,Context context) {
        this.data = data;
        this.context = context;
    }



    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.subsinglerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        String id = PreferenceManager.getDefaultSharedPreferences(context).getString("photo_name", "");
        Log.e("id",id);
        holder.sub_category.setText(data[position].getSub_category());
        Glide.with(holder.image.getContext()).load("https://podkhotabae.000webhostapp.com/backEnd/images/"+id).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    static class myviewholder extends RecyclerView.ViewHolder{

        private final LinearLayoutCompat li;
        ImageView image;
        TextView sub_category;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image2);
            sub_category=itemView.findViewById(R.id.sub_category);

            li=itemView.findViewById(R.id.li);

            li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   // Log.e("pos",""+data[getAdapterPosition()].getImage());

                    PreferenceManager.getDefaultSharedPreferences(itemView.getContext()).edit().putString("category_id", ""+data[getAdapterPosition()].getId()).apply();
                    Intent intent = new Intent();
                    intent.setClass(view.getContext(), Audio_Activity.class);


                    view.getContext().startActivity(intent);
                }
            });

        }
    }
}

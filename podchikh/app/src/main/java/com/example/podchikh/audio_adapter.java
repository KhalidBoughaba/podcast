package com.example.podchikh;


import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
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

import java.io.IOException;

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

                    /*MediaPlayer mediaPlayer = new MediaPlayer();
                    try{
                        mediaPlayer.setDataSource("https://podkhotabae.000webhostapp.com/backEnd/audios/%d8%a7%d8%b1%d8%ad%d9%85%d9%88%d9%87%d9%85%20%d9%83%d9%8a%20%d9%8a%d8%b1%d8%ad%d9%85%d9%83%d9%85%20%d9%85%d9%86%20%d9%81%d9%8a%20%d8%a7%d9%84%d8%b3%d9%85%d8%a7%d8%a1%20!%20%d9%83%d9%84%d9%85%d8%a7%d8%aa%20%d8%aa%d8%a8%d9%83%d9%8a%20%d8%a7%d9%84%d8%ad%d8%ac%d8%b1%20%d9%84%d9%84%d8%af%d8%a7%d8%b9%d9%8a%d8%a9%20!%20%d9%85%d8%ad%d9%85%d9%88%d8%af%20%d8%a7%d9%84%d8%ad%d8%b3%d9%86%d8%a7%d8%aa.mp3");
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                            @Override
                            public void onPrepared(MediaPlayer mediaPlayer) {
                                mediaPlayer.start();
                            }
                        });


                    }catch (IOException e){
                        e.printStackTrace();
                    }*/

                }
            });
        }
    }
}

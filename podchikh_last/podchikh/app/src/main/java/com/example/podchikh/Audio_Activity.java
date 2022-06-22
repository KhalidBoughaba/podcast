package com.example.podchikh;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Audio_Activity extends AppCompatActivity {
    private static final String url = "https://podkhotabae.000webhostapp.com/backEnd/api/getAudioBySpeaker.php";
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_list);


        recview=(RecyclerView)findViewById(R.id.recview);

        recview.setLayoutManager(new LinearLayoutManager(this));
     /*   ImageView img = (ImageView) findViewById(R.id.image);
        Bundle bundle=getIntent().getExtras();
        String image=bundle.getString("image");*/



        processdata();
    }


    public void processdata(){
        String id = PreferenceManager.getDefaultSharedPreferences(this).getString("id", "");
        String category_id = PreferenceManager.getDefaultSharedPreferences(this).getString("category_id", "");
        String urld = "https://podkhotabae.000webhostapp.com/backEnd/api/getAudioBySpeaker.php?id="+id+"&uid="+category_id;
        Log.e("url",urld);

        StringRequest request =new StringRequest(urld, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                GsonBuilder builder=new GsonBuilder();
                Gson gson=builder.create();
                amodel data[]=gson.fromJson(response,amodel[].class);

                audio_adapter adapter=new audio_adapter(data, Audio_Activity.this);
                recview.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Audio_Activity.this,error.toString(),Toast.LENGTH_LONG).show();
            }
        }
        );

        RequestQueue queue = Volley.newRequestQueue(Audio_Activity.this);
        queue.add(request);

    }




}
package com.example.ssanusi.cryptoretro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Adapter;
import android.widget.Toast;

import com.example.ssanusi.cryptoretro.Adapter.MyAdapter;
import com.example.ssanusi.cryptoretro.Model.CONSTANT;
import com.example.ssanusi.cryptoretro.Model.Data;
import com.example.ssanusi.cryptoretro.Model.ResponseData;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ArrayList<Data> data;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/bins/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);



        Call<ResponseData> call = api.getData();
        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                recyclerView = findViewById(R.id.rv);

               LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager
                       .VERTICAL,false);
               recyclerView.setLayoutManager(layoutManager);
                data = response.body().getData();

                MyAdapter myAdapter = new MyAdapter(data);
                recyclerView.setAdapter(myAdapter);

                DividerItemDecoration design = new DividerItemDecoration (recyclerView.getContext(),layoutManager.getOrientation());
                recyclerView.addItemDecoration(design);

                Log.d("ffdfd",response.body().getData().get(0).getName());
           }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {
                Toast.makeText(getApplicationContext(),
                        t.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}

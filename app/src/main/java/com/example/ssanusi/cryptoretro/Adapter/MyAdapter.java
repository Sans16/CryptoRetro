package com.example.ssanusi.cryptoretro.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ssanusi.cryptoretro.Model.Data;
import com.example.ssanusi.cryptoretro.Model.ResponseData;
import com.example.ssanusi.cryptoretro.R;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.callback.Callback;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    ArrayList<Data> data1;

    public MyAdapter( ArrayList<Data> data) { this.data1 = data; }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Data collector = data1.get(position);
        TextView name,volume,price,website, totalSupply,symbol,rank,circSupply;

        name = holder.name;
        volume = holder.volume;
        price = holder.price;
        website = holder.website;
        totalSupply = holder.totalSupply;
        symbol = holder.symbol;
        rank = holder.rank;
        circSupply = holder.circSupply;

        name.setText(collector.getName());
        volume.setText(collector.getVolume_24h());
        price.setText(collector.getPrice());
        website.setText(collector.getWebsite_slug());
        totalSupply.setText(collector.getTotal_supply());
        symbol.setText(collector.getSymbol());
        rank.setText(collector.getRank());
        circSupply.setText(collector.getCirculating_supply());
    }

    @Override
    public int getItemCount() {
        return data1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name,volume,price,website, totalSupply,symbol,rank,circSupply;

        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            volume = itemView.findViewById(R.id.volume);
            price = itemView.findViewById(R.id.price);
            website = itemView.findViewById(R.id.website);
            totalSupply = itemView.findViewById(R.id.supply);
            symbol = itemView.findViewById(R.id.symbol);
            rank = itemView.findViewById(R.id.rank);
            circSupply = itemView.findViewById(R.id.circulating);
        }
    }
}

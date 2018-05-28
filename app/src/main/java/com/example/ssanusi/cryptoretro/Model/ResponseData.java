package com.example.ssanusi.cryptoretro.Model;

import java.util.ArrayList;

public class ResponseData {

    ArrayList<Data> data;

    public ResponseData(ArrayList<Data> data) {
        this.data = data;
    }

    public ArrayList<Data> getData() { return data; }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }
}

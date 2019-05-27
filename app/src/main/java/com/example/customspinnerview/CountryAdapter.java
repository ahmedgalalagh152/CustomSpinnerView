package com.example.customspinnerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CountryAdapter extends ArrayAdapter<Country> {
    public CountryAdapter( Context context,  ArrayList<Country> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        convertView=LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner,parent,false);
        TextView countryName=convertView.findViewById(R.id.txt);
        ImageView imgId=convertView.findViewById(R.id.img);
        Country country=getItem(position);
        countryName.setText(country.getCountryName());
        imgId.setImageResource(country.getImageId());
        return convertView;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner,parent,false);
        TextView countryName=convertView.findViewById(R.id.txt);
        Country country=getItem(position);
        countryName.setText(country.getCountryName());
        return convertView;
    }
}



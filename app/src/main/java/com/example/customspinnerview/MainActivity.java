package com.example.customspinnerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Boolean flage =true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Country> countries=new ArrayList<>();
        countries.add(new Country("united states",R.drawable.unitedstates));
        countries.add(new Country("England",R.drawable.england));
        countries.add(new Country("Egypt",R.drawable.egypt));
        countries.add(new Country("china",R.drawable.china));
        countries.add(new Country("Brazil",R.drawable.brazil));
        countries.add(new Country("australia",R.drawable.australia));

        spinner=findViewById(R.id.spinner);
        CountryAdapter adapter=new CountryAdapter(this,countries);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Country country = (Country) spinner.getAdapter().getItem(position);
                if (flage) {
                    flage = false;
                } else {
                    Toast.makeText(MainActivity.this, country.getCountryName(), Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}

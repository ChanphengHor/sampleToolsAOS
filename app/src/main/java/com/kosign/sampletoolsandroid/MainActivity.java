package com.kosign.sampletoolsandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerTax();
    }
    private void spinnerTax(){
        String[] taxsItem = {"Hello", "Hello1", "Hello2"};
        Spinner spinner = findViewById(R.id.my_spinner);
        ArrayAdapter<String> spinAdapter = new ArrayAdapter<>(this, R.layout.item_spinner_item_dropdown, taxsItem);
        spinAdapter.setDropDownViewResource(R.layout.item_dropdown_resource);
        spinner.setAdapter(spinAdapter);
        //spinner.setSelection(0);
        spinner.setPrompt("Select tov");
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }
}

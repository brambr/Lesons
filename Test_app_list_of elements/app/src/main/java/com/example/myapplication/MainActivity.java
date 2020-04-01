package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pl_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pl_list=findViewById(R.id.tv_pl_names);
        pl_list.setText("");
        String [] names  ={"Java", "Python", "Ruby","list","russian","ada","c","c++"};
        for (String name: names){
            pl_list.append(name+"\n");
            // \n new row for each language
        }
    }
}

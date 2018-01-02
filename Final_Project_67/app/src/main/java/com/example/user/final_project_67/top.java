package com.example.user.final_project_67;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class top extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        Button drink = (Button)findViewById(R.id.drink);
        Button drink1 = (Button)findViewById(R.id.drink1);
        Button drink2 = (Button)findViewById(R.id.drink2);
        Button back = (Button)findViewById(R.id.back);

        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(top.this,drinkview.class);
                startActivity(i);

            }
        });

        drink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(top.this,c.class);
                startActivity(i);
            }
        });

        drink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(top.this,view.class);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(top.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}

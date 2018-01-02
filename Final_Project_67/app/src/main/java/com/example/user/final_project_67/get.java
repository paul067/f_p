package com.example.user.final_project_67;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class get extends AppCompatActivity {
    int n,m;
    String l;
    int h;
    SQLiteDatabase oh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);

        Button d_back = (Button)findViewById(R.id.d_back);

        d_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(get.this,drinkview.class);
                startActivity(i);
            }
        });

        Bundle b = this.getIntent().getExtras();
        n=b.getInt("num");
        m=b.getInt("grid");

        Data[] juice_data = new Data[9];
        for(int i=0;i<juice_data.length;i++)
        {
            juice_data[i] = new Data();
        }
        juice_data[0].photo = R.drawable.g1;
        juice_data[0].name ="西瓜汁";
        juice_data[1].photo = R.drawable.g2;
        juice_data[1].name ="芒果汁";
        juice_data[2].photo = R.drawable.g3;
        juice_data[2].name ="奇異果汁";
        juice_data[3].photo = R.drawable.g4;
        juice_data[3].name ="芭樂汁";
        juice_data[4].photo = R.drawable.g5;
        juice_data[4].name ="柳橙汁";
        juice_data[5].photo = R.drawable.g6;
        juice_data[5].name ="香蕉汁";
        juice_data[6].photo = R.drawable.g7;
        juice_data[6].name ="葡萄汁";
        juice_data[7].photo = R.drawable.g8;
        juice_data[7].name ="檸檬汁";
        juice_data[8].photo = R.drawable.g9;
        juice_data[8].name ="蘋果汁";


        Data[] tea_data = new Data[6];
        for(int i=0;i<tea_data.length;i++)
        {
            tea_data[i] = new Data();
        }
        tea_data[0].photo = R.drawable.f1;
        tea_data[0].name ="白茶";
        tea_data[1].photo = R.drawable.f2;
        tea_data[1].name ="青茶";
        tea_data[2].photo = R.drawable.f3;
        tea_data[2].name ="紅茶";
        tea_data[3].photo = R.drawable.f4;
        tea_data[3].name ="黃茶";
        tea_data[4].photo = R.drawable.f5;
        tea_data[4].name ="黑茶";
        tea_data[5].photo = R.drawable.f6;
        tea_data[5].name ="綠茶";


        Data[] milk_data = new Data[7];
        for(int i=0;i<milk_data.length;i++)
        {
            milk_data[i] = new Data();
        }
        milk_data[0].photo = R.drawable.e1;
        milk_data[0].name ="奶茶";
        milk_data[1].photo = R.drawable.e2;
        milk_data[1].name ="巧克力奶茶";
        milk_data[2].photo = R.drawable.e3;
        milk_data[2].name ="布丁乃茶";
        milk_data[3].photo = R.drawable.e4;
        milk_data[3].name ="花生奶茶";
        milk_data[4].photo = R.drawable.e5;
        milk_data[4].name ="珍珠奶茶";
        milk_data[5].photo = R.drawable.e6;
        milk_data[5].name ="草莓奶茶";
        milk_data[6].photo = R.drawable.e7;
        milk_data[6].name ="薄荷奶茶";

        Data[] coffee_data = new Data[5];
        for(int i=0;i<coffee_data.length;i++)
        {
            coffee_data[i] = new Data();
        }
        coffee_data[0].photo = R.drawable.d1;
        coffee_data[0].name ="咖啡";
        coffee_data[1].photo = R.drawable.d2;
        coffee_data[1].name ="卡布奇諾";
        coffee_data[2].photo = R.drawable.d3;
        coffee_data[2].name ="拿鐵";
        coffee_data[3].photo = R.drawable.d4;
        coffee_data[3].name ="焦糖瑪奇朵";
        coffee_data[4].photo = R.drawable.d5;
        coffee_data[4].name ="摩卡";


        Data[] sorbet_data = new Data[8];
        for(int i=0;i<sorbet_data.length;i++)
        {
            sorbet_data[i] = new Data();
        }
        sorbet_data[0].photo = R.drawable.c1;
        sorbet_data[0].name ="西瓜冰沙";
        sorbet_data[1].photo = R.drawable.c2;
        sorbet_data[1].name ="芒果冰沙";
        sorbet_data[2].photo = R.drawable.c3;
        sorbet_data[2].name ="奇異果冰沙";
        sorbet_data[3].photo = R.drawable.c4;
        sorbet_data[3].name ="抹茶冰沙";
        sorbet_data[4].photo = R.drawable.c5;
        sorbet_data[4].name ="紅豆冰沙";
        sorbet_data[5].photo = R.drawable.c6;
        sorbet_data[5].name ="草莓冰沙";
        sorbet_data[6].photo = R.drawable.c7;
        sorbet_data[6].name ="焦糖瑪奇朵冰沙";
        sorbet_data[7].photo = R.drawable.c8;
        sorbet_data[7].name ="綠豆冰沙";


        Data[] yoghurt_data = new Data[5];
        for(int i=0;i<yoghurt_data.length;i++)
        {
            yoghurt_data[i] = new Data();
        }
        yoghurt_data[0].photo = R.drawable.a2;
        yoghurt_data[0].name ="西瓜優酪乳";
        yoghurt_data[1].photo = R.drawable.a3;
        yoghurt_data[1].name ="紅豆香蕉優酪乳";
        yoghurt_data[2].photo = R.drawable.a4;
        yoghurt_data[2].name ="草莓優酪乳";
        yoghurt_data[3].photo = R.drawable.a5;
        yoghurt_data[3].name ="葡萄優酪乳";
        yoghurt_data[4].photo = R.drawable.a1;
        yoghurt_data[4].name ="優酪乳";


        Data[] spectial_data = new Data[8];
        for(int i=0;i<spectial_data.length;i++)
        {
            spectial_data[i] = new Data();
        }
        spectial_data[0].photo = R.drawable.b1;
        spectial_data[0].name ="特調百香紅茶";
        spectial_data[1].photo = R.drawable.b2;
        spectial_data[1].name ="特調百香綠茶";
        spectial_data[2].photo = R.drawable.b3;
        spectial_data[2].name ="特調柳橙牛奶";
        spectial_data[3].photo = R.drawable.b4;
        spectial_data[3].name ="特調雪碧";
        spectial_data[4].photo = R.drawable.b5;
        spectial_data[4].name ="特調蜂蜜紅茶";
        spectial_data[5].photo = R.drawable.b6;
        spectial_data[5].name ="特調蜂蜜綠茶";
        spectial_data[6].photo = R.drawable.b7;
        spectial_data[6].name ="特調話梅綠茶";
        spectial_data[7].photo = R.drawable.b8;
        spectial_data[7].name ="酸梅烏龍茶";



        ImageView view = (ImageView)findViewById(R.id.d_view);
        final TextView text = (TextView)findViewById(R.id.d_name);
        final TextView price = (TextView)findViewById(R.id.textview13);
        final EditText count = (EditText)findViewById(R.id.ed_num);
        final EditText memory = (EditText)findViewById(R.id.d_m);
        final TextView sum_m= (TextView)findViewById(R.id.d_sum);
        switch(m)
        {
            case 1:
                view.setImageResource(juice_data[n].photo);
                text.setText(juice_data[n].name);
                price.setText(juice_data[n].price);
                break;
            case 2:
                view.setImageResource(tea_data[n].photo);
                text.setText(tea_data[n].name);
                price.setText(tea_data[n].price);
                break;
            case 3:
                view.setImageResource(milk_data[n].photo);
                text.setText(milk_data[n].name);
                price.setText(milk_data[n].price);
                break;
            case 4:
                view.setImageResource(coffee_data[n].photo);
                text.setText(coffee_data[n].name);
                price.setText(coffee_data[n].price);
                break;
            case 5:
                view.setImageResource(sorbet_data[n].photo);
                text.setText(sorbet_data[n].name);
                price.setText(sorbet_data[n].price);
                break;
            case 6:
                view.setImageResource(yoghurt_data[n].photo);
                text.setText(yoghurt_data[n].name);
                price.setText(yoghurt_data[n].price);
                break;
            case 7:
                view.setImageResource(spectial_data[n].photo);
                text.setText(spectial_data[n].name);
                price.setText(spectial_data[n].price);
                break;
        }

        count.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(count.getText().length()>0)
                {String n;
                    int k,sum;
                    n=count.getText().toString();
                    k=Integer.parseInt(n);
                    l = price.getText().toString();
                    h=Integer.parseInt(l);
                    sum = k*h;
                    sum_m.setText(""+sum);}
                else
                {
                    sum_m.setText(""+0); }
            }
        });

        DB o = new DB(this);
        oh = o.getWritableDatabase();

        Button send = (Button)findViewById(R.id.d_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count.getText().toString().equals("")||count.getText().toString().equals(""+0))
                {
                    Toast.makeText(get.this,"輸入錯誤", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ContentValues cv = new ContentValues();
                    cv.put("title",text.getText().toString());
                    cv.put("count",count.getText().toString());
                    cv.put("sum",sum_m.getText().toString());
                    cv.put("other",memory.getText().toString());
                    oh.insert("orderTable",null,cv);
                    Intent i = new Intent();
                    i.setClass(get.this,drinkview.class);
                    startActivity(i);
                    finish();
                }
            }
        });

    }
    class Data
    {
        int photo;
        String name;
        String price;
    }
}

